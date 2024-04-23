package com.chikipack.currencyexchange.api;

import com.chikipack.currencyexchange.models.CurrencyDTO;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Service {

    private HttpClient client;
    private Gson gson;
    private final String apiKey = "0f1a99cdd978c41afcbb0693";

    public Service() {
        this.client = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public double sendGetRequest(String from, String to) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+from+"/"+to))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            CurrencyDTO currency = gson.fromJson(response.body(), CurrencyDTO.class);
            return currency.conversion_rate();
        } else {
            throw new RuntimeException("Failed : HTTP error code : " + response.statusCode());
        }
    }
}

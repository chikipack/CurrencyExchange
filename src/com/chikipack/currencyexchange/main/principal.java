package com.chikipack.currencyexchange.main;

import com.chikipack.currencyexchange.api.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import com.chikipack.currencyexchange.logic.Exchange;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class principal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int salir = 1;

        Service service = new Service();
        Gson gson = new Gson();

//

        while(salir != 0) {
            System.out.println("***********************");
            System.out.println("Bienvenido al conversor de moneda");
            System.out.println("Selecciona un tipo de cambio ");
            System.out.println("1) Dolar(USD) -> ");
            System.out.println("2) Peso Mexicano(MXN) -> Dolar(USD)");
            System.out.println("3) Dolar(USD) -> Peso Chileno(CLP)");
            System.out.println("4) Peso Chileno(CLP) -> Dolar(USD)");
            System.out.println("5) Dolar(USD) -> Yen Japones(JPY)");
            System.out.println("6) Yen Japones (JPY) -> Dolar(USD)");
            int option = userInput.nextInt();
            String from = "";
            String to = "";
            Double convertir;

            Exchange x = new Exchange();

            switch (option){
                case 0:
                    salir = 0;
                    break;
                case 1:
                    from = "USD";
                    to = "MXN";
                    System.out.println("Cuanto quieres convertir");
                    convertir = userInput.nextDouble();
                    try {
                        double response = service.sendGetRequest(from, to);
//                        System.out.println("Response from API: " + response);
                        System.out.println(x.transform(convertir, response));
                    } catch (InterruptedException | IOException e) {
                        e.printStackTrace();
                        System.out.println("Error during API request");
                    }
                    break;
                case 2:
                    from = "MXN";
                    to = "USD";

                    try {
                        double response = service.sendGetRequest(from, to);
                        System.out.println("Response from API: " + response);
                    } catch (InterruptedException | IOException e) {
                        e.printStackTrace();
                        System.out.println("Error during API request");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }

    }
}

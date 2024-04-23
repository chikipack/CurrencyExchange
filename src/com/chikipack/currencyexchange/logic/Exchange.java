package com.chikipack.currencyexchange.logic;

import com.chikipack.currencyexchange.api.Service;

import java.io.IOException;

public class Exchange {

    Service service = new Service();
    public Double transform(double cantidad, double conversion_rate){
        return  cantidad*conversion_rate;
    }

    public Double getConversionRate(String from, String to){
        try {
            return service.sendGetRequest(from, to);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
            System.out.println("Error during API request");
        }
        return null;
    }

}

package com.chikipack.currencyexchange.logic;

public class Exchange {
    public Double transform(double cantidad, double conversion_rate){
        return  cantidad*conversion_rate;
    }

}

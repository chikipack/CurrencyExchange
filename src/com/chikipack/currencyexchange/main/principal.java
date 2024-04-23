package com.chikipack.currencyexchange.main;

import com.chikipack.currencyexchange.api.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import com.chikipack.currencyexchange.logic.Exchange;
public class principal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int salir = 1;

        Service service = new Service();

        while(salir != 0) {
            System.out.println("***********************");
            System.out.println("Bienvenido al conversor de moneda");
            System.out.println("Selecciona un tipo de cambio ");
            System.out.println("1) Dolar(USD) -> Peso Mexicano(MXN)");
            System.out.println("2) Peso Mexicano(MXN) -> Dolar(USD)");
            System.out.println("3) Dolar(USD) -> Peso Chileno(CLP)");
            System.out.println("4) Peso Chileno(CLP) -> Dolar(USD)");
            System.out.println("5) Dolar(USD) -> Yen Japones(JPY)");
            System.out.println("6) Yen Japones (JPY) -> Dolar(USD)");
            int option = userInput.nextInt();
            double cantidadAConvertir;
            double conversionRate;
            Exchange exchange = new Exchange();

            switch (option){
                case 0:
                    salir = 0;
                    break;
                case 1:
                    System.out.println("Cuanto quieres convertir");
                    cantidadAConvertir = userInput.nextDouble();
                    conversionRate = exchange.getConversionRate("USD", "MXN");
                    System.out.println(cantidadAConvertir +" USD son: "+ String.format("%.2f", exchange.transform(cantidadAConvertir, conversionRate)) +" MXN");
                    break;
                case 2:
                    System.out.println("Cuanto quieres convertir");
                    cantidadAConvertir = userInput.nextDouble();
                    conversionRate = exchange.getConversionRate("MXN", "USD");
                    System.out.println(cantidadAConvertir +" MXN son: "+ String.format("%.2f", exchange.transform(cantidadAConvertir, conversionRate))+" USD");
                    break;
                case 3:
                    System.out.println("Cuanto quieres convertir");
                    cantidadAConvertir = userInput.nextDouble();
                    conversionRate = exchange.getConversionRate("USD", "CLP");
                    System.out.println(cantidadAConvertir +" USD son: "+ String.format("%.2f", exchange.transform(cantidadAConvertir, conversionRate))+" CLP");
                    break;
                case 4:
                    System.out.println("Cuanto quieres convertir");
                    cantidadAConvertir = userInput.nextDouble();
                    conversionRate = exchange.getConversionRate("CLP", "USD");
                    System.out.println(cantidadAConvertir +" CLP son: "+ String.format("%.2f", exchange.transform(cantidadAConvertir, conversionRate))+" USD");
                    break;
                case 5:
                    System.out.println("Cuanto quieres convertir");
                    cantidadAConvertir = userInput.nextDouble();
                    conversionRate = exchange.getConversionRate("USD", "JPY");
                    System.out.println(cantidadAConvertir +" USD son: "+ String.format("%.2f", exchange.transform(cantidadAConvertir, conversionRate))+" JPY");
                    break;
                case 6:
                    System.out.println("Cuanto quieres convertir");
                    cantidadAConvertir = userInput.nextDouble();
                    conversionRate = exchange.getConversionRate("JPY", "USD");
                    System.out.println(cantidadAConvertir +" JPY son: "+ String.format("%.2f", exchange.transform(cantidadAConvertir, conversionRate))+" USD");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }

    }
}

package com.chikipack.currencyexchange.models;

public record CurrencyDTO(String base_code, String target_code, double conversion_rate) {
}

package com.playground.zillar.util;

import java.util.UUID;

public class RandomStringGenerator {

    public static String generateString(int length, String regex) {
        UUID uuid = UUID.fromString(regex);
        return uuid.toString().substring(length);
    }
    
}

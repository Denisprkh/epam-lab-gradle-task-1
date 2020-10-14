package com.epam.utils;

public class StringUtils {

    private static final String MINUS_SIGN = "-";

    private StringUtils(){}

    public static boolean isPositiveNumber(String number) {
        return org.apache.commons.lang3.StringUtils.isNumeric(number) &&
                !org.apache.commons.lang3.StringUtils.contains(number, MINUS_SIGN);
    }
}

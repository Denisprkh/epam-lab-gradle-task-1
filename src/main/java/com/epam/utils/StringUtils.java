package com.epam.utils;

import static org.apache.commons.lang3.StringUtils.*;


public class StringUtils {

    private static final String MINUS_SIGN = "-";

    private StringUtils(){}

    public static boolean isPositiveNumber(String number) {
        return isNumeric(number) &&
                !contains(number, MINUS_SIGN);
    }
}

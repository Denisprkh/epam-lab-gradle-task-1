package com.epam.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void isPositiveNumberTest(){
        boolean isPositive = StringUtils.isPositiveNumber("15");
        assertTrue(isPositive);
    }
}

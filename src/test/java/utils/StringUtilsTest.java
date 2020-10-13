package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    private static final StringUtils stringUtils = new StringUtils();

    @Test
    public void isPositiveNumberTest(){
        boolean isPositive = stringUtils.isPositiveNumber("15");
        assertTrue(isPositive);
    }
}

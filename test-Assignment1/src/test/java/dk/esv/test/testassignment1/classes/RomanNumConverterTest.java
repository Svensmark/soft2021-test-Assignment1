package dk.esv.test.testassignment1.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumConverterTest {

    @Test
    public void testConvertToRomanNumerals() {
       RomanNumConverter c = new RomanNumConverter();
       int input = 123;
       String expected = "CXXIII";
       assertEquals(c.convertToRomanNumerals(input), expected);

       input = 9999;
       expected = "MMMMMMMMMCMXCIX";
        assertEquals(c.convertToRomanNumerals(input), expected);
    }

}
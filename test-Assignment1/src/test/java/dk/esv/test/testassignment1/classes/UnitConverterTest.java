package dk.esv.test.testassignment1.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitConverterTest {

    @Test
    public void testConvertFahrenheitToCelcius() {
        UnitConverter c = new UnitConverter();
        double input = 32;
        double expected = 0;
        assertEquals(c.convert(input, 'F'), expected);

        input = 99;
        expected = 37.22222222222222;
        assertEquals(c.convert(input, 'F'), expected);
    }

    @Test
    public void testConvertCelciusToFahrenheit() {
        UnitConverter c = new UnitConverter();
        double input = 32;
        double expected = 89.6;
        assertEquals(c.convert(input, 'C'), expected);

        input = 99;
        expected = 210.20000000000002;
        assertEquals(c.convert(input, 'C'), expected);
    }

    @Test
    public void testIllegalArgument() {
        UnitConverter c = new UnitConverter();
        try {
            c.convert(0,'H');
        } catch (IllegalArgumentException exception) {
            assertEquals(0,0);
        }

    }

}
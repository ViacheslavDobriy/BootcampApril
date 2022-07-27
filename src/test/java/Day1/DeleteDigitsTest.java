package Day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDigitsTest {

    @Test
    void clearStringTest1() {

        DeleteDigits line = new DeleteDigits();
        String result = line.ClearString("8736428129ijh");
        String expected = "ijh";
        assertEquals(expected, result);

    }

    @Test
    void clearStringTest2() {

        DeleteDigits line = new DeleteDigits();
        String result = line.ClearString("iusd8734rvf8326");
        String expected = "iusdrvf";
        assertEquals(expected, result);

    }

    @Test
    void clearStringTest3() {

        DeleteDigits line = new DeleteDigits();
        String result = line.ClearString("87c6v39jn30");
        String expected = "cvjn";
        assertEquals(expected, result);

    }
}
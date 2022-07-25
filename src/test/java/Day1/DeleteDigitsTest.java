package Day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDigitsTest {

    @Test
    void clearString() {
        DeleteDigits line = new DeleteDigits();
        String result = line.ClearString("8736428129ijh");
        String expected = "ijh";
        Assertions.assertEquals(expected, result);
    }
}
import NumberPrinter.NumberPrinter;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberPrinterTest {

    @Test
    public void testPrintNumbers() {
        // Arrange
        NumberPrinter printer = new NumberPrinter();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Act
        printer.printNumbers();

        // Reset System.out
        System.setOut(originalOut);

        // Assert
        String expectedOutput = "i = 1\n" +
                "i = 2\n" +
                "i = 3\n" +
                "i = 4\n" +
                "i = 5\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}

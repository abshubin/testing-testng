import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Andrew Shubin on 10/10/16.
 */
public class CountdownTest {

    @Test
    public void testCount_happy() throws Exception {
        
        // Arrange
        int testNum = 10;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = fauxCount(testNum);
        
        // Act
        out.reset();
        Countdown.count(testNum);
        String result = out.toString();
        
        // Assert
        assertEquals(result, expected, "ERROR in Countdown.count() -- TESTING input of " + testNum);
    }

    @Test
    public void testCount_high() throws Exception {

        // Arrange
        int testNum = 10000;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = fauxCount(testNum);

        // Act
        out.reset();
        Countdown.count(testNum);
        String result = out.toString();

        // Assert
        assertEquals(result, expected, "ERROR in Countdown.count() -- TESTING input of " + testNum);
    }

    @Test
    public void testCount_small() throws Exception {

        // Arrange
        int testNum = 1;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = fauxCount(testNum);

        // Act
        out.reset();
        Countdown.count(testNum);
        String result = out.toString();

        // Assert
        assertEquals(result, expected, "ERROR in Countdown.count() -- TESTING input of " + testNum);
    }

    @Test
    public void testCount_zero() throws Exception {

        // Arrange
        int testNum = 0;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = fauxCount(testNum);

        // Act
        out.reset();
        Countdown.count(testNum);
        String result = out.toString();

        // Assert
        assertEquals(result, expected, "ERROR in Countdown.count() -- TESTING input of " + testNum);
    }

    @Test
    public void testCount_negative() throws Exception {

        // Arrange
        int testNum = -10;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = fauxCount(testNum);

        // Act
        out.reset();
        Countdown.count(testNum);
        String result = out.toString();

        // Assert
        assertEquals(result, expected, "ERROR in Countdown.count() -- TESTING input of " + testNum);
    }

    private static String fauxCount(int testNum) {

        String output = "";

        for (int i = testNum; i > 0; i--) {
            output += (i + "\n");
        }

        output += "GO!\n";

        return output;
    }

}
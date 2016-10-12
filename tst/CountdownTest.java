import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Andrew Shubin on 10/10/16.
 */
public class CountdownTest {

    @Test
    public void testCount() throws Exception {

        // TODO: write 5 tests using TestNG
        /*
         * At least one must pass.
         * At least one must fail.
         */
        
        // Arrange
        int testNum = 10;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "10\n9\n8\n7\n6\n5\n4\n3\n2\n1\nGO!";
        
        // Act
        Countdown.count(testNum);
        String result = out.toString();
        
        // Assert
        assertEquals(result, expected, "ERROR in Countdown.count()");
    }

}

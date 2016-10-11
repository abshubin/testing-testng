import java.util.InputMismatchException;

/**
 * Created by Andrew Shubin on 10/10/16.
 */
public class Countdown {

    public static void main(String[] args) {
        count(10);
    }

    // Counts down from a positive number
    public static void count(int startNum)
            throws InputMismatchException {
        if (startNum < 0) {
            throw new InputMismatchException();
        }
        else if (startNum == 0) {
            System.out.println("GO!");
        } else {
            System.out.println(startNum);
            count(startNum - 1);
        }
    }

}


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import ucu.edu.ua.apps.task1.ATM;

public class TestATM {

    @Test
    public void testProcessValidAmount() {
        ATM atm = new ATM();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        atm.GetMeMoney(155);

        System.setOut(System.out);
    }


}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {
    @Test
    void must_sum_two_number_together() {
        Calculate sumOperator = new Calculate();

       String theSumOfTwoNumbers = sumOperator.add("5.3", "-2");

        assertEquals("3.3" ,theSumOfTwoNumbers);
    }

    @Test
    void name() {
        Calculate minusOperator = new Calculate();

        String theMinusOfTwoNumbers = minusOperator.add("5.3", "-2");

        assertEquals("3.3" ,theMinusOfTwoNumbers);
    }
}

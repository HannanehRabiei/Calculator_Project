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
    void must_minus_two_number_together() {
        Calculate minusOperator = new Calculate();

        String theMinusOfTwoNumbers = minusOperator.add("5.3", "-2");

        assertEquals("3.3" ,theMinusOfTwoNumbers);
    }

    @Test
    void must_multiply_two_number_together() {
        Calculate multiplyOperator = new Calculate();

        String theMultiplyOfTwoNumbers = multiplyOperator.multiply("10", "10");

        assertEquals("100" ,theMultiplyOfTwoNumbers);
    }

    @Test
    void must_division_two_number_together() {
        Calculate divisionOperator = new Calculate();

        String theDivisionOfTwoNumbers = divisionOperator.division("10", "2");

        assertEquals("5" ,theDivisionOfTwoNumbers);
    }
}
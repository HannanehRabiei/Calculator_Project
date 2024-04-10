import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOperatorTest {
    @Test
    void must_sum_two_number_together() {
        SumOperator sumOperator = new SumOperator();

       String theSumOfTwoNumbers = sumOperator.add("5.3", "-2");

        assertEquals("3.3" ,theSumOfTwoNumbers);
    }
}

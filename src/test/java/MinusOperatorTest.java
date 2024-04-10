import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinusOperatorTest {
    @Test
    void must_minus_two_number_together() {
        MinusOperator minusOperator = new MinusOperator();

        String theMinusOfTwoNumbers = minusOperator.menha("2", "1");

        assertEquals("1" ,theMinusOfTwoNumbers);
    }
}


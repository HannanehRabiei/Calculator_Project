import static java.lang.Double.parseDouble;

public class SumOperator {

    public String add(String number1, String number2) {

        double d1 = parseDouble(number1);
        double d2 = parseDouble(number2);
        double result=d1+d2;


        return String.valueOf(result);
    }
}

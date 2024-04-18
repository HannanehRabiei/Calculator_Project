import static java.lang.Double.parseDouble;

public class Calculate {
    public String menha(String number1, String number2) {

        final double d1 = parseDouble(number1);
        final double d2 = parseDouble(number2);
        final double result=d1-d2;

        return String.valueOf(result);
    }

        public String add(String number1, String number2) {

           final double d1 = parseDouble(number1);
           final double d2 = parseDouble(number2);
           final double result=d1+d2;

            return String.valueOf(result);
        }

    public String multiply(String firstNumber, String secondNumber) {

        final double d1 = parseDouble(firstNumber);
        final double d2 = parseDouble(secondNumber);
        final double result=d1*d2;

        return String.valueOf(result);
    }

    public String division(String firstNumber, String secondNumber) {

        final double d1 = parseDouble(firstNumber);
        final double d2 = parseDouble(secondNumber);
        final double result=d1/d2;

        return String.valueOf(result);
    }
}
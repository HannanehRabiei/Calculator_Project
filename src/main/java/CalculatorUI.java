import javax.swing.*;

public class CalculatorUI {

    public static final int WIDTH = 45;
    public static final int HEIGHT = 45;
    private static JTextField jTextField;
    private static String firstNumber;
    private static String lastOperation;

    public static void main(String... args) {

        JFrame calculator = new JFrame("Calculator");

        jTextField = new JTextField();
        jTextField.setBounds(0, 0, 150, HEIGHT);
        jTextField.setEditable(false);

        JButton cancle = new JButton("c");
        cancle.setBounds(150, 0, WIDTH, 50);
        cancle.addActionListener(event -> jTextField.setText(""));

        JButton one = getButton("1", 0, 50);
        JButton two = getButton("2", 50, 50);
        JButton three = getButton("3", 100, 50);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, WIDTH, HEIGHT);
        plus.addActionListener(e -> {
            firstNumber = jTextField.getText();
            jTextField.setText("");
            lastOperation="+";
        });

        JButton four = getButton("4", 0, 100);
        JButton five = getButton("5", 50, 100);
        JButton six = getButton("6", 100, 100);

        JButton minus = new JButton("-");
        minus.setBounds(150, 100, WIDTH, HEIGHT);
        minus.addActionListener(e -> {
            firstNumber = jTextField.getText();
            jTextField.setText("");
            lastOperation="-";
        });

        JButton seven = getButton("7", 0, 150);
        JButton eight = getButton("8", 50, 150);
        JButton nine = getButton("9", 100, 150);

        JButton multiply = new JButton("x");
        multiply.setBounds(150, 150, WIDTH, HEIGHT);
        multiply.addActionListener(e -> {
            firstNumber = jTextField.getText();
            jTextField.setText("");
            lastOperation="*";
        });

        JButton point = getButton(".", 0, 200);
        point.addActionListener(event -> {
            if (jTextField.getText().contains(".")) {
                jTextField.setText(jTextField.getText());
            }
            jTextField.setText("");
        });

        JButton zero = getButton("0", 50, 200);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200, WIDTH, HEIGHT);
        equal.addActionListener(e -> {
            Calculate calculate = new Calculate();
            switch (lastOperation){
                case  "+":
                    String addResult = calculate.add(firstNumber, jTextField.getText());
                    jTextField.setText(addResult);
                    break;
                case "-":
                    String minusResult = calculate.menha(firstNumber, jTextField.getText());
                    jTextField.setText(minusResult);
                    break;
                case "*":
                    String multiplyResult = calculate.multiply(firstNumber, jTextField.getText());
                    jTextField.setText(multiplyResult);
                case "/":
                    String divisionResult = calculate.division(firstNumber, jTextField.getText());
                    jTextField.setText(divisionResult);
                default:
                    break;
            }
        });

            JButton division = new JButton("/");
            division.setBounds(150, 200, WIDTH, HEIGHT);
            division.addActionListener(e -> {
                firstNumber=jTextField.getText();
                jTextField.setText("");
                lastOperation="/";
            });

            calculator.add(jTextField);
            calculator.add(cancle);
            calculator.add(one);
            calculator.add(two);
            calculator.add(three);
            calculator.add(plus);
            calculator.add(four);
            calculator.add(five);
            calculator.add(six);
            calculator.add(minus);
            calculator.add(seven);
            calculator.add(eight);
            calculator.add(nine);
            calculator.add(multiply);
            calculator.add(point);
            calculator.add(zero);
            calculator.add(equal);
            calculator.add(division);

            calculator.setLayout(null);
            calculator.setVisible(true);
            calculator.setSize(600, 600);

    }

        private static JButton getButton (String lable,int xPosition, int yPosition){
            JButton button = new JButton(lable);
            button.setBounds(xPosition, yPosition, WIDTH, HEIGHT);
            button.addActionListener(event -> jTextField.setText(jTextField.getText() + button.getText()));
            return button;
        }
    }
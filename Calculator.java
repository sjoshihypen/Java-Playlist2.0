import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

    private TextField textField;
    private double num1, num2, result;
    private int operator;

    public Calculator() {
        super("Calculator");
        setLayout(new FlowLayout());

        textField = new TextField(20);
        add(textField);

        Button[] buttons = new Button[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new Button(String.valueOf(i));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        Button addButton = new Button("+");
        addButton.addActionListener(this);
        add(addButton);

        Button subButton = new Button("-");
        subButton.addActionListener(this);
        add(subButton);

        Button mulButton = new Button("*");
        mulButton.addActionListener(this);
        add(mulButton);

        Button divButton = new Button("/");
        divButton.addActionListener(this);
        add(divButton);

        Button equalButton = new Button("=");
        equalButton.addActionListener(this);
        add(equalButton);

        Button clearButton = new Button("Clear");
        clearButton.addActionListener(this);
        add(clearButton);

        Button backspaceButton = new Button("Backspace");
        backspaceButton.addActionListener(this);
        add(backspaceButton);

        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = getOperator(input);
        } else if (input.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            textField.setText("");

            switch (operator) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
            }

            textField.setText(String.valueOf(result));
        } else if (input.equals("Clear")) {
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = 0;
            textField.setText("");
        } else if (input.equals("Backspace")) {
            String text = textField.getText();
            if (!text.isEmpty()) {
                text = text.substring(0, text.length() - 1);
                textField.setText(text);
            }
        } else {
            textField.setText(textField.getText() + input);
        }
    }

    private int getOperator(String input) {
        switch (input) {
            case "+":
                return 1;
            case "-":
                return 2;
            case "*":
                return 3;
            case "/":
                return 4;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;


// Java program to create an enhanced calculator
// with full expression parsing and evaluation

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Stack;

class Calculator extends JFrame implements ActionListener, KeyListener {
    // Create a frame
    static JFrame frame;

    // Create a textfield
    static JTextField textField;

    // StringBuilder to store the full expression
    StringBuilder expression;

    // Default constructor
    Calculator() {
        expression = new StringBuilder();
    }

    // Main function
    public static void main(String[] args) {
        // Create a frame
        frame = new JFrame("Calculator");

//        try {
//            // Set look and feel
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }

        // Create an object of the class
        Calculator calculator = new Calculator();

        // Create a textfield
        textField = new JTextField(16);

        // Set the textfield to non-editable
        textField.setEditable(false);

        // Add key listener to the text field
        textField.addKeyListener(calculator);

        // Create number buttons and operators
        JButton[] buttons = new JButton[17];
        String[] buttonLabels = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "+", "-", "*", "/", "%", "C", "=" 
        };

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(calculator);
        }

        // Create a panel
        JPanel panel = new JPanel();

        // Add elements to panel
        panel.add(textField);
        for (JButton button : buttons) {
            panel.add(button);
        }

        // Set panel layout and background
        panel.setLayout(new GridLayout(5, 4, 10, 10));
        panel.setBackground(Color.LIGHT_GRAY);

        // Add panel to frame
        frame.add(panel);

        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // If the command is a number or an operator
        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || 
            command.equals("+") || command.equals("-") || 
            command.equals("*") || command.equals("/") || 
            command.equals("%") || command.equals(".")) {
            expression.append(command);
            textField.setText(expression.toString());
        }
        // If the command is clear (C)
        else if (command.equals("C")) {
            expression.setLength(0);
            textField.setText("");
        }
        else if (command.equals("←") && expression.length() > 0) {
            expression.deleteCharAt(expression.length() - 1);
            textField.setText(expression.toString());
        }
        // If the command is equals (=)
        else if (command.equals("=")) {
            try {
                double result = evaluateExpression(expression.toString());
                textField.setText(expression.toString() + "=" + result);
                expression.setLength(0);
                expression.append(result);
            } catch (Exception ex) {
                textField.setText("Error");
                expression.setLength(0);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char keyChar = e.getKeyChar();

        // Handle numeric and operator keys
        if (Character.isDigit(keyChar) || keyChar == '+' || keyChar == '-' || 
            keyChar == '*' || keyChar == '/' || keyChar == '%' || keyChar == '.') {
            expression.append(keyChar);
            textField.setText(expression.toString());
        }
        // Handle Enter key for evaluation
        else if (keyChar == KeyEvent.VK_ENTER || keyChar == '=') {
            try {
                double result = evaluateExpression(expression.toString());
                textField.setText(expression.toString() + "=" + result);
                expression.setLength(0);
                expression.append(result);
            } catch (Exception ex) {
                textField.setText("Error");
                expression.setLength(0);
            }
        }
        // Handle Backspace key
        else if (keyChar == KeyEvent.VK_BACK_SPACE && expression.length() > 0) {
            expression.deleteCharAt(expression.length() - 1);
            textField.setText(expression.toString());
        }
        // Handle Clear (Escape key)
        else if (keyChar == KeyEvent.VK_ESCAPE || keyChar == 'C') {
            expression.setLength(0);
            textField.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No action needed on key release
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // No action needed on key typed
    }

    // Method to evaluate a mathematical expression
    private double evaluateExpression(String expr) {
        Stack<Double> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            // If the current character is a number
            if (Character.isDigit(c) || c == '.') {
                StringBuilder sb = new StringBuilder();
                while (i < expr.length() && (Character.isDigit(expr.charAt(i)) || expr.charAt(i) == '.')) {
                    sb.append(expr.charAt(i++));
                }
                i--;
                values.push(Double.parseDouble(sb.toString()));
            }
            // If the current character is an operator
            else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(c);
            }
        }

        // Apply remaining operations
        while (!operators.isEmpty()) {
            values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    // Method to return precedence of operators
    private int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
        }
        return -1;
    }

    // Method to apply an operation to two numbers
    private double applyOperation(char op, double b, double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;
            case '%':
                return a % b;
        }
        return 0;
    }
}


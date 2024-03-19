
package trial;

import java.util.Scanner;

/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Trial extends JFrame {
    private JTextField degreeField, radianField;

    public Trial() {
        setTitle("Degree-Radian Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel degreeLabel = new JLabel("Degrees:");
        degreeField = new JTextField(10);
        JLabel radianLabel = new JLabel("Radians:");
        radianField = new JTextField(10);
        radianField.setEditable(false);

        JButton toRadianButton = new JButton("Convert to Radians");
        JButton toDegreeButton = new JButton("Convert to Degrees");

        toRadianButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertToRadian();
            }
        });

        toDegreeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertToDegree();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(degreeLabel);
        panel.add(degreeField);
        panel.add(toRadianButton);
        panel.add(radianLabel);
        panel.add(radianField);
        panel.add(toDegreeButton);

        add(panel);
    }

    private void convertToRadian() {
        try {
            double degrees = Double.parseDouble(degreeField.getText());
            double radians = Math.toRadians(degrees);
            radianField.setText(String.format("%.2f", radians));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input for degrees", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void convertToDegree() {
        try {
            double radians = Double.parseDouble(radianField.getText());
            double degrees = Math.toDegrees(radians);
            degreeField.setText(String.format("%.2f", degrees));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input for radians", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Trial().setVisible(true);
            }
        });
    }
}*/

/*public class Trial {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
       double radians = scan.nextDouble();
       
        double degrees = radiansToDegrees(radians);
        System.out.println("Radians: " + radians);
        System.out.println("Degrees: " + degrees);
    }

    public static double radiansToDegrees(double radians) {
        return radians * (180.0 / Math.PI);
    }
}*/

//import java.util.Stack;
//
//public class Trial {

//    public static double evaluateExpression(String expression) {
//        Stack<Double> numbers = new Stack<>();
//        Stack<Character> operators = new Stack<>();
//
//        for (int i = 0; i < expression.length(); i++) {
//            char ch = expression.charAt(i);
//            if (ch == ' ')
//                continue;
//
//            if (ch >= '0' && ch <= '9') {
//                StringBuilder sb = new StringBuilder();
//                while (i < expression.length() && ((expression.charAt(i) >= '0' && expression.charAt(i) <= '9') || expression.charAt(i) == '.')) {
//                    sb.append(expression.charAt(i));
//                    i++;
//                }
//                i--;
//                numbers.push(Double.parseDouble(sb.toString()));
//            } else if (ch == '(') {
//                operators.push(ch);
//            } else if (ch == ')') {
//                while (operators.peek() != '(') {
//                    numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
//                }
//                operators.pop(); // Remove '('
//            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
//                while (!operators.empty() && hasPrecedence(ch, operators.peek())) {
//                    numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
//                }
//                operators.push(ch);
//            }
//        }
//
//        while (!operators.empty()) {
//            numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
//        }
//
//        return numbers.pop();
//    }
//
//    public static boolean hasPrecedence(char op1, char op2) {
//        if (op2 == '(' || op2 == ')')
//            return false;
//        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
//            return false;
//        return true;
//    }
//
//    public static double applyOperator(char operator, double b, double a) {
//        switch (operator) {
//            case '+':
//                return a + b;
//            case '-':
//                return a - b;
//            case '*':
//                return a * b;
//            case '/':
//                if (b == 0)
//                    throw new ArithmeticException("Cannot divide by zero");
//                return a / b;
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        String expression = "(3 + 4) * (2 - 1)"; // Example expression with parentheses
//        double result = evaluateExpression(expression);
//        System.out.println("Result: " + result);
//    }
//}









/*import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an arithmetic expression: ");
        String expression = scanner.nextLine();
        
        double result = evaluateExpression(expression);
        System.out.println("Result: " + result);
        
        scanner.close();
    }

    public static double evaluateExpression(String expression) {
        // Implement the evaluation logic here
        // You can use existing methods or libraries for parsing and evaluating expressions
        // For simplicity, let's assume the expression is a single operation without error handling
        
        // Split the expression into operands and operator
        String[] tokens = expression.split("\\s+");
        double operand1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double operand2 = Double.parseDouble(tokens[2]);

        // Perform the operation based on the operator
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero");
                    System.exit(1);
                }
                return operand1 / operand2;
            default:
                System.out.println("Error: Invalid operator");
                System.exit(1);
                return 0; // This line is never reached


        }
    }
}*/




/*import java.util.Scanner;
import java.util.Stack;

public class Trial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an arithmetic expression: ");
        String expression = scanner.nextLine();
        
        double result = evaluateExpression(expression);
        System.out.println("Result: " + result);
        
        scanner.close();
    }

    public static double evaluateExpression(String expression) {
        // Implement the evaluation logic here
        
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (ch == ' ')
                continue;
            
            if (Character.isDigit(ch)) {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i));
                    i++;
                }
                i--;
                operandStack.push(Double.parseDouble(sb.toString()));
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (operatorStack.peek() != '(') {
                    evaluateTop(operandStack, operatorStack);
                }
                operatorStack.pop(); // Pop '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())) {
                    evaluateTop(operandStack, operatorStack);
                }
                operatorStack.push(ch);
            }
        }
        
        while (!operatorStack.isEmpty()) {
            evaluateTop(operandStack, operatorStack);
        }
        
        return operandStack.pop();
    }
    
    private static void evaluateTop(Stack<Double> operandStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();
        double operand2 = operandStack.pop();
        double operand1 = operandStack.pop();
        
        switch (operator) {
            case '+':
                operandStack.push(operand1 + operand2);
                break;
            case '-':
                operandStack.push(operand1 - operand2);
                break;
            case '*':
                operandStack.push(operand1 * operand2);
                break;
            case '/':
                operandStack.push(operand1 / operand2);
                break;
        }
    }
    
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}
*/



/*import java.util.Scanner;
import java.util.Stack;

public class Trial {
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an arithmetic expression: ");
        String expression = scanner.nextLine();

        double result = evaluateExpression(expression);
        
    // jtexfield1.settext(jtextfield.gettext() + result);
        System.out.println("Result: " + result);
        
        
    }

    
    
    
    
    
    public static double evaluateExpression(String expression) {
        // Add multiplication operator (*) if missing between a number and an opening parenthesis
        expression = addMultiplicationOperator(expression);
        
        // Implement the evaluation logic here
        
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (ch == ' ')
                continue;
            
            if (Character.isDigit(ch)) {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i));
                    i++;
                }
                i--;
                operandStack.push(Double.parseDouble(sb.toString()));
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (operatorStack.peek() != '(') {
                    evaluateTop(operandStack, operatorStack);
                }
                operatorStack.pop(); // Pop '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())) {
                    evaluateTop(operandStack, operatorStack);
                }
                operatorStack.push(ch);
            }
        }
        
        while (!operatorStack.isEmpty()) {
            evaluateTop(operandStack, operatorStack);
        }
        
        return operandStack.pop();
    }
    
    
    
    
    
    
    
    
    private static void evaluateTop(Stack<Double> operandStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();
        double operand2 = operandStack.pop();
        double operand1 = operandStack.pop();
        
        switch (operator) {
            case '+':
                operandStack.push(operand1 + operand2);
                break;
            case '-':
                operandStack.push(operand1 - operand2);
                break;
            case '*':
                operandStack.push(operand1 * operand2);
                break;
            case '/':
                operandStack.push(operand1 / operand2);
                break;
        }
    }
    
    
    
    
    
    
    
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
    
    
    
    
    
    
    
    private static String addMultiplicationOperator(String expression) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            sb.append(ch);
            if (ch == '(' && i > 0 && Character.isDigit(expression.charAt(i - 1))) {
                sb.insert(i, '*');
            }
        }
        return sb.toString();
    }
}*/





/*import java.util.Scanner;
import java.util.Stack;

public class Trial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an arithmetic expression: ");
        String expression = scanner.nextLine();
        
        double result = evaluateExpression(expression);
        System.out.println("Result: " + result);
        
        scanner.close();
    }

    public static double evaluateExpression(String expression) {
        // Add multiplication operator (*) if missing between a number and an opening parenthesis
        expression = addMultiplicationOperator(expression);
        
        // Implement the evaluation logic here
        
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (ch == ' ')
                continue;
            
            if (Character.isDigit(ch)) {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i));
                    i++;
                }
                i--;
                operandStack.push(Double.parseDouble(sb.toString()));
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (operatorStack.peek() != '(') {
                    evaluateTop(operandStack, operatorStack);
                }
                operatorStack.pop(); // Pop '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())) {
                    evaluateTop(operandStack, operatorStack);
                }
                operatorStack.push(ch);
            }
        }
        
        while (!operatorStack.isEmpty()) {
            evaluateTop(operandStack, operatorStack);
        }
        
        return operandStack.pop();
    }
    
    private static void evaluateTop(Stack<Double> operandStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();
        double operand2 = operandStack.pop();
        double operand1 = operandStack.pop();
        
        switch (operator) {
            case '+':
                operandStack.push(operand1 + operand2);
                break;
            case '-':
                operandStack.push(operand1 - operand2);
                break;
            case '*':
                operandStack.push(operand1 * operand2);
                break;
            case '/':
                operandStack.push(operand1 / operand2);
                break;
        }
    }
    
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
    
    private static String addMultiplicationOperator(String expression) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            sb.append(ch);
            if (ch == '(' && i > 0 && Character.isDigit(expression.charAt(i - 1))) {
                sb.insert(i, '*');
            } else if (ch == ')' && i < expression.length() - 1 && Character.isDigit(expression.charAt(i + 1))) {
                sb.insert(i + 1, '*');
            }
        }
        return sb.toString();
    }
}*/








import java.util.Scanner;
import java.util.Stack;

public class Trial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an arithmetic expression: ");
        String expression = scanner.nextLine();
        
        double result = evaluateExpression(expression);
        System.out.println("Result: " + result);
        
        scanner.close();
    }

    public static double evaluateExpression(String expression) {
        // Add multiplication operator (*) if missing between a number and an opening parenthesis
        expression = addMultiplicationOperator(expression);
        
        // Implement the evaluation logic here
        
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (ch == ' ')
                continue;
            
            if (Character.isDigit(ch)) {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i));
                    i++;
                }
                i--;
                operandStack.push(Double.parseDouble(sb.toString()));
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (operatorStack.peek() != '(') {
                    evaluateTop(operandStack, operatorStack);
                }
                operatorStack.pop(); // Pop '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())) {
                    evaluateTop(operandStack, operatorStack);
                }
                operatorStack.push(ch);
            }
        }
        
        while (!operatorStack.isEmpty()) {
            evaluateTop(operandStack, operatorStack);
        }
        
        return operandStack.pop();
    }
    
    private static void evaluateTop(Stack<Double> operandStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();
        double operand2 = operandStack.pop();
        double operand1 = operandStack.pop();
        
        switch (operator) {
            case '+':
                operandStack.push(operand1 + operand2);
                break;
            case '-':
                operandStack.push(operand1 - operand2);
                break;
            case '*':
                operandStack.push(operand1 * operand2);
                break;
            case '/':
                operandStack.push(operand1 / operand2);
                break;
        }
    }
    
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
    
    private static String addMultiplicationOperator(String expression) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            sb.append(ch);
            if (ch == '(' && i > 0 && Character.isDigit(expression.charAt(i - 1))) {
                sb.insert(i, '*');
            } else if (ch == ')' && i < expression.length() - 1 && Character.isDigit(expression.charAt(i + 1))) {
                sb.insert(i + 1, '*');
            } else if (ch == ')' && i < expression.length() - 1 && expression.charAt(i + 1) == '(') {
                sb.insert(i + 1, '*');
            }
        }
        return sb.toString();
    }
}



















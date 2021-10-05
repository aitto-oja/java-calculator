import javax.swing.*;

public class Calculator {
    JFrame frame;

    // Constructor
    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
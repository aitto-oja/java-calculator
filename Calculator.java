import javax.swing.*;
import java.awt.*;

public class Calculator {
    JFrame frame;
    JTextField textfield;

    Font myFont = new Font("Serif", Font.BOLD, 30);

    // Constructor
    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(40, 25, 340, 50);
        textfield.setFont(myFont);
        frame.add(textfield);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
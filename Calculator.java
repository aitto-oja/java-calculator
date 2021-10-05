import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JPanel panel;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JTextField infoText;

    Font myFont = new Font("Serif", Font.BOLD, 33);
    Font infoFont = new Font("Serif", Font.ITALIC, 12);

    double num1 = 0, num2 = 0, result = 0;
    char operator; 

    // Constructor
    Calculator() {
        // Frame: 
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.getContentPane().setBackground(new java.awt.Color(61,44,141));
        frame.setLayout(null);

        // Textfield: 
        textfield = new JTextField();
        textfield.setBounds(40, 25, 340, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        frame.add(textfield);

        // Info textfield:
        infoText = new JTextField();
        infoText.setBounds(40, 75, 340, 20);
        infoText.setFont(infoFont);
        infoText.setForeground(Color.green);
        infoText.setBackground(new java.awt.Color(61,44,141));
        infoText.setEditable(false);
        frame.add(infoText);

        // Number buttons: 
        for (int i=0; i<10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        // Function Buttons:
        addButton = new JButton("+");
        functionButtons[0] = addButton;
        subButton = new JButton("-");
        functionButtons[1] = subButton;
        mulButton = new JButton("*");
        functionButtons[2] = mulButton;
        divButton = new JButton("/");
        functionButtons[3] = divButton;
        decButton = new JButton(".");
        functionButtons[4] = decButton;
        equButton = new JButton("=");
        functionButtons[5] = equButton;
        delButton = new JButton("Delete");
        functionButtons[6] = delButton;
        clrButton = new JButton("Clear");
        functionButtons[7] = clrButton;
        negButton = new JButton("(-)");
        functionButtons[8] = negButton;

        for (int i=0; i<9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        // Panel: 
        panel = new JPanel();
        panel.setBounds(40, 100, 340, 340);
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        panel.setBackground(new java.awt.Color(145, 107, 191));
        
        // First row
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(functionButtons[0]);

        // Second row
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(functionButtons[1]);

        // Third row
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(functionButtons[2]);

        // Fourth row
        panel.add(functionButtons[4]);
        panel.add(numberButtons[0]);
        panel.add(functionButtons[5]);
        panel.add(functionButtons[3]);

        frame.add(panel);

        // Buttons under the panel: 
        negButton.setBounds(40, 450, 50, 50);
        delButton.setBounds(130, 450, 120, 50);
        clrButton.setBounds(260, 450, 120, 50);

        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=0; i<10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }

            if (e.getSource() == decButton) {
                if (!textfield.getText().contains(".")) {
                    textfield.setText(textfield.getText().concat("."));
                } 
            }

            if (e.getSource() == addButton) {
                if (textfield.getText().length() > 0) {
                    num1 = Double.parseDouble(textfield.getText());
                    operator = '+';
                    boolean isAdd = infoText.getText().contains(" + ");
                    boolean isSub = infoText.getText().contains(" - ");
                    boolean isMul = infoText.getText().contains(" * ");
                    boolean isDiv = infoText.getText().contains(" / ");

                    if (isAdd) {
                        infoText.setText(infoText.getText().replace(" + ", " + "));
                    } else if (isSub) {
                        infoText.setText(infoText.getText().replace(" - ", " + "));
                    } else if (isMul) {
                        infoText.setText(infoText.getText().replace(" * ", " + "));
                    } else if (isDiv) {
                        infoText.setText(infoText.getText().replace(" / ", " + "));
                    } else {
                        infoText.setText(textfield.getText().concat(" + "));
                    }
                    textfield.setText("");
                }
            }
        }
    }
}
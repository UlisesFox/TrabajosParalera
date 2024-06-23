import javax.swing.*;
import java.awt.GridLayout;

public class interfaz1 {
    private static Calculator calculator;

    public static void createAndShowGUI(Calculator calc) {
        calculator = calc;
        
        JFrame frame = new JFrame("Cliente 1 - Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new GridLayout(5, 5));
    
        JTextField numberField = new JTextField();
        numberField.setEditable(false);
        JTextField operatorField = new JTextField();
        operatorField.setEditable(false);
        JButton clear = new JButton("C");
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonMultiply = new JButton("*");
        JButton buttonDivide = new JButton("/");
        JButton buttonCalculate = new JButton("=");
        JLabel resultLabel = new JLabel();
        JButton Enviar = new JButton("Enviar");
    
        buttonCalculate.addActionListener(e -> {
            try {
                String operator = operatorField.getText();
                int result = calculator.calculator(operator);
                resultLabel.setText("R= " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Ingrese un número válido.");
            } catch (Exception ex) {
                resultLabel.setText("Error al invocar el método remoto.");
            }
        });

        Enviar.addActionListener(e -> {
            try {
                int number1 = Integer.parseInt(numberField.getText());
                calculator.calculate1(number1);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Ingrese un número válido.");
            } catch (Exception ex) {
                resultLabel.setText("Error al invocar el método remoto.");
            }
        });
    
        button0.addActionListener(e -> numberField.setText(numberField.getText() + "0"));
        button1.addActionListener(e -> numberField.setText(numberField.getText() + "1"));
        button2.addActionListener(e -> numberField.setText(numberField.getText() + "2"));
        button3.addActionListener(e -> numberField.setText(numberField.getText() + "3"));
        button4.addActionListener(e -> numberField.setText(numberField.getText() + "4"));
        button5.addActionListener(e -> numberField.setText(numberField.getText() + "5"));
        button6.addActionListener(e -> numberField.setText(numberField.getText() + "6"));
        button7.addActionListener(e -> numberField.setText(numberField.getText() + "7"));
        button8.addActionListener(e -> numberField.setText(numberField.getText() + "8"));
        button9.addActionListener(e -> numberField.setText(numberField.getText() + "9"));
        buttonPlus.addActionListener(e -> operatorField.setText("+"));
        buttonMinus.addActionListener(e -> operatorField.setText("-"));
        buttonMultiply.addActionListener(e -> operatorField.setText("*"));
        buttonDivide.addActionListener(e -> operatorField.setText("/"));
        clear.addActionListener(e -> numberField.setText(""));
        clear.addActionListener(e -> operatorField.setText(""));
        clear.addActionListener(e -> resultLabel.setText(""));
    
        frame.add(numberField);
        frame.add(operatorField);
        frame.add(resultLabel);
        frame.add(Enviar);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(buttonDivide);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(buttonMultiply);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonMinus);
        frame.add(button0);
        frame.add(buttonCalculate);
        frame.add(clear);
        frame.add(buttonPlus);
        frame.setVisible(true);
    }
}

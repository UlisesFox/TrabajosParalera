import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App{
    public static void main(String[] args) throws Exception {

    JFrame far = new JFrame("Boton");
    far.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel pantalla = new JPanel();

    JButton hola = new JButton("Hola");
    hola.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Hola Groot");
        }
    });   
    pantalla.add(hola);

    JButton adios = new JButton("Adios");
    adios.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Adios Groot");
        }
    });
    pantalla.add(adios);

    far.add(pantalla);
    far.pack();
    far.setVisible(true);
  }
}
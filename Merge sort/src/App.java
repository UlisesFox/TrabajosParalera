import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame{

    static Agregar g = new Agregar();
    static MergeSort p = new MergeSort();
    static limpiar l = new limpiar();
    static ExecutorS s = new ExecutorS();

    private static JLabel direccionLabel = new JLabel("Cuantos datos quieres?");
    public static JTextField nombrecaja = new JTextField("90000", 35);
    private static JButton Agregar = new JButton("Agregar");
    private static JButton Limpiar = new JButton("Limpiar");
    private static JButton MergeSort = new JButton("MergeSort");
    private static JButton ForkJoin = new JButton("ForkJoin");
    private static JButton ExecuteServices = new JButton("ExecutorService");
    private static JLabel textArea1 = new JLabel("Array a acomodar: ");
    public static TextArea textArea2 = new TextArea();
    private static JLabel textArea3 = new JLabel("Array ya acomodado: ");
    public static TextArea textArea4 = new TextArea();
    public static JTextArea textArea5 = new JTextArea("Merge Sort tardo:" + "\n" + "Nanosegundos: " + "\n" + "Millisegundos: ");
    public static JTextArea textArea6 = new JTextArea("Fork Join tardo:" + "\n" + "Nanosegundos: " + "\n" + "Millisegundos: ");
    public static JTextArea textArea7 = new JTextArea("ExecutorService tardo:" + "\n" + "Nanosegundos: " + "\n" + "Millisegundos: ");

    public static void main(String[] args) throws Exception {
        App window = new App();
        //ventana
        window.setSize(520,520);
        window.setVisible(true);
        window.setTitle("Merge Sort");

        textArea2.setEditable(false);
        textArea4.setEditable(false);

        //colores de ventana
        window.getContentPane().setBackground(new Color(50, 50, 50));
        nombrecaja.setBackground(new Color(75, 75, 75));
        nombrecaja.setForeground(new Color(250, 250, 250));
        direccionLabel.setForeground(new Color(250, 250, 250));
        Agregar.setForeground(new Color(250, 250, 250));
        Agregar.setBackground(new Color(75, 75, 75));
        Limpiar.setForeground(new Color(250, 250, 250));
        Limpiar.setBackground(new Color(75, 75, 75));
        ExecuteServices.setForeground(new Color(250, 250, 250));
        ExecuteServices.setBackground(new Color(75, 75, 75));
        ForkJoin.setForeground(new Color(250, 250, 250));
        ForkJoin.setBackground(new Color(75, 75, 75));
        MergeSort.setForeground(new Color(250, 250, 250));
        MergeSort.setBackground(new Color(75, 75, 75));
        textArea1.setForeground(new Color(250, 250, 250));
        textArea1.setBackground(new Color(50, 50, 50));
        textArea2.setForeground(new Color(250, 250, 250));
        textArea2.setBackground(new Color(50, 50, 50));
        textArea3.setForeground(new Color(250, 250, 250));
        textArea3.setBackground(new Color(50, 50, 50));
        textArea4.setForeground(new Color(250, 250, 250));
        textArea4.setBackground(new Color(50, 50, 50));
        textArea5.setForeground(new Color(250, 250, 250));
        textArea5.setBackground(new Color(50, 50, 50));
        textArea6.setForeground(new Color(250, 250, 250));
        textArea6.setBackground(new Color(50, 50, 50));
        textArea7.setForeground(new Color(250, 250, 250));
        textArea7.setBackground(new Color(50, 50, 50));

        //objetos de ventana
        window.setLayout(new FlowLayout());
        window.getContentPane().add(direccionLabel);
        window.getContentPane().add(nombrecaja);
        window.getContentPane().add(Agregar);
        window.getContentPane().add(Limpiar);
        window.getContentPane().add(MergeSort);
        window.getContentPane().add(ForkJoin);
        window.getContentPane().add(ExecuteServices);
        window.getContentPane().add(textArea1);
        window.getContentPane().add(textArea2);
        window.getContentPane().add(textArea3);
        window.getContentPane().add(textArea4);
        window.getContentPane().add(textArea5);
        window.getContentPane().add(textArea6);
        window.getContentPane().add(textArea7);


        Agregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ButtonAgregar(e);
            }
        });

        Limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ButtonLimpiar(e);
            }
        });

        MergeSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ButtonMS(e);
            }
        });

        ExecuteServices.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ButtonES(e);
            }
        });

        ForkJoin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ButtonFJ(e);
            }
        });

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void ButtonAgregar(ActionEvent e){
        g.gene();
    }

    public static void ButtonMS(ActionEvent e){
        p.MS();
    }

    public static void ButtonLimpiar(ActionEvent e){
        l.lim();
    }

    public static void ButtonFJ(ActionEvent e){
        ForKJoin.inic();
    }

    public static void ButtonES(ActionEvent e){
        s.ini();
    }
}
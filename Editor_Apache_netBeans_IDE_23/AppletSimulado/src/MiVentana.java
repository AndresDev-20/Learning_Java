import javax.swing.*;
import java.awt.event.*;

public class MiVentana {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Applet con Botón");
        JLabel etiqueta = new JLabel("Etiqueta inicial");
        JButton boton = new JButton("Presionar");

        etiqueta.setBounds(50, 30, 200, 30);
        boton.setBounds(50, 70, 150, 30);

        boton.addActionListener((ActionEvent e) -> {
            etiqueta.setText("El botón ha sido presionado.");
        });

        frame.setLayout(null);
        frame.add(etiqueta);
        frame.add(boton);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

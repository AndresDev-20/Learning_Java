/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appletssoluciones;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AppletDias extends Applet implements ActionListener {
    TextField diasInput;
    Label labelHoras, labelMinutos, labelSegundos, labelResultado;
    Button calcular;

    public void init() {
        setLayout(new GridLayout(7, 1));
        setBackground(Color.WHITE);

        // Título
        Label titulo = new Label("Horas - Minutos y Segundos", Label.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo);

        // Ingreso de días
        Panel inputPanel = new Panel(new FlowLayout(FlowLayout.CENTER));
        inputPanel.add(new Label("Ingrese la cantidad de días:"));
        diasInput = new TextField(5);
        inputPanel.add(diasInput);
        add(inputPanel);

        // Botón calcular
        Panel botonPanel = new Panel();
        calcular = new Button("CALCULAR");
        calcular.setFont(new Font("Arial", Font.BOLD, 14));
        calcular.addActionListener(this);
        botonPanel.add(calcular);
        add(botonPanel);

        // Horas
        labelHoras = new Label("Horas: ", Label.CENTER);
        labelHoras.setFont(new Font("Arial", Font.PLAIN, 14));
        add(labelHoras);

        // Minutos
        labelMinutos = new Label("Minutos: ", Label.CENTER);
        labelMinutos.setFont(new Font("Arial", Font.PLAIN, 14));
        add(labelMinutos);

        // Segundos
        labelSegundos = new Label("Segundos: ", Label.CENTER);
        labelSegundos.setFont(new Font("Arial", Font.PLAIN, 14));
        add(labelSegundos);

        // Resultado final
        labelResultado = new Label("", Label.CENTER);
        labelResultado.setFont(new Font("Arial", Font.ITALIC, 12));
        add(labelResultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int dias = Integer.parseInt(diasInput.getText());
            int horas = dias * 24;
            int minutos = horas * 60;
            int segundos = minutos * 60;

            labelHoras.setText("Horas: " + horas);
            labelMinutos.setText("Minutos: " + minutos);
            labelSegundos.setText("Segundos: " + segundos);
            labelResultado.setText(dias + " días tienen " + horas + " horas - " + minutos + " minutos - " + segundos + " segundos");
        } catch (NumberFormatException ex) {
            labelResultado.setText("Por favor ingrese un número válido.");
        }
    }
}

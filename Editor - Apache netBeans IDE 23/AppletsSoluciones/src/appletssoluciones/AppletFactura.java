/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appletssoluciones;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AppletFactura extends Applet implements ActionListener {
    TextField nombreCliente;
    TextField[] nombresProductos = new TextField[3];
    TextField[] valoresUnitarios = new TextField[3];
    TextField[] cantidades = new TextField[3];
    Label resultado;
    Button calcular;

    @Override
    public void init() {
    setLayout(new BorderLayout());

    Panel panelFormulario = new Panel(new GridLayout(4, 1));

    // Nombre del cliente
    Panel clientePanel = new Panel(new FlowLayout(FlowLayout.LEFT));
    clientePanel.add(new Label("Nombre del cliente:"));
    nombreCliente = new TextField(30);
    clientePanel.add(nombreCliente);
    panelFormulario.add(clientePanel);

    // Productos
    for (int i = 0; i < 3; i++) {
        Panel productoPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        productoPanel.add(new Label("Producto " + (i + 1) + ":"));
        nombresProductos[i] = new TextField(10);
        productoPanel.add(nombresProductos[i]);

        productoPanel.add(new Label("Valor unitario:"));
        valoresUnitarios[i] = new TextField(5);
        productoPanel.add(valoresUnitarios[i]);

        productoPanel.add(new Label("Cantidad:"));
        cantidades[i] = new TextField(5);
        productoPanel.add(cantidades[i]);

        panelFormulario.add(productoPanel);
    }

    // Botón
    Panel botonPanel = new Panel(new FlowLayout(FlowLayout.CENTER));
    calcular = new Button("Calcular factura");
    calcular.addActionListener(this);
    botonPanel.add(calcular);

    // Resultado
    Panel resultadoPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
    resultado = new Label("");
    resultadoPanel.add(resultado);

    // Añadir todo
    add(panelFormulario, BorderLayout.NORTH);
    add(botonPanel, BorderLayout.CENTER);
    add(resultadoPanel, BorderLayout.SOUTH);
}


    @Override
    public void actionPerformed(ActionEvent e) {
        double total = 0;
        StringBuilder detalles = new StringBuilder("Factura para " + nombreCliente.getText() + ": ");

        for (int i = 0; i < 3; i++) {
            String nombre = nombresProductos[i].getText();
            double valor = Double.parseDouble(valoresUnitarios[i].getText());
            int cantidad = Integer.parseInt(cantidades[i].getText());
            double subtotal = valor * cantidad;
            total += subtotal;

            detalles.append(" | ").append(nombre).append(": $").append(subtotal);
        }

        detalles.append(" | Total: $").append(total);
        resultado.setText(detalles.toString());
    }
}

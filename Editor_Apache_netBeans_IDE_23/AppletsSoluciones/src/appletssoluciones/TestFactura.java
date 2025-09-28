/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appletssoluciones;

import javax.swing.*;

public class TestFactura {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Factura de Compra");
        AppletFactura applet = new AppletFactura();

        frame.setSize(800, 400);
        frame.add(applet);
        applet.init(); // muy importante
        applet.start(); // muy importante
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

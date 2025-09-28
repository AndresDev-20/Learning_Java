/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appletssoluciones;

import javax.swing.*;

public class TestDias {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor de Días");
        AppletDias applet = new AppletDias();

        frame.setSize(400, 200);
        frame.add(applet);
        applet.init();
        applet.start();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

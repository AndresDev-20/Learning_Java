/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemnotes;

/**
 *
 * @author Yeison Andres
 */
public class Notes {
    public double[] notas;
    
    public double calcule(){
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double res = suma / 5;
        return res;
        
    };
    
    
}

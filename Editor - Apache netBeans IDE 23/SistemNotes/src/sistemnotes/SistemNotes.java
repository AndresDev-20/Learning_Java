/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemnotes;

import java.util.Scanner;

/**
 *
 * @author Yeison Andres
 */
public class SistemNotes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        Notes date = new Notes();
         for(int i = 0; i <= 5; i++) {
             System.out.println("Ingresa la nota" + i);
             date.notas[i] = sc.nextDouble();
         }
         
         
    }
    
   
    
}

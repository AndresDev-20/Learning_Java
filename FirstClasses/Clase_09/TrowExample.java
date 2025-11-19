package Clase_09;

public class TrowExample {

    // Métodos o Funciones
    public void checkAge(int age) {
        if (age <= 18) {
            throw new IllegalArgumentException("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
    }
}

package Clase_09;

public class TrowExample {
    // Atributos
    int age = 17;

    // Métodos o Funciones
    public void checkAge() {
        if (age <= 18) {
            throw new IllegalArgumentException("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
    }
}

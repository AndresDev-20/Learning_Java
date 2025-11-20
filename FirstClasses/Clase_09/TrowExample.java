package Clase_09;

public class TrowExample {

    // Métodos o Funciones
    public void checkAge(int age) throws IllegalArgumentException {
        if (age <= 18) {
            throw new IllegalArgumentException("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
    }
    public void checkScore(int score) throws CustomException {
        if (score < 0 || score > 100) {
            throw new CustomException("La puntuación debe estar entre 0 y 100");
        }
    }
}

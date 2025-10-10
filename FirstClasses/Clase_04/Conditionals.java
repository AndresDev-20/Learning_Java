package Clase_04;

public class Conditionals {

    public static void main(String[] args) {
        // Condicionales
        var age = 50;
        //if, else if, else if
        if (age >= 18 && age <= 30) {
            System.out.println("Eres mayor de edad");
        } else if (age < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres demaciado viejo para este programa");
        }
    }
}

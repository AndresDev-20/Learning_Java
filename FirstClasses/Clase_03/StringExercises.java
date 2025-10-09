package Clase_03;

public class StringExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String firstName = "Andres";
        String lastName = "Marroquin";
        System.out.println(firstName + " " + lastName);

        // 2. Muestra la longitud de una cadena de texto.
        String text = "Hi, my name is andres and I am programmer";
        System.out.println(text.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        // 6. Formatea un string con un entero.

        // 7. Elimina los espacios en blanco al principio y final de un string.

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        // 9. Comprueba si dos strings son iguales.

        // 10. Comprueba si dos strings tienen la misma longitud.
    }
}

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
        String word = "programmer";
        System.out.println(text.contains(word));

        // 6. Formatea un string con un entero.
        int age = 20;
        System.out.println(String.format("Hola, mi nombre es Andres y tengo %d años", age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String text2 = "   Hola, soy ingeniero de software   ";
        System.out.println(text2.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(text2.replace(" ", ""));

        // 9. Comprueba si dos strings son iguales.
        String str1 = "Hola dev";
        String str2 = "Hola dev";
        System.out.println(str1.equalsIgnoreCase(str2));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(str1.length() == str2.length());
    }
}

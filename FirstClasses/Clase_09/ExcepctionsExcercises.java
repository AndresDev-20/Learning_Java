package Clase_09;

public class ExcepctionsExcercises {

    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        int numberOne = 10;
        int numberTwo = 0;
        try {
            int result = numberOne / numberTwo;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        String[] colors = {"Red", "Blue", "Green"};
        try {
            System.out.println(colors[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
            // System.out.println("Estás intentando acceder a una posición que no existe en el arreglo.");
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
            // System.out.println("Error: La variable text está en null, no se puede usar length().");
        }

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).


        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
    }

    // Cuarto ejercicio
    public void
}

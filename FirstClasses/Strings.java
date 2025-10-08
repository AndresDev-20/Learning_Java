import java.util.Locale;

public class Strings {

    public static void main(String[] args) {

        // Cadenas de texto
        String name = "Andres.dev";

        // Concatenación
        String firstName = "Andres";
        String surName = "Marroquin";
        System.out.println(firstName + " " + surName);

        // Hallar la longitud con length()
        String animal = "Gato";
        System.out.println(animal.length());

        // Obtener un carácter con charAt()
        String person = "Andres.dev";
        System.out.println(person.charAt(0)); // Asi obtengo el carácter "A".
        System.out.println(person.charAt(person.length() - 1)); // Para el ultímo puedo usar -1, pero con el método length.

        // Obtener una subcadena usando a substring()
        System.out.println(person.substring(2)); // con esto le decimos que arranque desde el indice 2 mostrando "dres.dev"
        System.out.println(person.substring(2, 4)); // y con esto damos un inicio y un fin de lo que queremos extraer del string.

        // Mayúsculas y minúsculas
        String text = "hi my name is andres";
        System.out.println(text.toUpperCase()); // Mayúscula
        System.out.println(text.toLowerCase()); // Minúscula

        // Comprobar si contiene usando contains()
        String cadena = "Hola, Java";
        System.out.println(cadena.toUpperCase().contains("AVA"));
    }
}

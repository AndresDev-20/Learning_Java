import java.util.Scanner;

public class HelloWorldExercises {

    public static void main(String[] args) {
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Yeison Andres Marroquin Bernal");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // creo una variable para la edad
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        //uso una sentencia para determinar si la persona es menor o mayor de edad
        if (edad >= 18) {
            System.out.println("Eres Mayor de edad");
        }else{
            System.out.println("Eres Menor de edad");
        }

        // 4. Crea un comentario en varias líneas.
        /* Hello, my name is Andres and I am a programmer,
        so I study Java on YouTube with MoureDev */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        int age = 20;
        String favoriteColor = "Red";
        String City = "Rovira Tolima";
        System.out.println(age);
        System.out.println(favoriteColor);
        System.out.println(City);

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        String a = "Texto de prueba";
        System.out.println(a);
        System.err.println(a);

        // 7. Utiliza varios println para imprimir una frase.
        // println = imprime el texto y luego hace un salto de línea (va a la siguiente línea)
        System.out.println("Usa println: imprime texto con salto de línea al final");
        System.out.println("Cada println escribe en una nueva línea");
        System.out.println("Ejemplo de salto de línea automático");
        // print = imprime el texto pero SIN salto de línea (continúa en la misma línea)
        System.out.print("Usa print: imprime texto sin salto de línea ");
        System.out.print("— este texto sigue justo después del anterior. ");
        System.out.print("Todo esto aparece en una misma línea. ");
        // println vacío = solo hace un salto de línea (línea en blanco)
        System.out.println();
        System.out.println("Esto aparece después de una línea en blanco.");
        // printf = permite imprimir texto con formato (por ejemplo, números, variables, etc.)
        System.out.printf("Usa printf: puedes imprimir variables con formato, por ejemplo: %d, %s, %.2f%n",
                10, "cadena", 3.1416);
        // Ejemplo más claro de printf
        String nombre = "Yeison";
        double promedio = 4.85;
        System.out.printf("Nombre: %s | Edad: %d | Promedio: %.2f%n", nombre, edad, promedio);
        // También se puede combinar texto y saltos de línea con printf usando %n
        System.out.printf("Primera línea%nSegunda línea%nTercera línea%n");
        // Combinar println y print
        System.out.print("Hola ");
        System.out.println("Mundo! (usando print y println combinados)");
        // Ejemplo visual completo
        System.out.println("--------------------------------------");
        System.out.println("Ejemplo visual de la diferencia:");
        System.out.print("print -> ");
        System.out.print("No hay salto de línea ");
        System.out.print("todo seguido ");
        System.out.println(); // ahora sí hay salto
        System.out.println("println -> Este sí hace salto de línea");
        System.out.println("--------------------------------------");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
    }
}
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

        // 7. Utiliza varios println para imprimir una frase.

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
    }
}
package Clase_04;

import java.util.Scanner;

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18)
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Ingresa tu edad: ");
        int age = 20;
        if (age >= 18) {
            System.out.println("Puedes votar porque eres mayor de edad.");
        }else{
            System.out.println("Lo siento eres menor de edad y no puede votar.");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        //System.out.print("Ingresa el primer numero: ");
        int n1 = 9;
        //System.out.print("Ingresa el segundo numero: ");
        int n2 = 10;
        if (n1 > n2) {
            System.out.println("El primer numero es mayor");
        }else if (n1 < n2) {
            System.out.println("El segundo numero es mayor");
        }else{
            System.out.println("Los números son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int n = -9;
        if (n > 0) {
            System.out.println("Es un numero positivo");
        }else if(n < 0){
            System.out.println("Es un numero negativo");
        }else{
            System.out.println("Es 0");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int a = 1;
        if (a % 2 == 0) {
            System.out.println("El numero es Par");
        }else if(a % 2 == 1) {
            System.out.println("El numero es Impar");
        }else{
            System.out.println("Null");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int num = 100;
        if (num >= 1 && num <= 100) {
            System.out.println("El numero si esta en el rango de 1 a 100");
        }else{
            System.out.println("El numero no esta en el rango de 1 a 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

    }
}

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
        var day = 7;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El dia no existe");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 10;
        if (nota == 100){
            System.out.println("Sobresaliente");
        }else if(nota >= 70){
            System.out.println("Aprobado");
        }else if(nota < 70){
            System.out.println("Suspenso");
        }else{
            System.out.println("Nota no admitida");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edad = 15;
        boolean acompañado = false;
        if (edad >= 15 || acompañado == true){
            System.out.println("Puedes entrar al cine");
        }else{
            System.out.println("Lo siento pero no puede entrar");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        String letter = "b";
        if ("AEIOUaeiou".contains(letter)){
            System.out.println("Vocal");
        }else{
            System.out.println("Consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

    }
}

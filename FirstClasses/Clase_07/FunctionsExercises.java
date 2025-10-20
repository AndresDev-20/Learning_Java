package Clase_07;

public class FunctionsExercises {

    public static void main(String[] args) {
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        welcomeCurse();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        greetingPerson("Andres");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        System.out.println(subtraction(88, 33));

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        System.out.println(squareNumber(44));

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        System.out.println(parImpar(0));
        System.out.println(parImpar(2));
        System.out.println(parImpar(3));

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        System.out.println(ageDetermination(20));

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        System.out.println(stringLength("Andres.dev"));

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 8;
        arr[3] = 31;
        arr[4] = 12;
        System.out.println(arrayMeasure(arr));

        // 9. Escribe un método que reciba un número y retorna su factorial.

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    }

    public static void welcomeCurse() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    public static void greetingPerson(String name){
        System.out.println("Hello " + name + ", " + "welcome to class." );
    }

    public static int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    public static int squareNumber(int num) {
        return num * num;
    }

    public static String parImpar(int number) {
        if (number % 2 == 0){
            return "Es Par";
        }
        return "Es Impar";
    }

    public static boolean ageDetermination(int age) {
        if (age < 18){
            return false;
        }
        return true;
    }

    public static int stringLength(String str) {
        var res = str.length();
        return res;
    }

    public static double arrayMeasure(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return (double) sum / numbers.length;
    }

}

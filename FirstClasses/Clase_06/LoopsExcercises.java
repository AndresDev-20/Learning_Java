package Clase_06;

import java.util.ArrayList;

public class LoopsExcercises {

    public static void main(String[] args) {
        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        while (i <= 10) {
            System.out.println("Numero: " + i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        int index = 0;
        do {
            System.out.println(colors.get(index));
            index++;
        } while (index < colors.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        System.out.println("Múltiplos de 5 del 1 al 50:");
        for (int j = 1; j <= 50; j++) {
            if (j % 5 == 0) {
                System.out.println("→ " + j);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numbers = {10, 50, 31, 41, 52};
        int result = 0;
        for (int a = 0; a < numbers.length; a++){
            result = result + numbers[a];
            System.out.println(numbers[a]);
        }
        System.out.println("Resultado de la suma del array: " + result);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] cars = {"Toyota", "Nissan", "Mercedes"};
        for (String car: cars) {
            System.out.println(car);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        // 10. Crea un programa que calcule el factorial de un número dado.
    }
}

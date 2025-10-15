package Clase_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] array = {"Andres", "Dev"};
        System.out.println(array.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(array[1]);
        array[1] = "Marroquin";
        System.out.println(array[1]);

        // 3. Crea un ArrayList vacío.
        ArrayList<String> colors = new ArrayList<>();
        System.out.println(colors);

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        colors.add("Red");
        colors.add("Blue");
        System.out.println(colors);
        colors.remove(1);
        System.out.println(colors);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> animals = new HashSet<>();
        animals.add("Gato");
        animals.add("Perro");
        System.out.println(animals);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        animals.add("Gato");
        animals.add("Loro");
        System.out.println(animals);

        // 7. Elimina uno de los elementos del HashSet.
        animals.remove("Gato");
        System.out.println(animals);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, Long> data = new HashMap<>();
        data.put("Ana", 3227223062L);
        data.put("Bella", 3227243062L);
        data.put("Luz", 3227228062L);
        System.out.println(data);

        // 9. Modifica uno de los contactos y elimina otro.
        data.replace("Ana", 3015567890L);
        data.remove("Bella");
        System.out.println(data);

        // 10. Dado un Aray, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] arr = {"Andres", "Alan", "Alisson"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Lista: " + list);

        HashSet<String> set = new HashSet<>(List.copyOf(list));
        System.out.println("Conjunto(Set): " + set);

        HashMap<Integer, String> map = new HashMap<>();

        for (String elemet : set){
            map.put(elemet.length(), elemet);
        }
         System.out.println(map);

    }
}

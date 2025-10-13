package Clase_05;

import java.util.HashSet;

public class Set {

    public static void main(String[] args) {

        // Declaración y creación
        HashSet<String> fruits = new HashSet<>();
        System.out.println(fruits);

        // Tamaño
        System.out.println(fruits.size());

        // Añadir elementos
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        System.out.println(fruits);

        // Eliminar elementos
        fruits.remove("Apple");
        System.out.println(fruits);

        // Buscar elementos
        System.out.println(fruits.contains(("Banana")));
    }
}

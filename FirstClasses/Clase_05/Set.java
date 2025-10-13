package Clase_05;

import java.util.HashSet;

public class Set {

    public static void main(String[] args) {

        // Declaración y creación
        HashSet<String> fruits = new HashSet<>();
        HashSet<Integer> numbers = new HashSet<>();
        System.out.println(fruits);

        // Tamaño
        System.out.println(fruits.size());

        // Añadir elementos
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Strawberry");
        System.out.println(fruits);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminar elementos
        fruits.remove("Apple");
        System.out.println(fruits);

        // Buscar elementos
        System.out.println(fruits.contains(("Banana")));

        // Conjuntos
         //fruits.addAll(numbers); Error por incompatibilidad de datos
        var countries = new HashSet<String>();
        countries.add("Banana");
        countries.add("Portugal");
        countries.add("España");
        countries.add("Japón");

        fruits.addAll(countries);
        System.out.println(fruits);

        fruits.removeAll(countries);
        System.out.println(fruits);

        fruits.retainAll(countries);
        System.out.println(fruits);

    }
}

package Clase_05;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño
        System.out.println("Tamaño de mi Lista primer print:" + " " + names.size()); // Dara 0

        // Añadir elementos
        names.add("Andres");
        names.add("Marroquin");
        System.out.println("Tamaño de mi Lista segundo print:" + " " + names.size()); // Dara 0

        // Acceder a los elementos
        System.out.println(names.get(0)); // accedemos por indice
        System.out.println(names.getFirst()); // accedemos por orden

        //Modificar elementos
        names.set(1, "Yeison");
        System.out.println(names);

    }
}

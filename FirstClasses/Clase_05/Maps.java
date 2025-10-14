package Clase_05;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {
        // Declaración y creación
        HashMap<String, String> users = new HashMap<>();

        // Añadir elementos
        users.put("Name", "Andres.dev");
        users.put("Email", "andres@gmail.com");
        users.put("Phone", "3227222011");
        System.out.println(users);

        // Acceder a los elementos
        System.out.println(users.get("Name"));

        //

    }
}

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

        // Verificar elementos
        System.out.println(users.containsKey("Name"));
        System.out.println(users.containsKey("Dev"));
        System.out.println(users.containsValue("Andres.dev"));

        // Eliminar elementos
        users.remove("Name");
        System.out.println(users);

        // Limpiar HashMap
        users.clear();
        System.out.println(users);

    }
}

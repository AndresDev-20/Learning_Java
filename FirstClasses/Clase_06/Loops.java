package Clase_06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {

    public static void main(String[] args) {

        // Loops - Bucles

        // - for controlado por controlador
        for (int i = 0; i < 5; i++){
            System.out.println("Hola, Java!");
        }

        String[] names = {"Andres", "Marroquin", "Bernal"};
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        // for-each
        for (String name: names){
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers){
            System.out.println(number);
        }

        HashMap<String, String> users = new HashMap<>();
        users.put("Name", "Andres.dev");
        users.put("Email", "andres@gmail.com");
        users.put("Phone", "3227222011");

        for (Map.Entry<String, String> user: users.entrySet() ){
            System.out.println(user);
        }
    }
}

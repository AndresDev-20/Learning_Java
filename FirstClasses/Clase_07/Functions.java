package Clase_07;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {
        // Funciones
        for (int i = 0; i < 5; i++) {
            sendEmail();
        }

        // ...
        sendEmail();
        sedEmailToUser("andres@gmail.com");
        sedEmailToUser("andres@gmail.com", "Ingeniero");

        var users = new ArrayList<>(Arrays.asList("andres@gmail.com", "alana@gmail.com", "aliss@gmail.com"));
        sedEmailToUser(users);
    }

    // Función sin parámetros ni retorno
    public static void sendEmail() {
        System.out.println("Hola mundo");
    }

    // Función con parámetros
    public static void sedEmailToUser(String email) {
        System.out.println("Mensaje para " + email);
    }

    public static void sedEmailToUser(String email, String profession) {
        System.out.println("Mensaje para el " + profession + " " +  email);
    }

    public static void sedEmailToUser(ArrayList<String> emails) {
        for (String email: emails) {
            System.out.println(email);
        }
    }
}

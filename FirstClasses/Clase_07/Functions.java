package Clase_07;

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
}

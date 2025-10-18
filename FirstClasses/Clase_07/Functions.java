package Clase_07;

public class Functions {

    public static void main(String[] args) {
        // Funciones
        for (int i = 0; i < 5; i++) {
            sendEmail();
        }

        // ...
        sendEmail();
    }

    // Función sin parámetros ni retorno
    public static void sendEmail() {
        System.out.println("Hola mundo");
    }
}

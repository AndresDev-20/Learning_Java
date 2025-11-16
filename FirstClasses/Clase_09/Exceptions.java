package Clase_09;

public class Exceptions {

    public static void main(String[] args) {
        // Manejo de excepciones
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error en el código: " + e.getMessage());
        }
        System.out.println("Fin");


    }

}

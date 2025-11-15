package Clase_08;

public class Composition {
    // Composición
    public static void main(String[] args) {

    }

    // Clases
    public static class Engine {

        // Métodos
        public void on() {
            System.out.println("El motor se encendió");
        }
    }
    public static class Car {
        Engine engine = new Engine();
    }
}

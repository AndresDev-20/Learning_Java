package Clase_08;

public class Composition {
    // Composición
    public static void main(String[] args) {

    }

    // Clases
    public static class Engine {

        // Métodos
        public String on() {
            return "el motor se encendió";
        }
    }
    public static class Car {
        // Atributo con instancia
        Engine engine = new Engine();

        // Métodos
        public void startUp() {
            System.out.println("El auto arranco con " + engine.on());
        }
    }
}

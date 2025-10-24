package Clase_08;

public class inheritance {
    public static void main(String[] args) {

        // Herencia

    }

    public static class Animal {
        // Atributos
        private String name;

        // Constructor
        public Animal(String name) {
            this.name = name;
        }

        // Métodos
        public void eat() {
            System.out.println("El animal " + this.name + " Esta comiendo");
        }
    }
}

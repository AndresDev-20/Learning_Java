package Clase_08;

public class Abstraction {
    public static void main(String[] args) {
        // Abstracción
        var perro = new Dog();
        var gato = new Dog();
        System.out.println(perro);
    }
    // Clase abstracta
    public static abstract class Animal {
        public abstract void sound();

        public void sleep() {
            System.out.println("El animal duerme");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("El perro hace guaoooo");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("El gato hace miauuu");
        }
    }
}

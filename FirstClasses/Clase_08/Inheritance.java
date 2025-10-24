package Clase_08;

public class Inheritance {
    public static void main(String[] args) {

        // Creación de objetos
        Animal animal = new Animal("Max", "Desconocida");
        Dog dog = new Dog("Firulais", "Pitbull", "Guau guau");
        Cat cat = new Cat("Misu", "Siames");

        // Métodos heredados y propios
        System.out.println("---- ANIMAL ----");
        animal.eat();

        System.out.println("\n---- PERRO ----");
        dog.eat();       // Método heredado de Animal
        dog.ladrar();    // Método propio de Dog

        System.out.println("\n---- GATO ----");
        cat.eat();       // Método heredado de Animal
        cat.maullido();  // Método propio de Cat
    }

    // 🔹 Clase padre (superclase)
    public static class Animal {
        // Atributos
        private String name;
        public String raza;

        // Constructor
        public Animal(String name, String raza) {
            this.name = name;
            this.raza = raza;
        }

        // Método
        public void eat() {
            System.out.println("🐾 El animal " + this.name + " está comiendo.");
        }

        // Getter (opcional)
        public String getName() {
            return name;
        }
    }

    // 🔹 Subclase Dog (hereda de Animal)
    public static class Dog extends Animal {
        // Atributo propio
        private String sonido;

        // Constructor
        public Dog(String name, String raza, String sonido) {
            super(name, raza); // Llama al constructor de Animal
            this.sonido = sonido;
        }

        // Método propio
        public void ladrar() {
            System.out.println("🐶 " + getName() + " dice: " + sonido + " y es un " + raza);
        }

        // Ejemplo de sobrescritura con @Override
        @Override
        public void eat() {
            System.out.println("🐶 El perro " + getName() + " está comiendo croquetas 🦴");
        }
    }

    // 🔹 Subclase Cat (hereda de Animal)
    public static class Cat extends Animal {
        // Constructor
        public Cat(String name, String raza) {
            super(name, raza);
        }

        // Método propio
        public void maullido() {
            System.out.println("🐱 El gato " + getName() + " dice: Miau miau 😺");
        }

        // Sobrescritura del método eat()
        @Override
        public void eat() {
            System.out.println("🐱 El gato " + getName() + " está comiendo pescado 🐟");
        }
    }
}

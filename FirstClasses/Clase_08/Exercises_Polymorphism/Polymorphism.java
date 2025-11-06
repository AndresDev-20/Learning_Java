package Clase_08.Exercises_Polymorphism;

import java.util.ArrayList;

public class Polymorphism {

    public static void main(String[] args) {
        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());
        for (Animal animal: animals) {
            animal.makeSound();
        }

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new circle(5));
        shapes.add(new rectangle(3, 2));
        for (Shape shape: shapes) {
            System.out.println(shape.calculateArea());
        }

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        Printer printer = new Printer();
        System.out.println("Resultado de la suma de enteros: " + printer.suma(12, 33));
        System.out.println("Resultado de la suma de decimales: " + printer.suma(1.73, 3.90));
        System.out.println("Resultado de la suma de enteros y decimal: " + printer.suma(12.322, 3.389, 33));

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Andres.dev");

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());
        for (Vehicle vehicle: vehicles) {
            vehicle.start();
        }

        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        Notification notification = new Notification();
        EmailNotification email = new EmailNotification();
        SMSNotification sms = new SMSNotification();
        notification.send();
        notification.sendNotification(email);
        notification.sendNotification(sms);

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        showAnimalType(new Dog());
        showAnimalType(new Cat());
        showAnimalType(new Cow());

        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        Conveter conveter = new Conveter();
        System.out.println(conveter.convert(20));
        System.out.println(conveter.convert(2.1));
        System.out.println(conveter.convert("33"));

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        ArrayList<Product> e = new ArrayList();
        e.add(new Book());
        e.add(new Electronic());
        for (int i = 0; i < e.size(); i++) {
            double res = e.get(i).getPrice();
            System.out.println("Precio del producto: " + res);
        }

        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        Character[] characters = {new Warrior(), new Archer(), new Mage()};
        for (int i = 0; i < characters.length; i++) {
            characters[i].attack();
        }
    }

    // Primer ejercicio
    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("🐶 El perro hace Guaauuuu!!!");
        }
        @Override
        public void getType() {
            System.out.println("Soy perro 🐶");
        }
    }
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("😺 El gato hace Miauuu!!!");
        }
        @Override
        public void getType() {
            System.out.println("Soy gato 😺");
        }
    }
    public static class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("🐮 La vaca hace Muuuuu!!!");
        }
        @Override
        public void getType() {
            System.out.println("Soy Vaca 🐮");
        }
    }

    // Segundo ejercicio
    public static class circle extends Shape {
        // Atributos
        private double radius;
        // Constructor
        public circle(double radius) {
            this.radius = radius;
        }
        // Métodos
        @Override
        public double calculateArea() {
            return  Math.PI * Math.pow(radius, 2);
        }
    }
    public static class rectangle extends Shape {
        // Atributos
        private double base;
        private double height;
        // Constructor
        public rectangle(double base, double height){
            this.base = base;
            this.height = height;
        }
        // Métodos
        @Override
        public double calculateArea() {
            return base * height;
        }
    }

    // Tercer ejercicio
    public  static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("Arranca el auto");
        }
    }
    public  static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("Arranca la bici");
        }
    }
    public  static class Truck extends Vehicle {
        @Override
        public void start() {
            System.out.println("Arranca el Camion");
        }
    }

    // Cuarto ejercicio
    public static class EmailNotification extends Notification {

        // Métodos
        @Override
        public void send() {
            System.out.println("Envió de notificación por email");
        }
    }
    public static class SMSNotification extends Notification {

        // Métodos
        @Override
        public void send() {
            System.out.println("Envió de notificación por mensaje de texto");
        }
    }

    // Quinto ejercicio
    public static void showAnimalType(Animal animal) {
        animal.getType();
    }

    // Sexto ejercicio
    public static class Book extends Product {
        double price = 3000.00;

        @Override
        public double getPrice() {
            double discount = 0.40; // 40%
            return price - (price * discount);
        }
    }
    public static class Electronic extends Product {
        double price = 5000.00;

        @Override
        public double getPrice() {
            double discount = 0.50; // 50%
            return price - (price * discount);
        }
    }

    // Septimo ejercicio
    public static class Warrior extends Character {
        @Override
        public void attack() {
            System.out.println("Luna infernal");
        }
    }
    public static class Archer extends Character {
        @Override
        public void attack() {
            System.out.println("Flecha sagrada");
        }
    }
    public static class Mage extends Character {
        @Override
        public void attack() {
            System.out.println("Truco magico");
        }
    }
}

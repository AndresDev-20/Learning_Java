package Clase_08.Exercises_Abstraction;

public class AbstractionExercises {

    public static void main(String[] args) {
        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area del circulo: " + circle.calculateArea());
        System.out.println("Area del Rectangulo: " + rectangle.calculateArea());

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        guitar.play();
        piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        Animal[] animals = {new Dog(), new Cat()};
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        Square square = new Square();
        Triangle triangle = new Triangle();
        square.draw();
        triangle.draw();

        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(2000.00);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(100.00, 5);
        System.out.println(fullTimeEmployee.calculateSalary());
        System.out.println(partTimeEmployee.calculateSalary());

        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        Car car = new Car();
        car.move();

        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.

        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
    }

    // Primer ejercicio
    public static class Circle extends Shape {
        // Atributos
        private double radius;
        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }
        // Métodos
        @Override
        public double calculateArea() {
            return Math.PI * Math.pow(radius, 2);
        }
    }
    public static class Rectangle extends Shape {
        // Atributos
        private double base;
        private double altura;
        // Constructor
        public Rectangle(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }
        // Métodos
        @Override
        public double calculateArea() {
            return base * altura;
        }
    }

    // Segundo ejercicio
    public interface Playable {
        void play();
    }
    public static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("trin trin trin");
        }
    }
    public static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("Tin tin tin");
        }
    }

    // Tercer ejercicio
    public static class Dog extends Animal {
        // Métodos
        @Override
        public void makeSound() {
            System.out.println("Guauuuu!!!");
        }
    }
    public static class Cat extends Animal {
        // Métodos
        @Override
        public void makeSound() {
            System.out.println("Miauuuuu");
        }
    }

    // Cuarto ejercicio
    public interface Drawable {
        // Métodos
        void draw();
    }
    public static class Square implements Drawable {
        @Override
        public void draw() {
            System.out.println("Se dibuja un cuadro con todos sus lados iguales");
        }
    }
    public static class Triangle implements Drawable {
        // Métodos
        @Override
        public void draw() {
            System.out.println("Se dibuja un triangulo como su nombre lo dice tres lados");
        }
    }

    // Quinto ejercicio
    public static class FullTimeEmployee extends Employee {
        // Atributos
        double monthSalary;
        // Constructor
        public FullTimeEmployee(double monthSalary) {
            this.monthSalary = monthSalary;
        }
        // Métodos
        @Override
        public double calculateSalary() {
            return monthSalary;
        }
    }
    public static class PartTimeEmployee extends Employee {
        // Atributos
        private double salary;
        private int hour;
        // Constructor
        public PartTimeEmployee(double salary, int hour) {
            this.salary = salary;
            this.hour = hour;
        }
        // Métodos
        @Override
        public double calculateSalary() {
            return salary * hour;
        }
    }

    // Sexto ejercicio
    public interface Movable {
        void move();
    }
    public static class Car implements Movable {
        // Métodos
        @Override
        public void move() {
            System.out.println("El carro anda rodando");
        }
    }
    public static class Robot implements Movable {
        // Métodos
        @Override
        public void move() {
            System.out.println("El robot es humanoide por lo que no roda sino que gatea");
        }
    }
}

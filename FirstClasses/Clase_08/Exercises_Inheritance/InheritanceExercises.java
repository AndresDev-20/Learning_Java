package Clase_08.Exercises_Inheritance;

public class InheritanceExercises {

    public static void main(String[] args) {
        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        Car car = new Car();
        car.move();
        car.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        Student student = new Student("Andres.dev", 20, 95.0);
        student.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        Manager manager = new Manager("Andres.dev", 3100000.00, "Alcon hero piso 22");
        manager.info();

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.calculateArea();
        rectangle.calculateArea();

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        Eagle eagle = new Eagle();
        eagle.fly();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        new Phone();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
    }

    // Primer ejercicio
    public static class Car extends Vehicle {
        // Métodos
        public void honk() {
            System.out.println("Pi Pi");
        }
    }

    // Segundo ejercicio
    public static class Student extends Person {
        // Atributos
        double grade;
        // Constructor
        public Student(String name, int age, double grade) {
            super(name, age);
            this.grade = grade;
        }
        // Métodos
        public void study() {
            System.out.println("Estoy estudiando en el grado 11, mi nombre es " + getName() + ", tengo " + getAge() + " años y mi nota de este año fue de " + this.grade);
        }
    }

    // Tercer ejercicio
    public static class Dog extends Animal{
        // Métodos
        @Override
        public void makeSound() {
            System.out.println("Sonido de perro Woof!!");
        }
    }
    public static class Cat extends Animal {
        // Métodos
        @Override
        public void makeSound() {
            System.out.println("Sonido de gato Meow!!");
        }
    }

    // Cuarto ejercicio
    public static class Manager extends Employee {
        // Atributos
        String department;
        // Constructor
        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
        // Métodos
        public void info() {
            System.out.println("Empleado: " + getName() + " Salario: " + getSalary() + " depa: " + this.department);
        }
    }

    // Quinto ejercicio
    public static class Circle extends Shape {
        @Override
        public void calculateArea() {
            System.out.println("Método Implementado");
        }
    }
    public static class Rectangle extends Shape {
        @Override
        public void calculateArea() {
            System.out.println("Método Implementado");
        }
    }

    // Sexto ejercicio
    public static class Eagle extends Bird {
        // Métodos
        @Override
        public void fly() {
            super.fly();
            System.out.println("Metodo sobre escrito en la clase eagle");
        }
    }

    // Séptimo ejercicio
    public static class Phone extends Device {
        public Phone() {
            super();
            System.out.println("Phone ready");
        }
    }

    // Octavo ejercicio
    public static class SavingsAccount extends Bank {
        public SavingsAccount(double acount) {
            super(acount);
        }
    }
}

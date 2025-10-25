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

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.

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
    public static class
}

package Clase_08;

public class Polymorphism {

    public static void main(String[] args) {

        // Polimorfismo
        // - Polimorfismo por herencia(sobrescritura)
        var animal = new Animal();
        var dog = new Dog();
        animal.sound();
        dog.sound();

        // Polimorfismo por sobrecarga (sobrecarga de métodos)
        var calculator = new Calculator();
        System.out.println(calculator.sum(3, 5));
        System.out.println(calculator.sum(3.2, 5.9));
    }
    public static class Animal {

        public void sound() {
            System.out.println("Algún sonido");
        }
    }
    public static class Dog extends Animal {
        @Override
        public void sound() {
            super.sound();
            System.out.println("Guauuuuu!!!");
        }
    }


    public static class Calculator {
        public int sum( int a, int b) {
            return a + b;
        }
        public double sum(double a, double b) {
            return a + b;
        }
    }
}

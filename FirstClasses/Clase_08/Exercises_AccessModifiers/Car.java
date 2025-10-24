package Clase_08.Exercises_AccessModifiers;

public class Car {

    // Atributos
    private int speed;

    // constructor
    public Car(int speed) {
        this.speed = speed;
    }

    // Métodos
    public void accelerate(int amount) {
        if (amount < 120) {
            this.speed = this.speed + amount;
        } else {
           System.out.println("Limite de velocidad");
        }
    }

    public void brake(int amount) {
        if (amount > 0) {
            this.speed = this.speed - amount;
        } else {
            System.out.println("Limite de velocidad");
        }
    }

    public int getSpeed() {
        return this.speed;
    }
}

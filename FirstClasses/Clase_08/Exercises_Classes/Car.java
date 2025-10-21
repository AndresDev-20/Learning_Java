package Clase_08.Exercises_Classes;

public class Car {

    // Atributos
    String brand;
    Integer model;

    // Constructor
    public Car(String brand, Integer model) {
        this.brand = brand;
        this.model = model;
    }

    // Método
    public void showData() {
        System.out.println("Marca: " + this.brand + " Modelo: " + model );
    }
}

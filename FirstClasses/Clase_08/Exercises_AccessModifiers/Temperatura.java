package Clase_08.Exercises_AccessModifiers;

public class Temperatura {

    // Atributos
    private double celsius;

    // Constructor
    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    // Métodos {
    public void setCelsius(double celsius) {
        if ((this.celsius < 100.0) || (this.celsius < -100.0)) {
            this.celsius = celsius;
        }
    }

    public double getCelsius() {
        return this.celsius;
    }
}

package Clase_08.Exercises_Classes;

public class Worker {

    // Atributos
    String name;
    double salary;

    // Constructor
    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Método
    public String getSalary() {
        return "El empleado " + this.name + " tiene un salario de " + this.salary;
    }
}

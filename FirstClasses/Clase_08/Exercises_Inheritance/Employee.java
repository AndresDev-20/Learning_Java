package Clase_08.Exercises_Inheritance;

public class Employee {

    // Atributos
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Métodos getters
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

}

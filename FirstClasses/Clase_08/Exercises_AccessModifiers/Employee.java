package Clase_08.Exercises_AccessModifiers;

public class Employee {

    // Atributos
    private double salary;

    // Constructor
    public Employee(double salary) {
        this.salary = salary;
    }

    // Métodos
    public void raiseSalary(double percent){
        if (percent > 0) {
            this.salary = this.salary + (this.salary * percent / 100);
        } else {
            System.out.println("Cantidad no admitida");
        }
    }


    public double getSalary() {
        return this.salary;
    }
}

package Clase_08.Exercises_Inheritance;

public class Bank {

    // Atributos
    private double acount;

    // Constructor
    public Bank(double acount) {
        this.acount = acount;
    }

    // Métodos
    public void deposit(double amount) {
        this.acount = this.acount + amount;
    }
    public void withdraw(double amount) {
        this.acount = this.acount - amount;
    }
}

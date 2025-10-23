package Clase_08.Exercises_AccessModifiers;

public class BankAccount {

    // Atributos
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Métodos
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("El monto del depósito debe ser positivo.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else if (amount > this.balance) {
            System.out.println("Fondos insuficientes para el retiro.");
        } else {
            System.out.println("El monto del retiro debe ser positivo.");
        }
    }


    public double getBalance() {
        return this.balance;
    }
}

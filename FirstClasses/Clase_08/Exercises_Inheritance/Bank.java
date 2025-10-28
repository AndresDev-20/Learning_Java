package Clase_08.Exercises_Inheritance;

// Clase base (padre)
public class Bank {
    // Atributo
    private double account;

    // Constructor
    public Bank(double account) {
        this.account = account;
    }

    // Métodos comunes
    public void deposit(double amount) {
        account += amount;
        System.out.println("Depósito realizado. Nuevo saldo: " + account);
    }

    public void withdraw(double amount) {
        if (amount > account) {
            System.out.println("Fondos insuficientes.");
        } else {
            account -= amount;
            System.out.println("Retiro realizado. Nuevo saldo: " + account);
        }
    }

    // Getter
    public double getAccount() {
        return account;
    }
}

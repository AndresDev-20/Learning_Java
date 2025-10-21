package Clase_08.Exercises_Classes;

public class BankAccount {

    // Atributos
    double balance;

    // Constructor
    public BankAccount(double balance){
        this.balance = balance;
    }

    // Método
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void showBalance() {
        System.out.println("Saldo actual: $" + balance);
    }
}

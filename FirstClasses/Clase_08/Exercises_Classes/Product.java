package Clase_08.Exercises_Classes;

public class Product {
    // Atributos
    String name;
    double price;
    String discount;

    // Constructor
    public Product(String name, double price, String discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Metodos
    public void Discount() {
        if (this.discount.equals("50%")){
            System.out.println("El precio del movil con el descuento del 50% queda en " + (price - (price * 0.50)));
        } else if (this.discount.equals("30%")) {
            System.out.println("El precio del movil con el descuento del 30% queda en " + (price - (price * 0.30)));
        } else {
            System.out.println("El telefono " + this.name + " No tiene descuento y su precio es de " + this.price);
        }
    }
}

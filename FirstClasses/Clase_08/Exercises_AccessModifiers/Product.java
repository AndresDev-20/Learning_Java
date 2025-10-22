package Clase_08.Exercises_AccessModifiers;

public class Product {

    // Atributos
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Métodos Getter y Setter
    public String getPrice() {
        return "El precio de inicio es " + this.price + " del producto " + this.name;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        } else {
            System.out.println("Precio no valido");
        }
    }

    public String getPriceNew() {
        return "El precio que ha quedado después de la modificación es: " + this.price + " del producto " + this.name;
    }
}

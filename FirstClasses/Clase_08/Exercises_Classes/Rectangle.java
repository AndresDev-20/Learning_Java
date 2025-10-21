package Clase_08.Exercises_Classes;

public class Rectangle {

    // Atributos
    int altura;
    int base;

    // Constructor
    public Rectangle(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    // Métodos
    public int Area() {
        return altura * base;
    }

    public int Perimetro() {
        return 2 * (altura + base);
    }
}

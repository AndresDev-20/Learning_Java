package Clase_09;

public class TrowExample {

    public static void main(String[] args) {
        var age = 17;
        if (age <= 18) {
            throw new RuntimeException("Tienes que ser mayor de edad...");
        }
    }
}

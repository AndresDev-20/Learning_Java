package Clase_08;

public class Person {

    // Atributos
    protected String name;
    int age;

    // Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Métodos
    public void sayHello() {
        System.out.println("Hello, I am " + this.name + " and I'm " + this.age + " years.");
    }
}

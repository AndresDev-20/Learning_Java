package Clase_08;

public class Person {

    // Atributos
    protected String name;
    int age;
    final private String ID;

    // Constructor
    public Person(String name, int age, String ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    // Métodos
    public void sayHello() {
        System.out.println("Hello, I am " + this.name + " and I'm " + this.age + " years.");
    }

    // Getter
    public String getID() {
        return ID;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no valida");
        }
    }
}

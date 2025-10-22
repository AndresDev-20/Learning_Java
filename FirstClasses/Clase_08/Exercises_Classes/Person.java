package Clase_08.Exercises_Classes;

import java.util.ArrayList;

public class Person {

    //Atributos
    String name;
    String lastName;
    String profession;
    ArrayList<String> person;

    // Constructor
    public Person(String name, String lastName, String profession) {
        this.name = name;
        this.lastName = lastName;
        this.profession = profession;
        this.person = new ArrayList<>();
    }

    // Métodos
    public void setPerson() {
        person.add(this.name);
        person.add(this.lastName);
        person.add(this.profession);
    }
    public String getPerson() {
        return "[" + person.get(0) + ", " + person.get(1)  + ", " + person.get(2)  + "]";
    }
}

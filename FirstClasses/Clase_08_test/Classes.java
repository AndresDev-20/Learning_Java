package Clase_08_test;

import Clase_08.Person;

public class Classes {
    public static void main(String[] args) {
        Person person = new Person("Andres.dev", 20, "12321");
        System.out.println(person.getID());
        person.setAge(15);
        person.sayHello();
    }
}

package Clase_08.Exercises_Classes;

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("Una Vida Extraordinaria", "Juan Benigno");
        System.out.println(book.title);
        System.out.println(book.autor);

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog();
        dog.Bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book2 = new Book("Una pena en vida", "Juan namgenio");
        System.out.println(book2.title);
        System.out.println(book2.autor);

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        Car car = new Car("Toyota", 2005);
        car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        Students student = new Students("Andres.dev", 90);
        System.out.println(student.qualification());

        Students student2 = new Students("Alan", 50);
        System.out.println(student2.qualification());

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        BankAccount bankAccount = new BankAccount(2000.00);
        bankAccount.showBalance();
        bankAccount.deposit(3300.00);
        bankAccount.showBalance();

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        Rectangle rectangle = new Rectangle(4, 8);
        System.out.println(rectangle.Area());
        System.out.println(rectangle.Perimetro());

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        Worker worker = new Worker("Andres.dev",2000.00);
        System.out.println(worker.getSalary());

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        Person person = new Person("Yeison Andres", "Marroquin Bernal", "Software Engineer");
        person.setPerson();
        System.out.println(person.getPerson());

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        Product product = new Product("Xiaomi 11Tpro", 2100000.00, "30%");
        product.Discount();
    }
}

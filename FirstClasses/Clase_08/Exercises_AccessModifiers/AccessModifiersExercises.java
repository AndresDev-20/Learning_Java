package Clase_08.Exercises_AccessModifiers;

public class AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        Person person = new Person("Andres.dev", 20);
        System.out.println(person.getName());
        person.setName("Yeison");
        System.out.println(person.getName());

        System.out.println(person.getAge());
        person.setAge(19);
        System.out.println(person.getAge());

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        Product product = new Product("Asus Tuf Gamming F15", 7830000.00);
        System.out.println(product.getPrice());
        product.setPrice(8720000.00);
        System.out.println(product.getPriceNew());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        // Crear una cuenta con un saldo inicial
        BankAccount bankAccount = new BankAccount(7800000.00);
        // Mostrar el saldo inicial
        System.out.println("💰 Saldo inicial: " + bankAccount.getBalance());
        // Realizar un depósito
        bankAccount.deposit(3000000.00);
        System.out.println("💰 Saldo después del depósito: " + bankAccount.getBalance());
        // Realizar un retiro
        bankAccount.withdraw(5000000.00);
        System.out.println("💰 Saldo después del retiro: " + bankAccount.getBalance());

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        Book book = new Book("Una Vida Extraordinaria");
        System.out.println("📖 Titulo del libre: " + book.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -
        Temperatura temperatura = new Temperatura(50.0);
        System.out.println("Temperatura actual: " + temperatura.getCelsius());
        temperatura.setCelsius(-10.0);
        System.out.println("Temperatura nueva: " + temperatura.getCelsius());

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        User user = new User("Andres.dev", "Amaterasu");
        System.out.println(user.user());
        user.setUserName("Yeison Andres");
        System.out.println(user.user());
        System.out.println(user.checkPassword("Mangekyou"));
        System.out.println(user.checkPassword("Amaterasu"));

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
    }
}

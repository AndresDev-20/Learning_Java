package Projects.Project_One;

public class Main {
    public static void main(String[] args) {
        RegisterCar registro = new RegisterCar();

        // Crear algunos autos
        Car auto1 = new Car("Toyota", 2020, "Rojo", "ABC123");
        Car auto2 = new Car("Mazda", 2021, "Azul", "XYZ789");
        Car auto3 = new Car("Ford", 2022, "Blanco", "JKL456");

        // Agregarlos al registro
        registro.agregarAuto(auto1);
        registro.agregarAuto(auto2);
        registro.agregarAuto(auto3);

        // Mostrar todos los autos
        System.out.println("=== Autos Registrados ===");
        registro.mostrarTodos();

        // Buscar por marca
        System.out.println("=== Buscando autos de marca Mazda ===");
        registro.buscarPorMarca("Mazda");
    }
}

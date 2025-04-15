package Projects.Project_One;

import java.util.ArrayList;

public class RegisterCar {
    private ArrayList<Car> autosRegistrados = new ArrayList<>();

    public void agregarAuto(Car auto) {
        autosRegistrados.add(auto);
    }

    public void mostrarTodos() {
        if (autosRegistrados.isEmpty()) {
            System.out.println("No hay autos registrados.");
        } else {
            for (Car auto : autosRegistrados) {
                auto.mostrarInformacion();
            }
        }
    }

    public void buscarPorMarca(String marcaBuscada) {
        boolean encontrado = false;
        for (Car auto : autosRegistrados) {
            if (auto.getMarca().equalsIgnoreCase(marcaBuscada)) {
                System.out.println("Auto encontrado:");
                auto.mostrarInformacion();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún auto con esa marca.");
        }
    }
}

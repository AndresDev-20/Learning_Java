package Clase_09;

public class TemperatureChecker {
    // Métodos
    public void temperature(int degrees) throws NewCustomException {
        if (degrees < -50 || degrees > 50){
            throw new NewCustomException("Temperatura fuera del rango permitido (-50 a 50)");
        } else {
            System.out.println("temperature above zero");
        }

    }
}

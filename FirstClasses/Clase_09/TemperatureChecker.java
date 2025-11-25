package Clase_09;

public class TemperatureChecker {

    // Métodos
    public void temperature(int degrees) throws NewCustomException {
        if (degrees < 50){
            throw new NewCustomException("subzero temperature");
        } else
    }
}

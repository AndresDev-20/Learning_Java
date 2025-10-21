package Clase_08.Exercises_Classes;

public class Students {

    // Atributos
    String name;
    int score;

    // Constructor
    public Students(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Método
    public String qualification() {
        if (score >= 60){
            return "Aprobó";
        }
        return "Reprobó";
    }
}

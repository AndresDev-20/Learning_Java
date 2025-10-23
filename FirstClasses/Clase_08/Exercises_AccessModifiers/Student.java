package Clase_08.Exercises_AccessModifiers;

public class Student {

    // Atributos
    private double grade;

    // Constructor
    public Student(double grade) {
        this.grade = grade;
    }

    // Métodos
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        if (this.grade >= 60) {
            return true;
        } else {
            return false;
        }
    }
}

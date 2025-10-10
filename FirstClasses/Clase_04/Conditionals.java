package Clase_04;

public class Conditionals {

    public static void main(String[] args) {
        // Condicionales
        var age = 50;
        //if, else if, else if
        if (age >= 18 && age <= 30) {
            System.out.println("Eres mayor de edad");
        } else if (age < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres demaciado viejo para este programa");
        }

        //switch
        var day = 7;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El dia no existe");
                break;
        }
    }
}

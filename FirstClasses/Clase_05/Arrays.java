package Clase_05;

public class Arrays {

    public static void main(String[] args) {
        //Declaración y creación
        int[] numbers = new int[4];
        System.out.println(numbers);

        String[] name = {"Andres", "Yeison", "Marroquin"};
        System.out.println(name);

        // Acceso
        System.out.println(numbers[2]); // 0
        System.out.println(name[0]); // "Andres"

        // Modificación -> Debe de hacerce en orden de indise ya que si no se hace dara un error
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 9;
        numbers[3] = 99;

        name[2] = "andremarroquin@hmail.com";
        System.out.println(name[2]);

        // Anulación de un elemento
        name[2] = null;
        System.out.println(name[2]);

        System.out.println(numbers[1]);
    }
}

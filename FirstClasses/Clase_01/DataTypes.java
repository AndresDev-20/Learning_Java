package Clase_01;
public class DataTypes {

    public static void main(String[] args) {

        //Tipos de datos primitivos
        // para números
        int myInt = 37;
        System.out.println(myInt);

        double myDouble = 1.23;
        System.out.println(myDouble);
        // float, long, byte

        // para caracteres
        char myChar = 'a';
        System.out.println(myChar);

        // booleanos
        boolean myBoolean = true;
        System.out.println(myBoolean);


        // Como saber el tipo de dato en compilación para un dato no primitivo
        String text = "Hi, this is a text for test";
        System.out.println(text.getClass().getSimpleName());



    }
}

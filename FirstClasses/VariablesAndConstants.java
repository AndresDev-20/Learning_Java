public class VariablesAndConstants {

    public static void main(String[] args) {

        // Variables
        String name = "Andres.dev";
        System.out.println(name);

        name = "Yeison.dev";
        System.out.println(name);

          // name = 20; Error (No podemos cambiar el tipo de dato)

        int age = 20;
        System.out.println(age);

        var address = "Casa 123, con carrera 5 en calle 7";
        System.out.println(address);
        var year = 2025;
        System.out.println(year);


        // Constantes
        final String EMAIL = "andresmarroquin887@gmail.com";
        // EMAIL = "yeison@gmail.com"; Error ya que se define como una constante
        System.out.println(EMAIL);

    }
}

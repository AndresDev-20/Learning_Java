package Clase_09;

public class Exceptions {

    public static void main(String[] args) {
        // Manejo de excepciones

        // try catch
        try {
            var result = 10 / 5;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error en el código: " + e);
        }

        // try con multiples catch
        try {
            var result = 10 / 5;
            String name = "Andres";
            name = null;
            System.out.println(result);
            System.out.println(name.toLowerCase());
        } catch (ArithmeticException e) {
            System.out.println("Error en el código: " + e);
        } catch (NullPointerException e) {
            System.out.println("Ha ocurrido un null pointer mítico");
        }catch (Exception e) {
            System.out.println("Se ha producido un error no esperado");
        }

        // finally
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Fin del bloque try-catch");
        }

        // throw
        TrowExample trowExample = new TrowExample();

        System.out.println("Fin");


    }

}

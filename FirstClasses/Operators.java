public class Operators {

    public static void main(String[] args) {
        //Operadores en Java
        // Aritméticos
        var a = 5;
        var b = 9;
        System.out.println(a + b); // Suma
        System.out.println(a - b); // Resta
        System.out.println(a * b); // Multiplicación
        System.out.println(a / b); // División
        System.out.println(a % b); // Modulación

        // Asignación
        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; // al igual podemos usar el -=, *=, /=, %=.
        System.out.println(a);


        // Comparación (Relacionales)
        System.out.println(a == b); // A es igual a B por ejemplo A=1 y B=1 dara true sino dara false
        System.out.println(a != b); // Diferente igual
        System.out.println(a > b);  // Mayor que
        System.out.println(a >= b); // Mayor igual
        System.out.println(a < b); // Menor que
        System.out.println(a <= b); // Menor igual que

    }
}

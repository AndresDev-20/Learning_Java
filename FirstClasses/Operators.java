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

        // Lógicos
        // Y (And)
        System.out.println("Dara true solo si ambas condiciones son verdaderas");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // O (OR)
        System.out.println("Solo nos dara falso si todo son false pero si uno de los dos es true data true");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // NO (NOT)
        System.out.println("Niega el resultado de la condición si es true sera false y si es false sera true");
        System.out.println(!true); // false
        System.out.println(!false); // true


        // Unarios
        var c = 5; // Se declara una variable 'c' con valor inicial 5
        System.out.println(+c);  // +c → operador unario positivo. No cambia el valor, imprime 5
        System.out.println(-c);  // -c → operador unario negativo. Invierte el signo, imprime -5
        System.out.println(++c); // ++c → pre-incremento: primero incrementa y luego muestra.
        // c pasa de 5 a 6, imprime 6
        System.out.println(c++); // c++ → post-incremento: primero muestra y luego incrementa.
        // imprime 6 (valor actual), luego c pasa a 7
        System.out.println(--c); // --c → pre-decremento: primero decrementa y luego muestra.
        // c pasa de 7 a 6, imprime 6
        System.out.println(c--); // c-- → post-decremento: primero muestra y luego decrementa.
        // imprime 6, luego c pasa a 5

    }
}

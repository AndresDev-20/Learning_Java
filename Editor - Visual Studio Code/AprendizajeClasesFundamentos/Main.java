/* 
En Java, la función main es el punto de entrada principal 
donde comienza la ejecución de cualquier aplicación.

 ¿Para qué sirve el método main?
Es el punto de inicio del programa.

Todo el código que quieras ejecutar debe estar directa o indirectamente dentro del método main, o ser llamado desde él.

Sin este método, el programa no sabe por dónde empezar y no puede ejecutarse correctamente.
*/


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, this is my new project");

        Variables years = new Variables();
        System.out.println(years.edad);
    }
}
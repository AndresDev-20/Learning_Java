package Clase_08;

public class inheritance {
    public static void main(String[] args) {

        // Herencia

    }

    public static class Animal {
        // Atributos
        private String name;
        private String rasa;

        // Constructor
        public Animal(String name, String rasa) {
            this.name = name;
            this.rasa = rasa;
        }

        // Métodos
        public void eat() {
            System.out.println("El animal " + this.name + " Esta comiendo");
        }
    }

    public static class Dog extends Animal {
        // Atributos
        String sonido;
        // Constructor
        public Dog(String name, String rasa, String sonido) {
            super(name, rasa);
            this.sonido = sonido;
        }
        // Métodos
        public void ladrar(){
            System.out.println("Wuaoooo, soy un " + this.rasa );
        }
    }

    public static class Cat extends Animal {
        // Atributos

        // Constructor
        public Cat(String name, String rasa) {
            super(name, rasa);
        }
        //Metodos
        public void maullido(){
            System.out.println("Miauuuuuu");
        }
    }
}

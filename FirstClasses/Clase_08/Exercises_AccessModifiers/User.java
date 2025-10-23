package Clase_08.Exercises_AccessModifiers;

public class User {

    // Atributos
    private String userName;
    private String password;

    // Constructor
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // Métodos
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String checkPassword(String input) {
        if (this.password.equals(input)) {
            return "Contraseña correcta";
        } else {
            return "Contraseña incorrecta";
        }
    }

    public String user() {
        return "Usuario: " + this.userName;
    }
}

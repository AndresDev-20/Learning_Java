package Clase_09;

public class LoginSystem {
    // Atributos
    String name = "Andres.dev";
    String password = "Futury";
    // Metodo
    public void login(String user, String pass) throws LoginFailedException {
        if (user.equals(name) && pass.equals(password)) {
            System.out.println("Logeado");
        } else {
            throw new LoginFailedException("Credenciales incorrectas");
        }
    }

}

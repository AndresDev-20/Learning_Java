package Clase_09;

public class LoginSystem {
    // Atributos
    String user = "Andres.dev";
    String pass = "Futury";
    // Metodo
    public void login(String user, String pass) throws LoginFailedException {
        if (!user.equals(user) && pass.equals(pass)) {
            throw new  LoginFailedException("Credenciales incorrectas");
        } else {
            System.out.println("Logeado");
        }
    }

}

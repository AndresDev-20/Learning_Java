package Clase_09;

public class LoginSystem {
    // Atributos
    String user = "Andres.dev";
    String pass = "Futury";
    // Metodo
    public void login(String user, String pass) throws CustomException {
        if (!user.equals(user) && pass.equals(pass)) {
            throw new CustomException("Credenciales incorrectas")
        }
    }

}

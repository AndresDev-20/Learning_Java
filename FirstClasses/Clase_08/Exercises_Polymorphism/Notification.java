package Clase_08.Exercises_Polymorphism;

public class Notification {

    // Métodos
    public void send() {
        System.out.println("send");
    }
    public void sendNotification(Notification n) {
        n.send();
    }
}

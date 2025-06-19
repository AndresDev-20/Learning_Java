package Projects.Project_One;

public class Car {
    private String marca;
    private int modelo;
    private String color;
    private String placa;

    public Car(String marca, int modelo, String color, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Placa: " + placa);
        System.out.println("-----------------------------");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   public int getModelo(){
        return modelo;
   }

   public void setModelo(int modelo){
        this.modelo = modelo;
   }

   public String getColor(){
    return color;
   }

   public void setColor(String color){
    this.color = color;
   }

   public String getPlaca(){
    return placa;
   }

   public void setPlaca(String placa){
    this.placa = placa;
   }

}

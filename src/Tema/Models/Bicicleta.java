package Tema.Models;

public class Bicicleta {

    private String model;
    private String brand;
    private int pret;



    public Bicicleta() {
    }

    public Bicicleta(String model, String brand, int pret) {
        this.model = model;
        this.brand = brand;
        this.pret = pret;
    }



    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getPret() {
        return this.pret;
    }



    public String descriere() {
        String text ="";
        text+= "Model: " +this.model +"\n";
        text+= "Brand: " + this.brand +"\n";
        text+= "Pret: " +this.pret+ "\n";
        return text;
    }
}


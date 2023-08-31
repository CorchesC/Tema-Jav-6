package Tema.Models;

public class Motocicleta {

    private String model;
    private String brand;
    private int caiPutere;
    private int pret;



    public Motocicleta() {
    }

    public Motocicleta(String model, String brand, int caiPutere, int pret) {
        this.model = model;
        this.brand = brand;
        this.caiPutere = caiPutere;
        this.pret = pret;
    }

    public Motocicleta(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }



    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
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

    public int getCaiPutere() {
        return this.caiPutere;
    }

    public int getPret() {
        return this.pret;
    }



    public String descriere() {
        String text ="";
        text+= "Model: " +this.model +"\n";
        text+= "Brand: " + this.brand +"\n";
        text+= "Cai putere: " +this.caiPutere +"\n";
        text+= "Pret: " +this.pret+ "\n";
        return text;
    }

}

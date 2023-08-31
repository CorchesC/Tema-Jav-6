package Tema.Models;

public class Cuptor {

    private String model;
    private String brand;
    private int pret;
    private String tip;



    public Cuptor() {
    }

    public Cuptor(String model, String brand, int pret, String tip) {
        this.model = model;
        this.brand = brand;
        this.pret = pret;
        this.tip = tip;

    }

    public Cuptor(String model, String brand) {
        this.model = model;
        this.brand = brand;
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

    public void setTip(String tip) {
        this.tip  = tip;
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

    public String getTip() {
        return this.tip;
    }


    public String descriere() {
        String text ="";
        text+= "Model: " +this.model +"\n";
        text+= "Brand: " + this.brand +"\n";
        text+= "Pret: " +this.pret+ "\n";
        text+= "Tip: " +this.tip+ "\n";
        return text;
    }
}


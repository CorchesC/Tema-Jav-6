package Tema.Models;

public class Telefon {

    private String model;
    private String brand;
    private int pret;
    private int memorieRam;
    private int spatiuStocare;



    public Telefon() {
    }

    public Telefon(String model, String brand, int pret, int memorieRam, int spatiuStocare) {
        this.model = model;
        this.brand = brand;
        this.pret = pret;
        this.memorieRam = memorieRam;
        this.spatiuStocare = spatiuStocare;
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

    public void setMemorieRam(int memorieRam) {
        this.memorieRam = memorieRam;
    }

    public void setSpatiuStocare(int spatiuStocare) {
        this.spatiuStocare = spatiuStocare;
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

    public int getMemorieRam() {
        return this.memorieRam;
    }

    public int getSpatiuStocare() {
        return this.spatiuStocare;
    }



    public String descriere() {
        String text ="";
        text+= "Model: " +this.model +"\n";
        text+= "Brand: " + this.brand +"\n";
        text+= "Pret: " +this.pret+ "\n";
        text+= "Memorie ram: " +this.memorieRam+ "\n";
        text+= "Spatiu stocare: " +this.spatiuStocare+ "\n";
        return text;
    }
}

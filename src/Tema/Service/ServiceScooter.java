package Tema.Service;

import Tema.Models.Scooter;

import java.util.ArrayList;

public class ServiceScooter {

    private ArrayList<Scooter> scootere;

    public ServiceScooter(){

        this.scootere = new ArrayList<>();

        Scooter scooter = new Scooter("X-ADV","Honda",100,30000);
        Scooter scooter1 = new Scooter("Primavera","Vesap",80,15000);
        Scooter scooter2 = new Scooter("XMAX 300","Yamaha", 90,11000);

        scootere.add(scooter);
        scootere.add(scooter1);
        scootere.add(scooter2);


    }

    public void afisareScootere() {
        for (int i =0; i < scootere.size(); i++) {
            System.out.println(scootere.get(i).descriere());
        }
    }

    public void  addScooter(Scooter scooter){
        this.scootere.add(scooter);
    }

    public int pozitieScooter(Scooter scooter) {
        for (int i =0; i < scootere.size(); i++) {
            if (scootere.get(i).getBrand().equals(scooter.getBrand()) == true && scootere.get(i).getModel().equals(scooter.getModel()) == true) {
                return i;
            }
        }
        return -1;
    }
    public void removeScooter(int poz) {
        scootere.remove(poz);
    }

    public Scooter ceaMaiScumpScooter() {
        int max =-1;
        Scooter scooterMax =this.scootere.get(0);
        for(int i = 0; i < scootere.size();i++) {
            if (scootere.get(i).getPret() > max) {
                max = scootere.get(i).getPret();
                scooterMax = scootere.get(i);
            }
        }
        return scooterMax;
    }

    public Scooter ceaMaiIeftinScooter() {
        int min = 99999999;
        Scooter scooterMin =this.scootere.get(0);
        for(int i = 0; i < scootere.size();i++) {
            if (scootere.get(i).getPret() < min) {
                min = scootere.get(i).getPret();
                scooterMin = scootere.get(i);
            }
        }
        return scooterMin;
    }
}

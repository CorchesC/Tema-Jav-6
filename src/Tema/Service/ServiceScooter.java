package Tema.Service;

import Tema.Models.Motocicleta;
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
}

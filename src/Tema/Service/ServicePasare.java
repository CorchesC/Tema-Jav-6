package Tema.Service;

import Tema.Models.Pasare;

import java.util.ArrayList;

public class ServicePasare {


    private ArrayList<Pasare> pasari;


    public ServicePasare() {

        this.pasari= new ArrayList<>();
        Pasare pasare = new Pasare("Vultur",5,20,"negrii", true);
        Pasare pasare1 = new Pasare("Uliu",10,15,"maro", true);
        Pasare pasare2 = new Pasare("Pinguin",3,10,"negrii", false);
        Pasare pasare3 = new Pasare("Cioara",6,10,"negrii", true);
        Pasare pasare4 = new Pasare("Porumbel",2,6,"negrii", true);

        pasari.add(pasare);
        pasari.add(pasare1);
        pasari.add(pasare2);
        pasari.add(pasare3);
        pasari.add(pasare4);

    }

    public void afisarePasari() {
        for (int i =0; i < pasari.size(); i++) {
            System.out.println(pasari.get(i).descriere());
        }
    }
}

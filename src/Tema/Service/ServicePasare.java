package Tema.Service;

import Tema.Models.Bicicleta;
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

    public void addPasare(Pasare pasare){
        this.pasari.add(pasare);
    }

    public int pozitiePasare(Pasare pasare) {
        for (int i =0; i < pasari.size(); i++) {
            if (pasari.get(i).getSpecie().equals(pasare.getSpecie()) == true && pasari.get(i).getVarsta() == pasare.getVarsta()) {
                return i;
            }
        }
        return -1;
    }
    public void removePasare(int poz) {
        pasari.remove(poz);
    }

    public Pasare aripiMaxPasare() {
        int max =-1;
        Pasare pasareMax =this.pasari.get(0);
        for(int i = 0; i < pasari.size();i++) {
            if (pasari.get(i).getMarimeAripi() > max) {
                max = pasari.get(i).getMarimeAripi();
                pasareMax = pasari.get(i);
            }
        }
        return pasareMax;
    }

    public Pasare aripiMinPasare() {
        int min = 99999999;
        Pasare pasareMin =this.pasari.get(0);
        for(int i = 0; i < pasari.size();i++) {
            if (pasari.get(i).getMarimeAripi() < min) {
                min = pasari.get(i).getMarimeAripi();
                pasareMin = pasari.get(i);
            }
        }
        return pasareMin;
    }
}

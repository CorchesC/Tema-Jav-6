package Tema.Service;

import Tema.Models.Cuptor;
import Tema.Models.Hota;

import java.util.ArrayList;

public class ServiceHota {

    private ArrayList<Hota> hote;

    public ServiceHota(){

        this.hote = new ArrayList<>();

        Hota hota = new Hota("Zelda", "Klarstein", 1100,"Neincorporata");
        Hota hota1 = new Hota("HB-1285NG", "Hauseberg", 500,"Incorporata");
        Hota hota2 = new Hota("CTB6250", "Beko", 1100,"Incorporata");

        hote.add(hota);
        hote.add(hota1);
        hote.add(hota2);

    }

    public void afisareHote() {
        for (int i =0; i < hote.size(); i++) {
            System.out.println(hote.get(i).descriere());
        }
    }
}
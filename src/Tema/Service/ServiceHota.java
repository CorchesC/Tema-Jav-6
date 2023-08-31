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

    public void  addHota(Hota hota){
        this.hote.add(hota);
    }

    public int pozitieHota(Hota hota) {
        for (int i =0; i < hote.size(); i++) {
            if (hote.get(i).getBrand().equals(hota.getBrand()) == true && hote.get(i).getModel().equals(hota.getModel()) == true) {
                return i;
            }
        }
        return -1;
    }
    public void removeHota(int poz) {
        hote.remove(poz);
    }

    public Hota ceaMaiScumpaHota() {
        int max =-1;
        Hota hotaMax =this.hote.get(0);
        for(int i = 0; i < hote.size();i++) {
            if (hote.get(i).getPret() > max) {
                max = hote.get(i).getPret();
                hotaMax = hote.get(i);
            }
        }
        return hotaMax;
    }

    public Hota ceaMaiIeftinaHota() {
        int min = 99999999;
        Hota hotaMin =this.hote.get(0);
        for(int i = 0; i < hote.size();i++) {
            if (hote.get(i).getPret() < min) {
                min = hote.get(i).getPret();
                hotaMin = hote.get(i);
            }
        }
        return hotaMin;
    }
}
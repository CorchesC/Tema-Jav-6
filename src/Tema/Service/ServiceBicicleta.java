package Tema.Service;

import Tema.Models.Bicicleta;

import java.util.ArrayList;

public class ServiceBicicleta {

    private ArrayList<Bicicleta> biciclete;

    public ServiceBicicleta() {

        this.biciclete = new ArrayList<>();

        Bicicleta bicicleta = new Bicicleta("Freestyle","Bmx",2000);
        Bicicleta bicicleta1 = new Bicicleta("Ghost Kato","Mtb",3200);
        Bicicleta bicicleta2 = new Bicicleta("Retro","Pegas",1800);
        Bicicleta bicicleta3 = new Bicicleta("Fat Bike","Dst",2400);
    }

    public void afisareBiciclete() {
        for (int i =0; i < biciclete.size(); i++) {
            System.out.println(biciclete.get(i).descriere());
        }
    }

    public void addBicicleta(Bicicleta bicicleta){
        this.biciclete.add(bicicleta);
    }

    public int pozitieBicicleta(Bicicleta bicicleta) {
        for (int i =0; i < biciclete.size(); i++) {
            if (biciclete.get(i).getBrand().equals(bicicleta.getBrand()) == true && biciclete.get(i).getModel().equals(bicicleta.getModel()) == true) {
                return i;
            }
        }
        return -1;
    }
    public void removeBicicleta(int poz) {
        biciclete.remove(poz);
    }

    public Bicicleta ceaMaiScumpaBicicleta() {
        int max =-1;
        Bicicleta bicicletaMin =this.biciclete.get(0);
        for(int i = 0; i < biciclete.size();i++) {
            if (biciclete.get(i).getPret() > max) {
                max = biciclete.get(i).getPret();
                bicicletaMin = biciclete.get(i);
            }
        }
        return bicicletaMin;
    }

    public Bicicleta ceaMaiIeftinaBicicleta() {
        int min = 99999999;
        Bicicleta bicicletaMin =this.biciclete.get(0);
        for(int i = 0; i < biciclete.size();i++) {
            if (biciclete.get(i).getPret() < min) {
                min = biciclete.get(i).getPret();
                bicicletaMin = biciclete.get(i);
            }
        }
        return bicicletaMin;
    }
}

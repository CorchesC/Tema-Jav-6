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
}

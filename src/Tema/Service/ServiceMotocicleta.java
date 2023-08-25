package Tema.Service;

import Tema.Models.Motocicleta;
import sun.security.mscapi.CPublicKey;

import java.util.ArrayList;

public class ServiceMotocicleta {
    private ArrayList<Motocicleta> motociclete;

    public ServiceMotocicleta(){

        this.motociclete = new ArrayList<>();

        Motocicleta motocicleta = new Motocicleta("Brabus","KTM",150,300000);
        Motocicleta motocicleta1 = new Motocicleta("450SR","CFMOTO",60,25000);
        Motocicleta motocicleta2 = new Motocicleta("750GS","BMW",100,50000);

        motociclete.add(motocicleta);
        motociclete.add(motocicleta1);
        motociclete.add(motocicleta2);


    }

    public void afisareMotociclete() {
        for (int i =0; i < motociclete.size(); i++) {
            System.out.println(motociclete.get(i).descriere());
        }
    }
}

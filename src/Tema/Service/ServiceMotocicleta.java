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

    public void  addMotocicleta(Motocicleta motocicleta){
        this.motociclete.add(motocicleta);
    }

    public int pozitieMotocicleta(Motocicleta motocicleta) {
        for (int i =0; i < motociclete.size(); i++) {
            if (motociclete.get(i).getBrand().equals(motocicleta.getBrand()) == true && motociclete.get(i).getModel().equals(motocicleta.getModel()) == true) {
                return i;
            }
        }
        return -1;
    }
    public void removeMotocicleta(int poz) {
        motociclete.remove(poz);
    }

    public Motocicleta ceaMaiScumpaMotocicleta() {
        int max =-1;
        Motocicleta motoMax =this.motociclete.get(0);
        for(int i = 0; i < motociclete.size();i++) {
            if (motociclete.get(i).getPret() > max) {
                max = motociclete.get(i).getPret();
                motoMax = motociclete.get(i);
            }
        }
        return motoMax;
    }

    public Motocicleta ceaMaiIeftinaMotocicleta() {
        int min = 99999999;
        Motocicleta motoMin =this.motociclete.get(0);
        for(int i = 0; i < motociclete.size();i++) {
            if (motociclete.get(i).getPret() < min) {
                min = motociclete.get(i).getPret();
                motoMin = motociclete.get(i);
            }
        }
        return motoMin;
    }

}

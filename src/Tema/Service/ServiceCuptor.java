package Tema.Service;

import Tema.Models.Cuptor;

import java.util.ArrayList;

public class ServiceCuptor {

    private ArrayList<Cuptor> cuptoare;

    public ServiceCuptor(){

        this.cuptoare = new ArrayList<>();

        Cuptor cuptor = new Cuptor("AROIM24500BC", "Arctic", 1100,"Electric");
        Cuptor cuptor1 = new Cuptor("HBA534EB0", "Bosch", 2000,"Electric");
        Cuptor cuptor2 = new Cuptor("BBSE12130XD", "Beko", 3000,"Electric");

        cuptoare.add(cuptor);
        cuptoare.add(cuptor1);
        cuptoare.add(cuptor2);

    }

    public void afisareCuptoare() {
        for (int i =0; i < cuptoare.size(); i++) {
            System.out.println(cuptoare.get(i).descriere());
        }
    }
}

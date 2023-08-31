package Tema.Service;

import Tema.Models.Cuptor;
import Tema.Models.Microunde;

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

    public void  addCuptor(Cuptor cuptor){
        this.cuptoare.add(cuptor);
    }

    public int pozitieCuptor(Cuptor cuptor) {
        for (int i =0; i < cuptoare.size(); i++) {
            if (cuptoare.get(i).getBrand().equals(cuptor.getBrand()) == true && cuptoare.get(i).getModel().equals(cuptor.getModel()) == true) {
                return i;
            }
        }
        return -1;
    }
    public void removeCuptor(int poz) {
        cuptoare.remove(poz);
    }

    public Cuptor ceaMaiScumpCuptor() {
        int max =-1;
        Cuptor cuptorMax =this.cuptoare.get(0);
        for(int i = 0; i < cuptoare.size();i++) {
            if (cuptoare.get(i).getPret() > max) {
                max = cuptoare.get(i).getPret();
                cuptorMax = cuptoare.get(i);
            }
        }
        return cuptorMax;
    }

    public Cuptor ceaMaiIeftinCuptor() {
        int min = 99999999;
        Cuptor cuptorMin =this.cuptoare.get(0);
        for(int i = 0; i < cuptoare.size();i++) {
            if (cuptoare.get(i).getPret() < min) {
                min = cuptoare.get(i).getPret();
                cuptorMin = cuptoare.get(i);
            }
        }
        return cuptorMin;
    }
}


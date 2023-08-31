package Tema.Service;


import Tema.Models.Microunde;
import Tema.Models.Motocicleta;


import java.util.ArrayList;

public class ServiceMicrounde {

    private ArrayList<Microunde> CuptoareMicrounde;

    public ServiceMicrounde() {

        this.CuptoareMicrounde = new ArrayList<>();

        Microunde microunde = new Microunde("MG22M8274AT", "Samsung", 1100,"Incorporabil");
        Microunde microunde1 = new Microunde("EMZ421MMTI", "Electrolux", 500,"Neincorporabil");
        Microunde microunde2 = new Microunde("AMW 730/SD", "Whirlpool ", 2400,"Incorporabil");

        CuptoareMicrounde.add(microunde);
        CuptoareMicrounde.add(microunde1);
        CuptoareMicrounde.add(microunde2);

    }

    public void afisareMicrounde() {
        for (int i =0; i < CuptoareMicrounde.size(); i++) {
            System.out.println(CuptoareMicrounde.get(i).descriere());
        }
    }

    public void  addMicrounde(Microunde microunde){
        this.CuptoareMicrounde.add(microunde);
    }

    public int pozitieMicrounde(Microunde microunde) {
        for (int i =0; i < CuptoareMicrounde.size(); i++) {
            if (CuptoareMicrounde.get(i).getBrand().equals(microunde.getBrand()) == true && CuptoareMicrounde.get(i).getModel().equals(microunde.getModel()) == true) {
                return i;
            }
        }
        return -1;
    }
    public void removeMicrounde(int poz) {
        CuptoareMicrounde.remove(poz);
    }

    public Microunde ceaMaiScumpMicrounde() {
        int max =-1;
        Microunde undeMax =this.CuptoareMicrounde.get(0);
        for(int i = 0; i < CuptoareMicrounde.size();i++) {
            if (CuptoareMicrounde.get(i).getPret() > max) {
                max = CuptoareMicrounde.get(i).getPret();
                undeMax = CuptoareMicrounde.get(i);
            }
        }
        return undeMax;
    }

    public Microunde ceaMaiIeftinMicrounde() {
        int min = 99999999;
        Microunde undeMin =this.CuptoareMicrounde.get(0);
        for(int i = 0; i < CuptoareMicrounde.size();i++) {
            if (CuptoareMicrounde.get(i).getPret() < min) {
                min = CuptoareMicrounde.get(i).getPret();
                undeMin = CuptoareMicrounde.get(i);
            }
        }
        return undeMin;
    }
}

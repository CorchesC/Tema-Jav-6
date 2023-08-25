package Tema.Service;


import Tema.Models.Microunde;


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
}

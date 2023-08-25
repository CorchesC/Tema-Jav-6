package Tema.Service;

import Tema.Models.Motocicleta;
import Tema.Models.Telefon;

import java.util.ArrayList;

public class ServiceTelefon {

    private ArrayList<Telefon> telefoane;

    public ServiceTelefon(){

        this.telefoane = new ArrayList<>();

        Telefon telefon = new Telefon("Note 8", "Samsung",2000,6,60);
        Telefon telefon1 = new Telefon("iPhone 15", "Apple",11000,6,250);
        Telefon telefon2 = new Telefon("P60 Pro", "Huawei",4000,10,250);
        Telefon telefon3 = new Telefon("ROG Phone 6", "Asus",6000,12,250);

        telefoane.add(telefon);
        telefoane.add(telefon1);
        telefoane.add(telefon2);
        telefoane.add(telefon3);


    }

    public void afisareTelefoane() {
        for (int i =0; i < telefoane.size(); i++) {
            System.out.println(telefoane.get(i).descriere());
        }
    }
}

package Tema.Service;

import Tema.Models.Tableta;
import Tema.Models.Telefon;

import java.util.ArrayList;

public class ServiceTableta {

    private ArrayList<Tableta> tablete;

    public ServiceTableta(){

        this.tablete = new ArrayList<>();

        Tableta tableta = new Tableta("Tab S9", "Samsung", 6000,8,128);
        Tableta tableta1 = new Tableta("P 11", "Lenovo", 2000,6,64);
        Tableta tableta2 = new Tableta("Redmi Pad", "Huawei", 3000,6,128);
        Tableta tableta3 = new Tableta("iPad 9", "Apple", 2000,6,64);

        tablete.add(tableta);
        tablete.add(tableta1);
        tablete.add(tableta2);
        tablete.add(tableta3);


    }

    public void afisareTelefoane() {
        for (int i =0; i < tablete.size(); i++) {
            System.out.println(tablete.get(i).descriere());
        }
    }
}

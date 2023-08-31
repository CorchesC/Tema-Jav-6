package Tema.Service;

import Tema.Models.Motocicleta;
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

    public void afisareTablete() {
        for (int i =0; i < tablete.size(); i++) {
            System.out.println(tablete.get(i).descriere());
        }
    }

    public void  addTableta(Tableta tableta){
        this.tablete.add(tableta);
    }

    public int pozitietableta(Tableta tableta) {
        for (int i =0; i < tablete.size(); i++) {
            if (tablete.get(i).getBrand().equals(tableta.getBrand()) == true && tablete.get(i).getModel().equals(tableta.getModel()) == true) {
                return i;
            }
        }
        return -1;
    }
    public void removeTableta(int poz) {
        tablete.remove(poz);
    }

    public Tableta tabletaMaxSpatiu() {
        int max =-1;
        Tableta tabMax = this.tablete.get(0);
        for(int i = 0; i < tablete.size();i++) {
            if (tablete.get(i).getSpatiuStocare() > max) {
                max = tablete.get(i).getSpatiuStocare();
                tabMax = tablete.get(i);
            }
        }
        return tabMax;
    }

    public Tableta tabletaMinSpatiu() {
        int min = 99999999;
        Tableta tabMin = this.tablete.get(0);
        for(int i = 0; i < tablete.size();i++) {
            if (tablete.get(i).getSpatiuStocare() < min) {
                min = tablete.get(i).getSpatiuStocare();
                tabMin = tablete.get(i);
            }
        }
        return tabMin;
    }
}

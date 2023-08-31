package Tema.Service;

import Tema.Models.Laptop;
import Tema.Models.Telefon;

import java.util.ArrayList;

public class ServiceLaptop {

    private ArrayList<Laptop> laptopuri;

    public ServiceLaptop(){

        this.laptopuri = new ArrayList<>();

        Laptop laptop = new Laptop("Thinkpad L480", "Lenovo", 1500,8,256);
        Laptop laptop1 = new Laptop("TUF A15", "Asus", 3000,8,1000);
        Laptop laptop2 = new Laptop("GF63", "Msi", 3600,16,512);
        Laptop laptop3 = new Laptop("Nitro 5", "Acer", 4000,16,512);

        laptopuri.add(laptop);
        laptopuri.add(laptop1);
        laptopuri.add(laptop2);
        laptopuri.add(laptop3);



    }

    public void afisareLaptopuri() {
        for (int i =0; i < laptopuri.size(); i++) {
            System.out.println(laptopuri.get(i).descriere());
        }
    }

    public void  addLaptopu(Laptop laptop){
        this.laptopuri.add(laptop);
    }

    public int pozitieLaptop(Laptop laptop) {
        for (int i =0; i < laptopuri.size(); i++) {
            if (laptopuri.get(i).getBrand().equals(laptop.getBrand()) == true && laptopuri.get(i).getModel().equals(laptop.getModel()) == true) {
                return i;
            }
        }
        return -1;
    }
    public void removeLaptop(int poz) {
        laptopuri.remove(poz);
    }

    public Laptop laptopMaxSpatiu() {
        int max =-1;
        Laptop laptopMax = this.laptopuri.get(0);
        for(int i = 0; i < laptopuri.size();i++) {
            if (laptopuri.get(i).getSpatiuStocare() > max) {
                max = laptopuri.get(i).getSpatiuStocare();
                laptopMax = laptopuri.get(i);
            }
        }
        return laptopMax;
    }

    public Laptop laptopMinSpatiu() {
        int min = 99999999;
        Laptop laptopMin = this.laptopuri.get(0);
        for(int i = 0; i < laptopuri.size();i++) {
            if (laptopuri.get(i).getSpatiuStocare() < min) {
                min = laptopuri.get(i).getSpatiuStocare();
                laptopMin = laptopuri.get(i);
            }
        }
        return laptopMin;
    }
}

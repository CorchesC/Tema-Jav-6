package Tema.Service;

import Tema.Models.Laptop;

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
}

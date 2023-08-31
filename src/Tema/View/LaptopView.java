package Tema.View;

import Tema.Models.Laptop;

import Tema.Service.ServiceLaptop;


import java.util.Scanner;

public class LaptopView {
    private ServiceLaptop laptopService;

    private Scanner scanner;






    public LaptopView (){

        this.laptopService= new ServiceLaptop();
        this.scanner= new Scanner(System.in);
    }




    public void play(){



        int alegere=0;
        boolean running=true;

        while (running){

            meniu();


            alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){

                case 1:
                    this.laptopService.afisareLaptopuri();
                    break;
                case 2:
                    this.adaugareLaptop();
                    break;

                case 3:
                    this.stergereLaptop();
                    break;
                case 4:
                    this.afisareLaptopCuCelMaiMultSpatiu();
                    break;
                case 5:
                    this.afisareLaptopCuCelMaiPutinSpatiu();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa laptopurile ");
        System.out.println("Apasati tasta 2 pentru a adauga un laptop");
        System.out.println("Apasati tasta 3 pentru a sterge un laptop");
        System.out.println("Apasati tasta 4 pentru a afisa laptopul cu cel mai mare spatiu de stocare");
        System.out.println("Apasati tasta 5 pentru a afisa laptopul cu cel mai mic spatiu de stocare");
    }

    private void adaugareLaptop() {


        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        System.out.println("Adaugati pretul");
        int pret = Integer.parseInt(scanner.nextLine());

        System.out.println("Adaugati memoria ram");
        int ram = Integer.parseInt(scanner.nextLine());


        System.out.println("Adaugati memoria spatiu stocare");
        int spatiu = Integer.parseInt(scanner.nextLine());




        Laptop laptop = new Laptop(marca,brand,pret,ram,spatiu);

        this.laptopService.addLaptopu(laptop);
    }

    private void stergereLaptop() {

        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        Laptop telefon = new Laptop(marca,brand);

        this.laptopService.removeLaptop(laptopService.pozitieLaptop(telefon));

    }

    private void afisareLaptopCuCelMaiMultSpatiu(){
        System.out.println("Cea m-ai scump laptop este ");

        Laptop laptop =this.laptopService.laptopMaxSpatiu();

        System.out.println(laptop.descriere());
    }


    private void afisareLaptopCuCelMaiPutinSpatiu() {
        System.out.println("Cea mai ieftin laptop este ");

        Laptop laptop = this.laptopService.laptopMinSpatiu();

        System.out.println(laptop.descriere());
    }
}

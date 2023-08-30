package Tema.View;

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
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa laptopurile ");
    }
}

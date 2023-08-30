package Tema.View;

import Tema.Service.ServiceCuptor;

import java.util.Scanner;

public class CuptorView {
    private ServiceCuptor cuptorService;

    private Scanner scanner;






    public CuptorView (){

        this.cuptorService= new ServiceCuptor();
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
                    this.cuptorService.afisareCuptoare();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa cupoarele ");
    }
}

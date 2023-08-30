package Tema.View;

import Tema.Service.ServicePasare;

import java.util.Scanner;

public class PasareView {
    private ServicePasare pasareService;

    private Scanner scanner;






    public PasareView (){

        this.pasareService= new ServicePasare();
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
                    this.pasareService.afisarePasari();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa pasarile ");
    }
}

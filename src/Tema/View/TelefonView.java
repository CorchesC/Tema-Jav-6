package Tema.View;

import Tema.Service.ServiceTelefon;

import java.util.Scanner;

public class TelefonView {

    private ServiceTelefon telefonService;

    private Scanner scanner;






    public TelefonView (){

        this.telefonService= new ServiceTelefon();
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
                    this.telefonService.afisareTelefoane();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa telefoanele ");
    }
}

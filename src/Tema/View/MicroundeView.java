package Tema.View;

import Tema.Service.ServiceMicrounde;

import java.util.Scanner;

public class MicroundeView {
    private ServiceMicrounde microundeService;

    private Scanner scanner;






    public MicroundeView (){

        this.microundeService= new ServiceMicrounde();
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
                    this.microundeService.afisareMicrounde();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisae microunde ");
    }
}

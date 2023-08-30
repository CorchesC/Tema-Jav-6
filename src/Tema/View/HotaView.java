package Tema.View;

import Tema.Service.ServiceHota;

import java.util.Scanner;

public class HotaView {
    private ServiceHota hotaService;

    private Scanner scanner;






    public HotaView (){

        this.hotaService= new ServiceHota();
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
                    this.hotaService.afisareHote();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa hotele ");
    }
}

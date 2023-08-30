package Tema.View;

import Tema.Service.ServiceMotocicleta;

import java.util.Scanner;

public class MotociletaView {
    private ServiceMotocicleta motocicletaService;

    private Scanner scanner;






    public MotociletaView (){

        this.motocicletaService= new ServiceMotocicleta();
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
                    this.motocicletaService.afisareMotociclete();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa motociletele ");
    }
}

package Tema.View;

import Tema.Service.ServiceTableta;
import Tema.Service.ServiceTelefon;

import java.util.Scanner;

public class TabletaView {
    private ServiceTableta tabletaService;

    private Scanner scanner;






    public TabletaView (){

        this.tabletaService= new ServiceTableta();
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
                    this.tabletaService.afisareTablete();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa tabletele ");
    }
}

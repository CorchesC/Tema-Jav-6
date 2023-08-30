package Tema.View;

import Tema.Service.ServiceBicicleta;

import java.util.Scanner;

public class BicicletaView {
    private ServiceBicicleta bicicletaService;

    private Scanner scanner;


    public BicicletaView() {

        this.bicicletaService = new ServiceBicicleta();
        this.scanner = new Scanner(System.in);
    }


    public void play() {


        int alegere = 0;
        boolean running = true;

        while (running) {

            meniu();


            alegere = Integer.parseInt(scanner.nextLine());

            switch (alegere) {

                case 1:
                    this.bicicletaService.afisareBiciclete();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }


    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa bicicletele ");
    }

}

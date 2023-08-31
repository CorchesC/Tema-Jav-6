package Tema.View;

import Tema.Models.Bicicleta;

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
                case 2:
                    this.adaugareBicicleta();
                    break;
                case 3:
                    this.stergereBicicleta();
                    break;
                case 4:
                    this.afisareCeaMaiScumpaBicicleta();
                    break;
                case 5:
                    this.afisareCeaMaiIeftinaBicicleta();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }


    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa bicicletele ");
        System.out.println("Apasati tasta 2 pentru a adauga o bicicleta");
        System.out.println("Apasati tasta 3 pentru a sterge o bicicleta");
        System.out.println("Apasati tasta 4 pentru a afisa cea mai scumpa bicicleta");
        System.out.println("Apasati tasta 5 pentru a afisa cea mai ieftina bicicleta");
    }

    private void adaugareBicicleta() {


        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        System.out.println("Adaugati pretul");
        int pret = Integer.parseInt(scanner.nextLine());

        Bicicleta bicicleta = new Bicicleta(marca,brand,pret);

        this.bicicletaService.addBicicleta(bicicleta);
    }

    private void stergereBicicleta() {

        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        Bicicleta bicicleta = new Bicicleta(marca,brand);

        this.bicicletaService.removeBicicleta(bicicletaService.pozitieBicicleta(bicicleta));

    }

    private void afisareCeaMaiScumpaBicicleta(){
        System.out.println("Cea m-ai scumpa bicicleta este ");

        Bicicleta bicicleta =this.bicicletaService.ceaMaiScumpaBicicleta();

        System.out.println(bicicleta.descriere());
    }


    private void afisareCeaMaiIeftinaBicicleta() {
        System.out.println("Cea mai ieftina bicicleta este ");

        Bicicleta bicicleta = this.bicicletaService.ceaMaiIeftinaBicicleta();

        System.out.println(bicicleta.descriere());
    }

}

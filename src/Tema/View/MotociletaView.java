package Tema.View;

import Tema.Models.Motocicleta;
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
                case 2:
                    this.adaugareMotocicleta();
                    break;

                case 3:
                    this.stergereMotocicleta();
                    break;
                case 4:
                    this.afisareCeaMaiScumpaMotocicleta();
                    break;
                case 5:
                    this.afisareCeaMaiIeftinaMotocicleta();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa motociletele ");
        System.out.println("Apasati tasta 2 pentru a adauga un scooter");
        System.out.println("Apasati tasta 3 pentru a sterge un scooter");
        System.out.println("Apasati tasta 4 pentru a afisa cea mai scump scooter");
        System.out.println("Apasati tasta 5 pentru a afisa cea mai ieftin scooteer");
    }


    private void adaugareMotocicleta() {


        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        System.out.println("Adaugati caii putrere");
        int caiPutere = Integer.parseInt(scanner.nextLine());


        System.out.println("Adaugati pretul");
        int pret = Integer.parseInt(scanner.nextLine());

        Motocicleta motocicleta = new Motocicleta(marca,brand,caiPutere,pret);

        this.motocicletaService.addMotocicleta(motocicleta);
    }

    private void stergereMotocicleta() {

        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        Motocicleta motocicleta = new Motocicleta(marca,brand);

        this.motocicletaService.removeMotocicleta(motocicletaService.pozitieMotocicleta(motocicleta));

    }

    private void afisareCeaMaiScumpaMotocicleta(){
        System.out.println("Cea m-ai scumpa motocicleta este ");

        Motocicleta motocicletaa =this.motocicletaService.ceaMaiScumpaMotocicleta();

        System.out.println(motocicletaa.descriere());
    }


    private void afisareCeaMaiIeftinaMotocicleta() {
        System.out.println("Cea mai ieftina motocicleta este ");

        Motocicleta motocicletaa = this.motocicletaService.ceaMaiIeftinaMotocicleta();

        System.out.println(motocicletaa.descriere());
    }
}

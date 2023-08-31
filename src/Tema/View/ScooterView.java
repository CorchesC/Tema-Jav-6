package Tema.View;


import Tema.Models.Motocicleta;
import Tema.Models.Scooter;
import Tema.Service.ServiceScooter;

import java.util.Scanner;

public class ScooterView {

    private ServiceScooter scooterService;

    private Scanner scanner;






    public ScooterView (){

        this.scooterService= new ServiceScooter();
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
                    this.scooterService.afisareScootere();
                    break;
                case 2:
                    this.adaugareScooter();
                    break;
                case 3:
                    this.stergereScooter();
                    break;
                case 4:
                    this.afisareCeaMaiIeftinScooter();
                    break;
                case 5:
                    this.afisareCeaMaiScumpScooter();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa scoterele ");
        System.out.println("Apasati tasta 2 pentru a adauga un scooter");
        System.out.println("Apasati tasta 3 pentru a sterge un scooter");
        System.out.println("Apasati tasta 4 pentru a afisa cea mai scump scooter");
        System.out.println("Apasati tasta 5 pentru a afisa cea mai ieftin scooteer");
    }

    private void adaugareScooter() {


        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        System.out.println("Adaugati caii putrere");
        int caiPutere = Integer.parseInt(scanner.nextLine());


        System.out.println("Adaugati pretul");
        int pret = Integer.parseInt(scanner.nextLine());

        Scooter scooter = new Scooter(marca,brand,caiPutere,pret);

        this.scooterService.addScooter(scooter);
    }

    private void stergereScooter() {

        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        Scooter scooter = new Scooter(marca,brand);

        this.scooterService.removeScooter(scooterService.pozitieScooter(scooter));

    }

    private void afisareCeaMaiScumpScooter(){
        System.out.println("Cea m-ai scump scooter este ");

        Scooter scooter =this.scooterService.ceaMaiScumpScooter();

        System.out.println(scooter.descriere());
    }


    private void afisareCeaMaiIeftinScooter() {
        System.out.println("Cea mai ieftin scooter este ");

        Scooter scooter = this.scooterService.ceaMaiIeftinScooter();

        System.out.println(scooter.descriere());
    }


}

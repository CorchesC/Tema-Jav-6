package Tema.View;

import Tema.Models.Microunde;
import Tema.Models.Motocicleta;
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
                case 2:
                    this.adaugareMicrounde();
                    break;

                case 3:
                    this.stergereMicrounde();
                    break;
                case 4:
                    this.afisareCeaMaiScumpMicrounde();
                    break;
                case 5:
                    this.afisareCeaMaiIeftinMicrounde();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisae microunde ");
        System.out.println("Apasati tasta 2 pentru a adauga un microunde");
        System.out.println("Apasati tasta 3 pentru a sterge un microunde");
        System.out.println("Apasati tasta 4 pentru a afisa cea mai scump microunde");
        System.out.println("Apasati tasta 5 pentru a afisa cea mai ieftin microunde");
    }


    private void adaugareMicrounde() {


        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        System.out.println("Adaugati pretul");
        int pret = Integer.parseInt(scanner.nextLine());

        System.out.println("Adaugati tipul");
        String tip = scanner.nextLine();


        Microunde microunde = new Microunde(marca,brand,pret,tip);

        this.microundeService.addMicrounde(microunde);
    }

    private void stergereMicrounde() {

        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        Microunde microunde = new Microunde(marca,brand);

        this.microundeService.removeMicrounde(microundeService.pozitieMicrounde(microunde));

    }

    private void afisareCeaMaiScumpMicrounde(){
        System.out.println("Cea m-ai scump microunde este ");

        Microunde microunde =this.microundeService.ceaMaiScumpMicrounde();

        System.out.println(microunde.descriere());
    }


    private void afisareCeaMaiIeftinMicrounde() {
        System.out.println("Cea mai ieftin microunde este ");

        Microunde microunde = this.microundeService.ceaMaiIeftinMicrounde();

        System.out.println(microunde.descriere());
    }
}

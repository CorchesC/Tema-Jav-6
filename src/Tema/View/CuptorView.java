package Tema.View;

import Tema.Models.Cuptor;
import Tema.Models.Microunde;
import Tema.Service.ServiceCuptor;

import java.util.Scanner;

public class CuptorView {
    private ServiceCuptor cuptorService;

    private Scanner scanner;






    public CuptorView (){

        this.cuptorService= new ServiceCuptor();
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
                    this.cuptorService.afisareCuptoare();
                    break;
                case 2:
                    this.adaugareCuptor();
                    break;

                case 3:
                    this.stergereCuptor();
                    break;
                case 4:
                    this.afisareCeaMaiScumpCuptor();
                    break;
                case 5:
                    this.afisareCeaMaiIeftinCuptor();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa cupoarele ");
        System.out.println("Apasati tasta 2 pentru a adauga un microunde");
        System.out.println("Apasati tasta 3 pentru a sterge un microunde");
        System.out.println("Apasati tasta 4 pentru a afisa cea mai scump microunde");
        System.out.println("Apasati tasta 5 pentru a afisa cea mai ieftin microunde");
    }


    private void adaugareCuptor() {


        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        System.out.println("Adaugati pretul");
        int pret = Integer.parseInt(scanner.nextLine());

        System.out.println("Adaugati tipul");
        String tip = scanner.nextLine();


        Cuptor cuptor = new Cuptor(marca,brand,pret,tip);

        this.cuptorService.addCuptor(cuptor);
    }

    private void stergereCuptor() {

        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        Cuptor cuptor = new Cuptor(marca,brand);

        this.cuptorService.removeCuptor(cuptorService.pozitieCuptor(cuptor));

    }

    private void afisareCeaMaiScumpCuptor(){
        System.out.println("Cea m-ai scump cuptor este ");

        Cuptor cuptor =this.cuptorService.ceaMaiScumpCuptor();

        System.out.println(cuptor.descriere());
    }


    private void afisareCeaMaiIeftinCuptor() {
        System.out.println("Cea mai ieftin cuptor este ");

        Cuptor cuptor = this.cuptorService.ceaMaiIeftinCuptor();

        System.out.println(cuptor.descriere());
    }
}

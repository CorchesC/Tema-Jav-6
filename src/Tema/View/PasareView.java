package Tema.View;

import Tema.Models.Motocicleta;
import Tema.Models.Pasare;
import Tema.Service.ServicePasare;

import java.util.Scanner;

public class PasareView {
    private ServicePasare pasareService;

    private Scanner scanner;






    public PasareView (){

        this.pasareService= new ServicePasare();
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
                    this.pasareService.afisarePasari();
                    break;
                case 2:
                    this.adaugarePasare();
                    break;
                case 3:
                    this.stergerePasare();
                    break;
                case 4:
                    this.afisarePasareaCuCeleMaiMariAripi();
                    break;
                case 5:
                    this.afisarePasareaCuCeleMaiMiciAripi();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa pasarile ");
        System.out.println("Apasati tasta 2 pentru a adauga o pasare");
        System.out.println("Apasati tasta 3 pentru a sterge o pasare");
        System.out.println("Apasati tasta 4 pentru a afisa pasarea cu cele mai mari aripi");
        System.out.println("Apasati tasta 5 pentru a afisa pasarea cu cele mai mici aripi");
    }


    private void adaugarePasare() {


        System.out.println("Adaugati specia");
        String specia= scanner.nextLine();

        System.out.println("Adaugati varsta");
        int varsta = Integer.parseInt(scanner.nextLine());

        System.out.println("Adaugati marimea aripilor");
        int marimeAripi = Integer.parseInt(scanner.nextLine());

        System.out.println("Adaugati culoarea ochiilor");
        String culoareOchi= scanner.nextLine();

        System.out.println("Este zburatoare? (DA / NU)");
        String aff = scanner.nextLine();

        boolean zburatoare = false;
        if (aff.equals("DA") == true) {
            zburatoare = true;
        }
        else if (aff.equals("NU") == true) {
            zburatoare = false;
        }


        Pasare pasare = new Pasare(specia,varsta,marimeAripi,culoareOchi,zburatoare);

        this.pasareService.addPasare(pasare);
    }

    private void stergerePasare() {

        System.out.println("Adaugati specia");
        String specia= scanner.nextLine();

        System.out.println("Adaugati varsta");
        int varsta = Integer.parseInt(scanner.nextLine());

        Pasare pasare = new Pasare(specia,varsta);

        this.pasareService.removePasare(pasareService.pozitiePasare(pasare));

    }

    private void afisarePasareaCuCeleMaiMariAripi(){
        System.out.println("Cea m-ai scumpa motocicleta este ");

        Pasare pasare =this.pasareService.aripiMaxPasare();

        System.out.println(pasare.descriere());
    }


    private void afisarePasareaCuCeleMaiMiciAripi() {
        System.out.println("Cea mai ieftina motocicleta este ");

        Pasare pasare = this.pasareService.aripiMinPasare();

        System.out.println(pasare.descriere());
    }

}

package Tema.View;

import Tema.Models.Cuptor;
import Tema.Models.Hota;
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
                case 2:
                    this.adaugareHota();
                    break;
                case 3:
                    this.stergereHota();
                    break;
                case 4:
                    this.afisareCeaMaiScumpaHota();
                    break;
                case 5:
                    this.afisareCeaMaiIeftinaHota();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa hotele ");
        System.out.println("Apasati tasta 2 pentru a adauga o hota");
        System.out.println("Apasati tasta 3 pentru a sterge o hota");
        System.out.println("Apasati tasta 4 pentru a afisa cea mai scumpa hota");
        System.out.println("Apasati tasta 5 pentru a afisa cea mai ieftia hota");
    }


    private void adaugareHota() {


        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        System.out.println("Adaugati pretul");
        int pret = Integer.parseInt(scanner.nextLine());

        System.out.println("Adaugati tipul");
        String tip = scanner.nextLine();


        Hota hota = new Hota(marca,brand,pret,tip);

        this.hotaService.addHota(hota);
    }

    private void stergereHota() {

        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        Hota hota= new Hota(marca,brand);

        this.hotaService.removeHota(hotaService.pozitieHota(hota));

    }

    private void afisareCeaMaiScumpaHota(){
        System.out.println("Cea m-ai scumpa hota este ");

        Hota hota =this.hotaService.ceaMaiScumpaHota();

        System.out.println(hota.descriere());
    }


    private void afisareCeaMaiIeftinaHota() {
        System.out.println("Cea mai ieftina hota este ");

        Hota hota = this.hotaService.ceaMaiIeftinaHota();

        System.out.println(hota.descriere());
    }
}

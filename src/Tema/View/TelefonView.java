package Tema.View;

import Tema.Models.Tableta;
import Tema.Models.Telefon;
import Tema.Service.ServiceTelefon;

import java.util.Scanner;

public class TelefonView {

    private ServiceTelefon telefonService;

    private Scanner scanner;






    public TelefonView (){

        this.telefonService= new ServiceTelefon();
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
                    this.telefonService.afisareTelefoane();
                    break;
                case 2:
                    this.adaugareTelefon();
                    break;
                case 3:
                    this.stergereTelefon();
                    break;
                case 4:
                    this.afisareTelefonCuCelMaiMultSpatiu();
                    break;
                case 5:
                    this.afisareTelefonCuCelMaiPutinSpatiu();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa telefoanele ");
        System.out.println("Apasati tasta 2 pentru a adauga un telefon");
        System.out.println("Apasati tasta 3 pentru a sterge un telefon");
        System.out.println("Apasati tasta 4 pentru a afisa telefonul cu cel mai mare spatiu de stocare");
        System.out.println("Apasati tasta 5 pentru a afisa telefonul cu cel mai mic spatiu de stocare");
    }

    private void adaugareTelefon() {


        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        System.out.println("Adaugati pretul");
        int pret = Integer.parseInt(scanner.nextLine());

        System.out.println("Adaugati memoria ram");
        int ram = Integer.parseInt(scanner.nextLine());


        System.out.println("Adaugati memoria spatiu stocare");
        int spatiu = Integer.parseInt(scanner.nextLine());




        Telefon telefon = new Telefon(marca,brand,pret,ram,spatiu);

        this.telefonService.addTelefon(telefon);
    }

    private void stergereTelefon() {

        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        Telefon telefon = new Telefon(marca,brand);

        this.telefonService.removeTableta(telefonService.pozitieTelefon(telefon));

    }

    private void afisareTelefonCuCelMaiMultSpatiu(){
        System.out.println("Cea m-ai scump telefon este ");

        Telefon telefon =this.telefonService.telefonMaxSpatiu();

        System.out.println(telefon.descriere());
    }


    private void afisareTelefonCuCelMaiPutinSpatiu() {
        System.out.println("Cea mai ieftin telefon este ");

        Telefon telefon = this.telefonService.telefonMinSpatiu();

        System.out.println(telefon.descriere());
    }
}

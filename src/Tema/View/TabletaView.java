package Tema.View;

import Tema.Models.Scooter;
import Tema.Models.Tableta;
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
                case 2:
                    this.adaugareTableta();
                    break;
                case 3:
                    this.stergereTableta();
                    break;
                case 4:
                    this.afisareTabletaCuCelMaiMultSpatiu();
                    break;
                case 5:
                    this.afisareTabletaCuCelMaiPutinSpatiu();
                    break;
                default:
                    System.out.println("ALEGERE GRESITA");
            }
        }

    }



    private void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa tabletele ");
        System.out.println("Apasati tasta 2 pentru a adauga o tableta");
        System.out.println("Apasati tasta 3 pentru a sterge o tableta");
        System.out.println("Apasati tasta 4 pentru a afisa tableta cu cel mai mare spatiu de stocare");
        System.out.println("Apasati tasta 5 pentru a afisa tableta cu cel mai mic spatiu de stocare");
    }

    private void adaugareTableta() {


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




        Tableta tableta = new Tableta(marca,brand,pret,ram,spatiu);

        this.tabletaService.addTableta(tableta);
    }

    private void stergereTableta() {

        System.out.println("Adaugati marca");

        String marca= scanner.nextLine();

        System.out.println("Adaugati brandul");
        String brand = scanner.nextLine();

        Tableta tableta = new Tableta(marca,brand);

        this.tabletaService.removeTableta(tabletaService.pozitietableta(tableta));

    }

    private void afisareTabletaCuCelMaiMultSpatiu(){
        System.out.println("Cea m-ai scumpa tableta este ");

        Tableta tableta =this.tabletaService.tabletaMaxSpatiu();

        System.out.println(tableta.descriere());
    }


    private void afisareTabletaCuCelMaiPutinSpatiu() {
        System.out.println("Cea mai ieftina tableta este ");

        Tableta tableta = this.tabletaService.tabletaMinSpatiu();

        System.out.println(tableta.descriere());
    }
}

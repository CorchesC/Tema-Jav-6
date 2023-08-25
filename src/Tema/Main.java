package Tema;

import Tema.Models.Scooter;
import Tema.Service.*;

import javax.naming.directory.SchemaViolationException;

public class Main {

    public static void main(String[] args) {

        ServicePasare servicePasare = new ServicePasare();
        servicePasare.afisarePasari();

        ServiceMotocicleta serviceMotocicleta = new ServiceMotocicleta();
        serviceMotocicleta.afisareMotociclete();

        ServiceTelefon serviceTelefon = new ServiceTelefon();
        serviceTelefon.afisareTelefoane();

        ServiceTableta serviceTableta = new ServiceTableta();
        serviceTableta.afisareTelefoane();

        ServiceLaptop serviceLaptop = new ServiceLaptop();
        serviceLaptop.afisareLaptopuri();

        ServiceBicicleta serviceBicicleta = new ServiceBicicleta();
        serviceBicicleta.afisareBiciclete();

        ServiceScooter serviceScooter = new ServiceScooter();
        serviceScooter.afisareScootere();

        ServiceCuptor serviceCuptor = new ServiceCuptor();
        serviceCuptor.afisareCuptoare();

        ServiceMicrounde serviceMicrounde = new ServiceMicrounde();
        serviceMicrounde.afisareMicrounde();

        ServiceHota serviceHota = new ServiceHota();
        serviceHota.afisareHote();


    }
}
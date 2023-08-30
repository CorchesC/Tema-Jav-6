package Tema;

import Tema.Models.Scooter;
import Tema.Service.*;
import Tema.View.*;

import javax.naming.directory.SchemaViolationException;
import javax.swing.text.View;

public class Main {

    public static void main(String[] args) {

        TelefonView view1 = new TelefonView();
        view1.play();

        TabletaView view2 = new TabletaView();
        view2.play();

        LaptopView view3 = new LaptopView();
        view3.play();

        MotociletaView view4 = new MotociletaView();
        view4.play();

        BicicletaView view5 = new BicicletaView();
        view5.play();

        ScooterView view6 = new ScooterView();
        view6.play();

        PasareView view7 = new PasareView();
        view7.play();

        HotaView view8 = new HotaView();
        view8.play();

        CuptorView view9 = new CuptorView();
        view9.play();

        MicroundeView view10 = new MicroundeView();
        view10.play();


    }
}
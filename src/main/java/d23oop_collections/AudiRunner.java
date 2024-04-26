package d23oop_collections;

import d22oop.AudiS5;

public class AudiRunner {
    public static void main(String[] args) {

        // Motor m = new Motor(); HATA: interface'lerden object üretemezsiniz

        AudiA4 a4 = new AudiA4();
        a4.turbo();
        a4.esp();
        a4.dijital();

        AudiS5 s5 = new AudiS5();
        s5.gas();
        s5.abs();
        s5.dijital();
        ((Motor)a4).run(); //Audi A4 hava yastığı çalıştırır
        //Motor interface'inden gelen run

        //Motor.fiyat = 5000; final ispati.yeni deger atayamazsiniz

        System.out.println(Motor.fiyat); //300
        System.out.println(Klima.fiyat); //200
        System.out.println(Fren.fiyat); //100

        Motor.hiz(); //Saatte 250 KM
        a4.guc(); //200HP



    }
}

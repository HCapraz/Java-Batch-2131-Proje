package d17passbyvalue_constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {
        //Car clasından bir obje üretelim
        String s = new String("Elma");
        //s.substring(0,1) ==> non-static

        //Class üzerinden çağrılan methodlara static method denir. Obje üzerinden çağrılan methodlara non-static denir.

        Car c1 = new Car("BMW", "3.20", 2024, false); // default constructor denir.

        System.out.println(c1.brand);
        System.out.println(c1.modal);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);

        c1.hareket();
        c1.dur();

        //------------------------------
        Car c2 = new Car("Audi", "A5", 2018, false);
        System.out.println(c2.brand);

        System.out.println(c1); //adres gösterir.@776ec8df
        System.out.println(c2); //adres gösterir.@4eec7777

        //Java'da toString metodu genellikle bir nesnenin içeriğini
        // okunabilir bir String olarak döndürmek için kullanılır.
        //--------------------------------------
        Car c3 = new Car("Fiat", "Şahin");
        System.out.println(c3);
    }
}

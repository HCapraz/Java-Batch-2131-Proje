package d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();

        //s. yaptiğımda sadece publi olan name görünür.
        System.out.println(s.getAge());

        System.out.println(s.isSuccessful());

        System.out.println(s.name);

        s.setAge(25);
        System.out.println(s.getAge());

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());

        //Set ile verileri degistirebiliyoruz, constructor'larla da degistirebiliyoruz.Farki nedir?
        //set ==> mevcut bir nesnenin verilerini degistirmek icin kullanilir
        //constructor ==> Yeni nesnelerin baslangic durumunu belirlemek icin kullanilir.

        //Arastirma Odevi: encapsulation'da private ile gizlenen bir veri baska package'dan set method ile
        //degistirilebilir mi?


        //-----------------------

        //Encapsulation’da bir object olusturup,iki object gibi kullaniyoruz.
        //Kaliptan istedigimiz kadar boyle olusturabiliriz.
        //Memory problemini onler. Bircok object memoryi doldururdu.
    }
}

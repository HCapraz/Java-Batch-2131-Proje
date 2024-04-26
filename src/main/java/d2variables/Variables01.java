package d2variables;

public class Variables01 {

    public static void main(String[] args) {


        //Java bu satırı okumaz. kendimize veya başkasına açıklamadır.


        String selam = "Hello World";
        System.out.println(selam);

        //Ornek 2 : Tamsayi(int) data tipinde ismi age olan bir variable olusturunuz
        // ve icine 15 yukleyip console'a yazdiriniz

        int age = 15;
        System.out.println(age);
        /*
        Not 1 : primitive data typelarini java olusturmustur, biz olusturamayiz
        Not 2 : primitive data typelarinin isimlerinde sadece kucuk harf kullanilir
        Not 3 : primitive datalar data type'larina gore memory'de farkli farkli yer kaplarlar
        Not 4 : primitive datalar iclerinde sadece sizin atadiginiz degeri barindirirlar
         */

        //1-byte data type:
        //Tamsayilar icindir. Hafizada 1 byte(8 bit) yer kaplar.
        //-128 den + 127’e tamsayi degerleri icin kullanilir

        byte ogrenciYasi = 18;
        System.out.println(ogrenciYasi);

        //2- short data type:
        //Tam sayilar icindir. Hafizada 2 byte(16 bit) yer kaplar. Aralik (range) genisledi.
        //-32768 den + 32767’e tamsayi degerleri icin kullanilir


        short siteNufusu = 1200 ;
        System.out.println(siteNufusu);







    }


}
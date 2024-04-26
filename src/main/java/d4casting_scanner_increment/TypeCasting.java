package d4casting_scanner_increment;

public class TypeCasting {
    public static void main(String[] args) {
        /*Sayisal primitive data tiplerinin birbirine donusturulmesine Type Casting denir
        Numeric (sayisal) Data Type ==> byte - short - int - long - float - double */

        /*Not 1: Kucuk data type'larini buyuk data type'larina cevirmeyi Java otomatik olarak yapabilir.
        Bu isleme "AutoWidening" (Otomatik genisletme) denir*/
        /*Not 2: Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir. Veri kaybi olusabilir.
        Java bu isi otomatik olarak yapmaz. Bu islemi kod yazanlar yapar.
        Bu isleme "Explicit Narrowing"(Aciktan Daraltma)denir.*/

        byte age = 13;
        int ageInt = age;

        int weight = 35000;
        short weightShort = (short) weight;
        System.out.println(weightShort);

        //-----------------------
        //Java Library (Java Kutuphanesi)

                /*Java'da kütüphane, belirli bir işlevselliği sağlayan class'lar, interface'ler ve metotlar koleksiyonudur. */
        //.jar (Java Archive) dosylari olarak dagitilir
        //Java Standard Library- JDK

        //Java'da bir kütüphaneyi kullanabilmek için import anahtar kelimesi ile belirtilen
        // class'lari projenize eklemeniz gerekir.

        //Java Standard Library iceriginden bazilari:
        //Java.lang

        // Java Standart Library içeriğinden bazıları:
        // Java.lang
        // Java.util
        // Java.io
        // Java.sql

        //Uçuncu taraf kutuphaneler:
        //Apache Commons
        //Spring Framework
        // Selenium
        //JavaFX, UI
        //Hibernate


    }
}

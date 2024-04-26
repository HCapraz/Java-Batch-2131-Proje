package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        /*Ornek 2:
        Kullanıcıdan;
        i)Adini ve Soyadini
        ii)Yaşını
        iii)Boyunu
        iv)Kilosunu
        v)Medeni durumunu girmesini isteyin.

        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın*/

        Scanner input = new Scanner(System.in);
        System.out.println("adınızı ve soyadinizi giriniz");
        String fullName = input.nextLine(); //nextLine methodu ile birden fazla kelime girdisi alabiliriz

        System.out.println("Yasinizi giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunuzu giriniz");
        float height = input.nextFloat();

        System.out.println("Kilonuzu giriniz");
        short weight = input.nextShort();

        System.out.println("Medeni durumunuzu giriniz");
        String maritalStatus = input.next(); //next methodu kullanıcıdan tek kelimeli string almak için kullanılır.

        //Kullanıcı bilgilerini konsola yazdırın
        System.out.println("fullname = " + fullName); //fullName.soutv
        System.out.println("age = " + age); //age.soutv
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);

        //ODEV:nextLine() methodunun birsey girmeden enter;la gecmesini do-while ile duzeltiniz

    }
}

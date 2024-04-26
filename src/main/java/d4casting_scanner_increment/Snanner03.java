package d4casting_scanner_increment;

import java.util.Locale;
import java.util.Scanner;

public class Snanner03 {
    public static void main(String[] args) {

        //Ornek 3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Lütfen iki sayi giriniz");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble(); //control+d aşağıya kopyalarayak gider

        System.out.println("Toplam :" + (firstNumber+secondNumber));
        System.out.println("Fark :" + (firstNumber-secondNumber));
        System.out.println("Carpim :" + String.format("%.4f",(firstNumber*secondNumber)));
        System.out.println("Bolum :" + String.format("%.1f",(firstNumber/secondNumber)));

        //Ornek 4: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz

        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar

        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input2 = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını giriniz");

        double uzunKenar = input.nextDouble();
        double kisaKenar = input.nextDouble();

        System.out.println("Alan : " + (kisaKenar*uzunKenar)) ;
        System.out.println("Cevre : " + 2*(uzunKenar+kisaKenar));


    }
}

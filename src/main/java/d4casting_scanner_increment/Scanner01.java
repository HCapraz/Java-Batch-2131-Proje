package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Java'da Scanner class'i, kullanıcıdan veya farklı bir kaynaktan girdi almanın oldukça kolay bir yolunu sağlar
        //Scanner sınıfı, farklı veri tiplerini (int, float, double, String, boolean vb.) kolaylıkla okuyabilir.
        //next(), nextInt(), nextDouble() gibi farklı metotlar, farklı ihtiyaçlara uygun şekillerde kullanicidan
        // girdi almayı sağlar.

        //Ornek 1 : Kullanicidan yasini isteyip console'a yazdiriniz
        //1.adim: Scanner class'tan object uretin
        //System.in klavye üzerinden veri okumak için kullanılır.

        Scanner giris = new Scanner(System.in);

        //2.adim: Kullanıcıya ne istediğinize dair mesaj verin
        System.out.println("lütfen yasinizi giriniz");

        //3. adim: Uygun methodu kullanarak kullanicinin verdiği data'yi memory'ye yerlestiriniz
        byte age = giris.nextByte();
        //Kullanıcının girdiği veriyi yerel age değişkenine yükledik
        System.out.println(age);
    }
}

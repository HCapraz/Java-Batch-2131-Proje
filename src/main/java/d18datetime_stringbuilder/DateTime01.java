package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {


        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        Scanner input = new Scanner(System.in);
        LocalDate girilenTarih = null;

        while (true) {

            System.out.println("Lütfen yili giriniz:");//Kullanıcidan yil bilgisini aldik
            int year = input.nextInt();

            System.out.println("Lütfen ayi giriniz(1-12):");
            int month = input.nextInt(); //Kullanıcidan ay bilgisini aldik

            if (month < 1 || month > 12) {
                System.out.println("Ay 1 ile 12 arasinda olmalidir. Lutfen tekrar deneyiniz");
                continue; //kullaniciyi dongunun basina yonlendirir            }

            }

            System.out.println("Lutfen gunu giriniz");//Kullanıcidan gun bilgisini aldik
            int day = input.nextInt();

            //O ayin kac cektigini bulmak icin, girilen yil ve ay icin YearMonth objesi olusturalim
            YearMonth yearMonth = YearMonth.of(year, month);

            //O ayin maksimum gun sayisini hesaplayalim
            int daysInMonth = yearMonth.lengthOfMonth();

            if (day < 1 || day > 29) {
                System.out.println("Girilen ay için geçersiz gun. Lutfen tekrar deneyiniz");
                continue;

            }

            girilenTarih = LocalDate.of(year, month, day);

            if (girilenTarih.isBefore(LocalDate.now())) {
                System.out.println("Gecersiz tarih girdiniz. Gecmis bir tarih girdiniz. Lutfen tekrar deneyiniz");
            } else {
                System.out.println("Zamani girebilirsiniz");
                break; //Gecerli tarih girdiniz. Döngüden çık.
            }

        }


    }
}

package d5increment_decrement_if;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Daha fazla durumlu senaryolarda if - else if - else statements kullanılır

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        if ( num>0 ){
            System.out.println(num + " sıfırdan buyuktur");
        } else if (num<0) {
            System.out.println(num + " sıfırdan kuçuktur");
        } else {
            System.out.println(num + " noturdur");
        }
    }
}

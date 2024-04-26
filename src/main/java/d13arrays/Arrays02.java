package d13arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //         bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order'a gore siralar

        int[] ages = new int[6];

        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;


        System.out.println(Arrays.toString(ages));

        //1. Yol:
        //Arrays.sort(ages);
        //System.out.println(Arrays.toString(ages));

        //System.out.println(ages[0] + ages[ages.length-1]);

        //2. Yol: Math.max ve Math.min'i kullanacağız

        int minimum = ages[0];
        int maximum = ages[0];

        for (int w : ages) {
            minimum = Math.min(minimum, w) ;
            maximum = Math.max(maximum, w) ;
        }
        System.out.println(minimum); //15
        System.out.println(maximum); //44

        System.out.println(maximum + minimum); //59

        //Java bir amaca yönelik method geliştirdiyse bu methodu kullanmak daha verimlidir, tavsiye edilir.

        }
    }



package d13arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //Array leri kisa yoldan nasil olusturabiliriz?
        // =’den sonra {} acar, degerleri yazariz

        int[] numbers = {12, 3, -3, 5, 23};
        System.out.println(Arrays.toString(numbers));

        for (int w : numbers){
            if (w<5){
                System.out.print(w + " ");

            }
        }

        //---------------------------------

        //Ornek 2: Spesifik bir elemanin Array’de olup olmadigini anlamak icin gereken kodu yaziniz
        //binarySearch() methodu var olan elemanlar icin size o elemanin index'ini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // "-" ==> isaretinin anlami eleman yok demektir
        /*
        Yani, metot şu şekilde çalışır:
        Diziyi ikiye bölün.
        Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
        Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
        Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
        Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar tekrar edilir.
        */

        System.out.println("---------------------------------------------------");

        int[] arr = {2, 1, 7, 6};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr, 6));
        System.out.println(Arrays.binarySearch(arr, 9));

        String[] str = {"A", "C", "B", "D"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str)); //[A, B, C, D]

        System.out.println(Arrays.binarySearch(str, "A"));
        System.out.println(Arrays.binarySearch(str, "C"));
        System.out.println(Arrays.binarySearch(str, "E"));
        System.out.println(Arrays.binarySearch(str, "G"));

        //-----------------------------------------------------
        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //String s = "Java is easy. Learn Java earn money.";


        String s = "Java is easy. Learn Java earn money.";
        System.out.println(s);

        String[] words = s.split(" ") ;

        String s1 = Arrays.toString(words);

        System.out.println(s1);

        System.out.println(words.length);



    }

}

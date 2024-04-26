package d27exceptions;

public class E03 {
    public static void main(String[] args) {

        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.


        String s = "Java";
        karakterSec(s, 5);



    } //main dışı

    public static void karakterSec(String s, int idx){

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index'leri kullanmayınız :" + e.getMessage());
            e.printStackTrace(); //developer hataları görmek isterse kullanır. Exception'ı gösterir
            // ama exception fırlatılmaz, kodlar alttan çalışmaya devam eder.
        }
        System.out.println("App calısıyor");

    }


}

package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10));
        tekSayiKare(nums);


    } //main dısı

    // 1) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina
    // bosluk koyarak yazdiran methodu yaziniz (Functional)

    // map(): Elemanlari donüstürmek icin kullanilir.

    public static void tekSayiKare(List<Integer> nums) {


        nums.stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));


    }


}

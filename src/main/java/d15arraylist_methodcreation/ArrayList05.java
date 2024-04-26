package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList05 {
    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz. interview sorusu.
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //           [12, 23, 10, 19] ==> 12 ve 10

        // 2 türlü sort() kullanabiliriz.
        //1- ArrayList içinde olan
        //2- Collections içinde olan sort()


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(9);

        // Collections.sort(nums);

        nums.sort(null);

        System.out.println(nums);














    }

}

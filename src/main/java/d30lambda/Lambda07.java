package d30lambda;

import java.util.*;

public class Lambda07 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10));
        //min1(nums);
        //min2(nums);
        //min3(nums);
        //min4(nums);
        min5(nums);


    }
    //7)Verilen List’teki “minimum değeri” bulmak için bir method oluşturun

    public static void min1(List<Integer> nums) {

        int min = nums.stream().
                distinct().
                reduce(Math::min).
                get();
        System.out.println(min);

    }

    public static void min2(List<Integer> nums) {
        int min = nums.stream().distinct().reduce((t, u) -> t > u ? u : t).get();
        System.out.println(min);
    }

    //sorted(Comparator.reverseOrder()) ifadesi,
    // Java Stream API’si içinde bir koleksiyonu ters sıralamak için kullanılır.
    //Comparator class, reverseOrder() methoddur.

    public static void min3(List<Integer> nums) {

        int min = nums.stream().distinct().sorted(Comparator.reverseOrder()).
                reduce((t, u) -> u).get();
        System.out.println(min);

    }

    public static void min4(List<Integer> nums) {
        Optional<Integer> min = nums.stream().distinct().sorted().reduce((t, u) -> t);
        if (min.isPresent()) {
            System.out.println(min.get());

        } else {
            System.out.println("Liste bos veya minimum değer bulunamadi");
        }


    }

    public static void min5(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t, u) -> Math.min(t, u)).get();
        System.out.println(min);
    }



}

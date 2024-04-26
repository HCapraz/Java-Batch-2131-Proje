package d25maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps04 {
    public static void main(String[] args) {



        //ornek 2: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //           “Hello” ==> H=1, e=1, l=2, o=1


        String s = "Hello";
        s = s.toLowerCase();
        System.out.println(s); //hello

        String[] harfler = s.split("");
        System.out.println(Arrays.toString(harfler));

        HashMap<String, Integer> myMap = new HashMap<>(); //Bu map'i dongu ile dolduracagiz

        System.out.println(myMap); //{                                                  }

        for (String w : harfler) {

            Integer gorunum = myMap.get(w);

            if (gorunum == null) {
                myMap.put(w, 1);
            } else {
                myMap.put(w, gorunum + 1);
            }

        }
        System.out.println(myMap); // {e=1, h=1, l=2, o=1}



















    }
}

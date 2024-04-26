package d5increment_decrement_if;

public class IfStatements01 {
    public static void main(String[] args) {



        if (3<5){
            System.out.println("condition dogru if calısti");
        }

        //---------------------
        if (7 == 4+3){
            System.out.println("condition dogru ise buraya girer");

            //-------------------
            //Ornek 1: Sayi 0 (dahil) ile 10 (hariç) arasinda ise ekrana "Rakam" yazdirin

            int num = 9;

            if (num > -1 && num < 10){
                System.out.println("Rakam");



            }

        }

        //-------------------

        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir" yazdirin

        int n = 150;

        if (n>99 && n<1000){
            System.out.println("Sayi uc basamaklidir");
        }





    }


}

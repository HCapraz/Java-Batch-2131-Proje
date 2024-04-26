package d27exceptions;

public class d07 {

    public static void main(String[] args) {
       // printAge(25); //25
        printAge(-3); //-3


    } //main dısı
    //Girdigimiz yasi konsola yazdiran bir method olusturalim

    public static void printAge (int age){

        if (age < 0){
            throw new IllegalArgumentException("Yasi negatif girmeyiniz");
        } else {
            System.out.println(age);
        }
    }
            //Exception olustugunda bunu ilan eder ve geri cekilirsiniz, buna da throw exception denir.
            // try-catch kullanmazsiniz.Burda programin durmasi kesinlikle isteniyordur.
}

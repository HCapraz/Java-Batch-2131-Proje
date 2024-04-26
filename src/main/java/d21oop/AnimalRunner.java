package d21oop;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark(); //Dogs bark...
        d.feedWithMilk(); //Mammals feed their babies with milk
        d.drink(); //Animals drink...

        Cat c = new Cat();

        Bird b = new Bird();
        b.tweet(); //Birds tweet...
        b.eat(); //Animals eat...
        d.eat();
        c.eat();


        //a) Java ‘Multiple Inheritance’ i desteklemez. ‘Single Inheritance’ i destekler.

        //b) Parent ve birden fazla child ile olusturulan inheritance yapilanmasina
        //  ‘Hierarchical Inheritance’ denir ve Java bunu kabul eder.

        /*c) Ama coklu parent'lardan yararlanamamak iyi olmadi. Ozelliklerini inherit etmek istedigimiz class'lar
        birden fazla ise (parent'lar) o durumda Java bize,
        Apartman tarzi yapilanma olusturmustur.( 'Multi Level Inheritance') Java bunu kabul eder.*/

        // Java’da parent’tan child’a olan iliskilere HAS-A Relationship denir(yukaridan asagiya)
        // Java’da child’tan parent’a olan iliskilere IS-A Relationship denir (asagidan yukariya)

        //-----------------------------------------------

        //Override isleminde access modifier’larin durumlari ne olmalidir, onu ogrenelim

        //child'in access modifier'i parent'tan daha dar olamaz.
        // Ornek: parent public - child protected olamaz cunku bu hata,
        // Child class'ının eat metodunun, Parent class'ının eat metodundan daha az
        // erişilebilir olmasından kaynaklanır.

        //--------------------------------
        //Override isleminde access modifier’larin durumlarini ogrendik.
        // Simdi de return type durumlarina bakalim.


    }
}

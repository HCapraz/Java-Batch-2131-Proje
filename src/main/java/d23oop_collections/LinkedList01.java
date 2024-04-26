package d23oop_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        /*Collections (koleksiyonlar), Object'leri depolamak ve işlemek için kullanılan
        bir class'lar ve interface'ler kümesidir.

        —Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
        Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
        Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
        Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
        Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

        —Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
        Verileri verimli bir şekilde depolamak
        Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
        Verileri güvenli bir şekilde depolamak*/

        /*Java da Array'ler neden eksik kaldi da Collection'lar gelistirildi?

        Java'da array'ler eksik kaldı çünkü:

        Boyutları statiktir: Bu, array'lerin dinamik olarak büyüyemediği veya küçülemediği anlamına gelir.
        İç içe geçmiş array'ler karmaşıktır: Bu, array'lerin birbirleriyle ilişkili olduğu durumlarda karmaşık ve hata yapmaya müsaittir.
        Array'ler genel olarak verimli değildir: Bu, ekleme, silme ve arama gibi işlemler için genellikle daha yavaştır.

        Collections, bu dezavantajları çözmek için tasarlanmıştır.*/

        /*ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Object list = new ArrayList<>();
        //List<String> list4 = new java.awt.List(); HATA,interface'ler constructor tarafinda kullanilamazlar

         //----------------------------------------

        /*LinkedList: Bağlı bir listedir.

        LinkedList'ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
        LinkedList'in içinde bulunan node'ların konumunu temsil eder.

        ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
        Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
        Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

        1)Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
        Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
        başlayarak ilerlemeyi gerektirir. Yani ArrayList'e gore erisim yavastir.
        ArrayList'lerde get(index) ile hizli erisiriz. Ama LinkedList'ler en bastan istenen eleman mi diye
        tek tek bakar.

        2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

        3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/

        LinkedList<String> myList = new LinkedList<>();

        //1-add() : Listeye bir eleman ekler

        myList.add("Ali");
        myList.add("Veli");
        myList.add("Ayşe");
        myList.add("Fatma");

        System.out.println(myList);// [Ali, Veli, Ayşe, Fatma]


        LinkedList<String> linkedList2 = new LinkedList<>(List.of("Eleman1", "Eleman2", "Eleman3"));
        linkedList2.add("Eleman4");
        System.out.println(linkedList2);

        //-------------ekstra bilgi - kisa yolla eleman ekleme
        /*LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Eleman1","Eleman2","Eleman3"));
        System.out.println(linkedList); //[Eleman1, Eleman2, Eleman3]

        LinkedList<String> linkedList2 = new LinkedList<>(List.of("Eleman1", "Eleman2","Eleman3")); //Boyut degistirilir
        System.out.println(linkedList2); //[Eleman1, Eleman2, Eleman3]

        List<String> immutableList = List.of("Eleman1","Eleman2","Eleman3"); //Boyut degistirilemez
        immutableList.add("Serkan");
        System.out.println(immutableList);*/


        //2- add(int index, E element); belirtilen konuma bir oge ekler
        myList.add(1, "Kerem"); //İstediğimiz indexe ekleme yaptık.
        System.out.println(myList); // [Ali, Kerem, Veli, Ayşe, Fatma]

        //3- addFirst(E e): Listenin basina oge ekler
        myList.addFirst("Hasan");
        System.out.println(myList); //[Hasan, Ali, Kerem, Veli, Ayşe, Fatma]

        //4- addLast(E e): Listenin sonuna bir öğe ekler.
        myList.addLast("Leyla");
        System.out.println(myList); //[Hasan, Ali, Kerem, Veli, Ayşe, Fatma, Leyla]

        //5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur

        boolean m1 = myList.remove("Kerem");
        System.out.println(m1); //True (Kerem'i sildiğini true olarak verdi.)

        //6)removeFirstOccurrence() metodu,
        // belirtilen bir öğeyi LinkedList içinde
        //bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.add("Yusuf");
        myList.add("Yusuf");
        myList.add(2,"Yusuf");
        System.out.println(myList);

        myList.removeFirstOccurrence("Yusuf"); //1. Yusuf'u sildi.
        System.out.println(myList);

        //----------------- ekstra bilgi
        //myList.removeAll(Collections.singleton("Yusuf")); //Bütün Yusuf'ları siler.
        //System.out.println(myList);

        //7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
        //sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.removeLastOccurrence("Yusuf");
        System.out.println(myList);

        //8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
        // Bu metod, elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa null dondurur)

        String s = myList.peek();
        System.out.println(s); //Hasan
        System.out.println(myList); //[Hasan, Ali, Veli, Ayşe, Fatma, Leyla, Yusuf]

        //9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa null döndürür.

        System.out.println(myList.poll()); // Hasan
        System.out.println(myList); //[Ali, Veli, Ayşe, Fatma, Leyla, Yusuf]

        //10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
        // bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir

        System.out.println(myList.element()); // Ali
        System.out.println(myList); //[Ali, Veli, Ayşe, Fatma, Leyla, Yusuf]

        //11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)

        System.out.println(myList.poll()); // Ali
        System.out.println(myList); // [Veli, Ayşe, Fatma, Leyla, Yusuf]


        
    }
}

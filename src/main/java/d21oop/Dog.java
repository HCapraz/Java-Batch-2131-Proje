package d21oop;

public class Dog extends Mammal {
    public void bark(){
        System.out.println( "Dogs bark...");
    }

    @Override
    public void eat(){
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create(){
        return new Dog();
    }

    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    @Override
    public Integer carpma(Integer a, Integer b) {
        return super.carpma(a, b);

        //Ek islevsellik eklemek
       // return sonuc + 10;
    }
}

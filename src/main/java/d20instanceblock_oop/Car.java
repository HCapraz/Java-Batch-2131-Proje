package d20instanceblock_oop;

public class Car extends Vehicle {

    public Car(){
        super(); //2'ye seslenir/çağırır
        System.out.println("Sedan");
    }
    public Car(String tip){
        super("Honda", 2024, "Elektrikli");
    }
}

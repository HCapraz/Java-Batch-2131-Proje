package d21oop;

import d20instanceblock_oop.Vehicle;

public class Car extends Vehicle {

    public String model = "Accord";
    public int year = 2024;
    public Car(){
        this("Sport"); //2'ye seslenir/çağırır
        System.out.println("Sedan");
    }
    public Car(String tip){
        super("Honda", 2024, "Elektrikli");
    }
}

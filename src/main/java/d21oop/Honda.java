package d21oop;

import d20instanceblock_oop.Car;


public class Honda extends Car {

    public String model = "Civic";
    public int year = 2023;
    public Honda() {
        System.out.println("super.modal = " + model); //1 e seslenir/çağırır
        System.out.println("this.year = " + year);;
        System.out.println("Civic");

    }

        public Honda(String model) {
            super();
            System.out.println("Accord");
        }
}

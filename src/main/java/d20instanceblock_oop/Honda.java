package d20instanceblock_oop;

public class Honda extends Car{
    public Honda() {
        super(); //1 e seslenir/çağırır
        System.out.println("Civic");

    }

        public Honda(String model) {
            super("Sport");
            System.out.println("Accord");
        }
}

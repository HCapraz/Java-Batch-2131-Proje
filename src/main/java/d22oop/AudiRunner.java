package d22oop;

public class AudiRunner {
    public static void main(String[] args) {

        // Motor m = new Motor(); HATA: interface'lerden object üretemezsiniz

        AudiA4 a4 = new AudiA4();
        a4.turbo();
        a4.esp();
        a4.dijital();

        AudiS5 s5 = new AudiS5();
        s5.gas();
        s5.abs();
        s5.dijital();










    }
}

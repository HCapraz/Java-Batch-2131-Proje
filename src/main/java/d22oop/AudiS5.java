package d22oop;

public class AudiS5 implements Motor, Klima, Fren{

    public void eco(){
        System.out.println("Audi S5 ekonomik motor kullanır");
    }

    public void turbo(){
        System.out.println("Audi S5 turbo motor kullanır");
    }

    public void gas(){
        System.out.println("Audi S5 benzinli motor kullanır");
    }

    public void analog(){
        System.out.println("Audi S5 analog klima kullanır");
    }

    public void dijital() {
        System.out.println("Audi S5 dijital klima kullanır");
    }
    public void abs(){
        System.out.println("Audi S5 abs fren sistemi kullanır");
    }
    public void esp(){
        System.out.println("Audi S5 esp fren sistemi kullanır");
    }

}


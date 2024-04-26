package d20instanceblock_oop;

public class InstanceBlock3 {

    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;


    public String fueltype;

    //instance block - Bu class'tan her object olusturuldugunda calisir
    {
        color = "Siyah";

        fueltype = "Benzin";
    }

    public InstanceBlock3() {
        System.out.println("Araba rengi = " + color);
        System.out.println("Yakıt tipi = " + fueltype);
    }

        //Default olarak siyah ve benzinle baslatmak istemezsek paramatreli constructor kullaniriz

    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fueltype = fuelType;

    }
}

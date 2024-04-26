package d17passbyvalue_constructors_datetime;

public class PassByValuePassByReference {
    public static void main(String[] args) {


        /* Pass by Reference (Referans ile Geçiş):
Java'da "pass by reference" kullanılmaz. Bunda degisken ve object'lerin adresleri direkt methoda gonderilir.
Kopya yoktur.Method'a adres yollaninca method, adresi kullanarak orjinal degere ulasir ve degeri degistirebilir.
 Bu yaklasimda hem adres hem de orjinal veri degisebilir.

Dikkat : Java da Object ile calisirken (heap memory'de), Object'in referansı(adresi) degismez ama
bazi Object'lerin orjinal içeriği degisebilir (Mutable-Değiştirilebilir- Nesneler : ArrayList, HashMap,StringBuilder)
(Immutable-Değişmez- Nesneler: Integer, String gibi Wrapper Clas'lar,ENUM)

Peki Java bunu neden Boyle yapar? (Pass by reference kullanımına gore)

1- Güvenlik:
"Pass by Value," verilerin kontrolsüz değiştirilmesini engeller. Bu, programın güvenliğini
artırır çünkü bir metodun içinde değiştirilen veriler, çağrıldığı yerdeki orijinal veriyi etkilemez.

2-Performans:
Pass by value, Java'nın performans açısından daha verimli çalışmasını sağlar.
Adres degisikliginin onune gecilerek hiz saglanir
*/
    }
}

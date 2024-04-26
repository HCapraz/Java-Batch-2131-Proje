package d5increment_decrement_if;

public class IncrementDecrement {
    public static void main(String[] args) {

        //----------------Increment
        int a = 5;
        a = a + 2;
        System.out.println(a);

        a += 7;
        System.out.println(a);

        //-------------------Decrement
        int c = 10;
        c =  c - 3; //c iki defa yazılmış. Tekrardan kurtulabiliriz.
        System.out.println(c); //7

        c -= 4; //c=c-4
        System.out.println(c);  //3

        //-------------------carpma
        int d = 6;
        d = d*2;
        System.out.println(d);  //12

        d *=2;
        System.out.println(d);  //24

        //-------------------bolme
        int e = 24;
        e = e/2;
        System.out.println(e);  //12

        e /=3;
        System.out.println(e);

        //-------------------1 ile increment
        int f = 13;
        f = f + 1;
        f += 1;
        f++;
        System.out.println(f);  //16

        //-------------------1 ile decrement
        int h = 15;
        h = h-1;
        h -= 1;
        h--;
        System.out.println(h);  //12

        //-------------------post increment (i++), pre increment (++i?
        int i = 10;
        int k = i++;
        System.out.println(k);  //10
        System.out.println(i);

        int n = 15;
        int m = ++n;
        System.out.println(m);  //16
        System.out.println(n);  //16

        //-------------------
        int p = 17;
        int r = p--;
        System.out.println(r);  //17
        System.out.println(p);  //16


        //-------------------
        int s = 20;
        int t = --s;
        System.out.println(t);  //19
        System.out.println(s);  //19





    }
}

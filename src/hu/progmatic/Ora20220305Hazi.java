package hu.progmatic;

public class Ora20220305Hazi {
    public static void main(String[] args) {
        /* int j = 5, i = 10;
        j += j * 2 == i ? j : i % 3;

        if (j * 2 == i) {
            j += j;
        } else {
            j += i % 3;
        }

        System.out.println(j); */

        /* int n = 0;
        n -= (n % 2 > 0) ? 1 + 2 * n : n - 3;

        System.out.println(n); */

        /* int b = 9;
        boolean a = ++b % 5 == 0 ? b == 10 : b != 9;

        System.out.println(a); */

        /* int penz = 1000;
        int evenkentiKivetel = 0;
        int evek = evenkentiKivetel > 0 ? penz / evenkentiKivetel : Integer.MAX_VALUE;

        System.out.println(evek); */

        /* boolean b = false, c = true, d = true;
        boolean a = b || c ? ! ( b || c && d ) : c && ! d;

        System.out.println(a); */

        /* int f = 1;
        boolean e = !false == (10%3 == f);
        int g = e ? f -= (++f * -1) : f+ (f+f) * ++f;

        System.out.println(e);
        System.out.println(f);
        System.out.println(g); */

        int v = 5;
        int vRegi = v;
        vRegi = v--;
        vRegi = --v;
        vRegi = ++v;
        vRegi = v-- + v + 1;
        int x = vRegi * v;
        // int v = 4;
        // int x = 20;
        boolean y = x % v < 0 ? v == 0 : !false;
        // boolean y = true;
        boolean z = !y && x == v * v;
        // boolean z = false;

        System.out.println(v);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

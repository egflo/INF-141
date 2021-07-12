

public class ModExp {

    // return a^b mod n
    public static int modexp(int a, int b, int n) {
        if (b == 0) return 1;
        long t = modexp(a, b/2, n);  // use long for intermediate computations to eliminate overflow
        //System.out.println(t);
        long c = (t * t) % n;
        System.out.println(b);
        if (b % 2 == 1)
           c = (c * a) % n;
           
        return (int) c;
    }

 public static void main(String[] args) {
       	int a = 2;
       	int b = 12;
       	int n = 13;
        System.out.println(modexp(a, b, n));
    }

}
package fsdrevature;

public class Operators {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;
        int c = 10;
        boolean e = true;
        boolean f = false;

        System.out.println(a + b);
        System.out.println(a -b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println(a>b && a>c);

        System.out.println(a > b || a < c);

        int max = (a < b)? a: b; // ternary operator
        System.out.println(max);

    }
}




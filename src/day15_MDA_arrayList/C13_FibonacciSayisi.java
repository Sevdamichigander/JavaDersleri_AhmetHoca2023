package day15_MDA_arrayList;

public class C13_FibonacciSayisi {
    public static void main(String[] args) {
        //Fibonacci 1 1 2 3 5 8 13 21 29

        // For loop ile:

        int a = 1;
        int b = 1;
        int c;

        for (int i = 0; i < 10; i++) {

            c = a + b; // c=2=1+1
            a = b;        // a=1
            b = c;          // b=2
            System.out.print(c + " ");

        }

        System.out.println("*****************************");

        //Fibonacci 1 1 2 3 5 8 13 21 29

        int[] fibonacci = new int[10];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

            System.out.print(fibonacci[i] + " ");

        }

        System.out.println("********************************");

        int d = 1;
        int e = 1;
        int f;

        for (int i = 0; i < 10; i++) {

            f = d + e;
            d = e;
            e = f;
            System.out.print(f + " ");


        }

    }

}





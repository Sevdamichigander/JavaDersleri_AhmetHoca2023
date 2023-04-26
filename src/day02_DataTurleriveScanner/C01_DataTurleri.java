package day02_DataTurleriveScanner;

public class C01_DataTurleri {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        // boolean b3 = "Hello World"; calismaz
        // boolean b4 = 5; calismaz

        //char c1 = true; calismaz
        // char c2 = "H"; calismaz. Cunku java "" arasini metinsel ifade olarak kabul eder ve String ister.

        char c3 = '5';
        char c4 = 'H';
        char c5 = '*';
        // char c6 = '4 '; tek karakter degil. 2 karakter oldugu icin java kabul etmez.
        //tek tirnak icinde tek karakter - tirnak icinde olmazsa sayi(ASCII)

        String str1 = "V";
        String str2 = "5";

        int sayi = 5; // 32 bit hafiza
        short sayi2 = 5; //16 bit hafiza
        byte sayi3 = 5;// 8 bit hafiza
        long sayi4 = 5; //64 bit hafiza

        float ondalikliSayi1 = 2.123456789f; // bunun geriye kalanini yuvarladi. cunku float virgulden sonra 6 hane gosterir.
        double ondalikliSayi2 = 2.123456789123456789;
        System.out.println(ondalikliSayi1);

        System.out.println(ondalikliSayi2); // double virgulden sonra 16 hane gosterir.
        double d1 = 20;
        double d2 = 5;
        System.out.println(d1/d2);




    }
}

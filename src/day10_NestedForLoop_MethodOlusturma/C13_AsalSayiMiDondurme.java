package day10_NestedForLoop_MethodOlusturma;

public class C13_AsalSayiMiDondurme {
    public static void main(String[] args) {
        // verilen bir sayinin asal sayi olup olmadigini
        // true false olarak donduren bir method olusturun
        System.out.println(asalSayiMi(57));

        /*
        Method call sirasinda paranntez icine yazdigimiz deger/variable lara argument denir.
        method parantezi icindeki variable lara ise parametre denir.

        method un calismasi icin ve parametrelerin SAYILARI ve DATA TURLERI uyumlu olmalidir.
                BUnlar uyumlu olmazsa hata verir.

         */



    }

    public static boolean asalSayiMi(int sayi) {

        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;

            }

        }
        return asalMi;
    }
}
package day10_NestedForLoop_MethodOlusturma;

public class C03_NestedForLoop_CarpimTablosu2 {
    public static void main(String[] args) {
        /*
        Verilen bir sayi icin asagidaki tabloyu olusturun
        ornek : sayi = 3

        1*1  1*2  1*3
        2*1  2*2  2*3
        3*1  3*2  3*3
         */

        int sayi = 7;

        for (int i = 1; i <=sayi ; i++) {//disardaki loop(outer loop) : satirlari kontrol eder
            for (int j = 1; j <=sayi ; j++) {// iverdeki loop(inner loop): sutunlari kontrol eder

                System.out.print(i + "*" + j + "  ");

            }
            System.out.println("");
        }

        /*
        Verilen iki sayi icin asagidaki tabloyu olusturun
        ornek :    a = 3
                   b= 4

        1*1  1*2  1*3
        2*1  2*2  2*3
        3*1  3*2  3*3
         */
        int a = 3;
        int  b= 4;
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i + "*" + j + "  ");

            }
            System.out.println("");
        }
    }
}

package day10_NestedForLoop_MethodOlusturma;

public class C04_NestedForLoop_Ucgen {
    public static void main(String[] args) {
     /*
     Verilen sayi icin asagidaki sekli olusturun

        int sayi = 4

        1
        1  2
        1  2  3
        1  2  3  4

      */

        int sayi = 4;
        int sutunSayisi = 4;

        for (int i = 1; i <=sayi ; i++) { // outer, satirlari kontrol eder
            for (int j = 1; j <=i ; j++) { // inner, sutunlari kontrol eder
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}

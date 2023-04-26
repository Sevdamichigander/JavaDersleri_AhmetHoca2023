package day10_NestedForLoop_MethodOlusturma;

public class C05_NestedForLoop_Ucgen_Yildizlardan {
    public static void main(String[] args) {
 /*
        verilen sayi icin asagidaki sekli olusturun
        int sayi = 5;
        *
        * *
        * * *
        * * * *
        * * * * *
     */
        
        int sayi = 5;

        for (int i = 1; i <=sayi ; i++) { /// satirlar
            for (int j = 1; j <=i ; j++) {//sutunlar

                System.out.print("* ");
                
            }
            System.out.println("");
        }
    }
}

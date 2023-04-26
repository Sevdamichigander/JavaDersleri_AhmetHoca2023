package day10_NestedForLoop_MethodOlusturma;

public class C02_NestedForLoops_YildizlardanKare_Dikdortgen {
    public static void main(String[] args) {

         /*
            verilen satir ve sutun sayisina uygun olarak
            asagidaki sekli yazdirin

            ornek : satir 4 , sutun 5

            * * * * *
            * * * * *
            * * * * *
            * * * * *
         */
        int satirSayisi = 4;
        int sutunSayisi = 5;

        /*for (int i = 1; i < sutunSayisi; i++) {
            System.out.print("*");
        }
        System.out.println(""); // Alt satira inmek icin yaptik*/

        for (int i = 1; i < satirSayisi; i++) {
            for (int j = 1; j <sutunSayisi ; j++) {
                System.out.print("*");

            }
            System.out.println(""); // Alt satira inmek icin yaptik

        }
    }
}


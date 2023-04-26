package day11_MethodOverloading_WhileLoop;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*
        While mi for mu ==> yapacagimiz ise bagli

        Dongu sayisi belli ise for loop kullanmak daha pratiktir

        Ancak baslangic, bitis degerleri verilmemisse
        veya bitis dongu sayisi belirli degilse while loop daha avantajli olur. */


         // 1 den 100 ekadar olan sayilari yan yana yazdirin

        for (int i = 1; i <=100 ; i++) {

            System.out.print(i + " ");
        }
        System.out.println("");

        // ayni soruyu while loop ile yapalim

        int sayi= 1;
        while(sayi<=100){
            System.out.print(sayi + " ");
            sayi++; // unutulursa sonsuz loop olusur
        }
    }
}

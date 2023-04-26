package day04_IncrementDecrementConcatenationOperatorler;

public class C06_LogicalOperators {
    public static void main(String[] args) {
         int a = 10;
         int b = 20;
         int c = 15;

         // ucunun birbirine esit oldugunu kontrol edin----Java da 3 lu esitlik yok!!!
        // Karsilastirma operatorleri sadece 2 variable i karsilastirir.

        System.out.println(a==b && b==c); //false

        // a sayisinin pozitif ve iki tam bolunebilir oldugunu kontrol edin

        System.out.println(a>=0 && a % 2 ==0);//true

        // b sayisinin 10 ile 50 arasinda oldugunu kontrol edin

        System.out.println(10<b && b<50); //true

        // b sayisinin 10 ile 50 arasinda olmadigini kontrol edin

        //belli bir aralikta olup olmadigini kontrol ederken && operatoru kullanilir.
        //Ama araligin disi istenoyorsa OR || operatoru kullanilir

        System.out.println(b<10 || b>50); //false  


    }
}

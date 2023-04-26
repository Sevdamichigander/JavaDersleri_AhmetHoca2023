package day04_IncrementDecrementConcatenationOperatorler;

public class C05_KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        /*
        Karsilastirma operatorleri
        2 variable i karsilastirip
        istenen sart saglaniyorsa TRUE
         sart saglanmiyorsa FALSE degeri ureten operatorlerdir.

        boolean sonuc uretecek bir karsilastirmaya ihtiyac var
         */

        //1-  a b ye esit mi ? == isaretinde sagi ve solu hesaplayip esit mi diye kontrol ediyoruz

        System.out.println(a==b); //false
        System.out.println(2*a == b); //true
        System.out.println(a==b/2); //true

        // 2- a ile b nin esit olmadigini kontrol edin----! degildir isareti

        System.out.println(a != b);

        System.out.println( a != b/2);

        //3- a b den kucuk mu?

        System.out.println(a<b);//true

        System.out.println(a<b/2);//false

        //4- a b den kucuk degil !()

        System.out.println(!(a<b));

        // 5- a b den kucuk veya esit mi? kucuk veya esit olmasi yeterli

        System.out.println(a<=b); //true

        System.out.println(2*a<=b);

        // a b den buyuk mu?

        System.out.println(a>b); //false

        System.out.println(5*a>2*b);//true

        boolean c = 2*a >= b;

        // a nin 3 katinin b den buyuk olmadigi sartini kontrol ediniz

        System.out.println(!(3*a>=b));








    }
}

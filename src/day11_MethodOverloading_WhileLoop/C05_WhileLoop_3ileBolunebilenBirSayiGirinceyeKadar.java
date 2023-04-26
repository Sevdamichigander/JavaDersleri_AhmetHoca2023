package day11_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop_3ileBolunebilenBirSayiGirinceyeKadar {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alip 3 ile bolunup bolunemedigini yazdirin.
        //Kullanici 3 ile bolunebilen bir sayi girinceye kadar tekrar deger isteyin
        // tekrar sayisi tam olarak bilinmeyen
        // ama tekrar sayisi belli bir sarta bagli olan durumlarda ==> whileloop kullaniriz

        Scanner scan = new Scanner(System.in);


        //"girilen sayi 3 e bolunebilene kadar tekrar et " i yazdiracagiz whileloop ile
        // while loop da icine yazilan sart saglanmadigi muddetce kod tekrar calisir
        //adim sayisi belli degilse kullaniriz
        // riski ==> ilk verdigimiz degerin kodun calismasina engel olmamasi lazim. Yoksa en bastan false verir
        int sayi = 2;

        while (sayi %3!=0) {

            System.out.println("Lutfen bir sayi giriniz");
            sayi= scan.nextInt();

            if(sayi%3==0){
                System.out.println("sayi 3 e tam bolunur");
            }else System.out.println("sayi 3 ile tam bolunemiyor");

        }
    }
}

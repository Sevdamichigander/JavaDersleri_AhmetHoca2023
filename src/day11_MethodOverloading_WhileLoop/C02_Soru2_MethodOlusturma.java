package day11_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C02_Soru2_MethodOlusturma {
    //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
    // Girilen sayinin pozitif tam bolenleri sayisini bulup
    // bize donduren bir method olusturun.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(pozitifBolenSayisiBul(sayi)); // yazdirdik

        //verilen sayinin asal olup olmadigini bu method u kullanarak yazdiralim

        int ptbs = pozitifBolenSayisiBul(sayi) ;
        if (ptbs==2){
            System.out.println("verilan sayi asal");
        }
        else {
            System.out.println("verilen sayi asal degil");
        }


    }

    public static int pozitifBolenSayisiBul(int sayi) {
        int sayac = 0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        return (sayac);
    }
}

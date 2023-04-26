package day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanicidanIntListeOlusturma {
    public static void main(String[] args) {


        System.out.println(kullanicidanSayiAlarakListeOlusturanMethod());// [5, 25, 13, 12]

    }

    public static List<Integer> kullanicidanSayiAlarakListeOlusturanMethod(){

        Scanner scan = new Scanner(System.in);

        //kullanicidan sayilar loop icinde alinacak, loop sayisi bilinmediginden while kullaniyoruz
        //kullanici 0 a basinca loop duracak

        int girilenSayi = 4;
        List<Integer> sayilar = new ArrayList<>();

        // girilen sayi 0 olmadigi surece loop devam edecek

        while(girilenSayi!=0){

            System.out.println("Lutfen listeye eklemek icin bir sayi giriniz");
            girilenSayi = scan.nextInt();

            if(girilenSayi!=0){
                sayilar.add(girilenSayi);
            }
        }
        return sayilar;
    }
}




package day16_arrayList;

import java.util.Scanner;

public class C11_ForEach_Soru4 {
    /*
    Soru 4- Kullanicidan bir cumle ve bir harf alin,
     harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
     kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
     */

    /*
    - split ile "" ile parcaliyoruz. harfleri teker teker kontrol edebilmek icin array haline getiriyoruz
    - for each ile harfler teker teker kontrol edilir
    - istenilen harfe denk gelindiginde sayac 1 arttirilir
    - sayac 0 ise hic kullanilmamis
    - sayac 0 dan fazla ise kac kere kullanildigi yazdirilir
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String str = scan.nextLine();
        System.out.println("lutfen aranan harfi giriniz");
        String arananHarf = "A";


        //  String str = "Java ile hersey cok kolay";


        String[] arr = str.split(""); //1. adim
        int sayac = 0;

        for (String each:arr) {
            if(each.equalsIgnoreCase(arananHarf)){
                sayac++;
            }

        }

        if(sayac==0){
            System.out.println("Aradiginiz harf hic kullanilmamis");
        }else{
            System.out.println("aranan harf cumle icinde " + sayac + " kere kullanilmis");
        }

    }
}

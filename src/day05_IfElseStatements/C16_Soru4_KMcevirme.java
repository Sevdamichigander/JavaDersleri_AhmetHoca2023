package day05_IfElseStatements;

import java.util.Scanner;

public class C16_Soru4_KMcevirme {
    public static void main(String[] args) {
        /*
        Kullanicidan mesafeyi km olarak alin ve cevirmek istedigi birimi sorun
        Istedigi birim metre veya cm ise cevirip yazdirin.
        Yoksa "istediginiz birim sisteme kayitli degil" yazdirin

         */



        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cevirmek istediginiz mesafeyi km cinsinden giriniz");

        double mesafe = scanner.nextDouble();

        System.out.println("Lutfen cevirmek istediginiz birimi giriniz, metre icin 'mtr', cantimetre icin 'cmtr'");


        String istenilenMesafe = scanner.next().toLowerCase();

        if(istenilenMesafe.equals("mtr")) {
        System.out.println("Istenilen birimin metreye ye cevrilmis hali : " + (mesafe*1000) + " dir." );
        } else if (istenilenMesafe.equals("cmtr")) {
        System.out.println("Istenilen birimin cm ye cevrilmis hali : "+ (mesafe*100000) + " dir.");
        } else {
        System.out.println("istediginiz birim sisteme kayitli degil");
        }*/


        System.out.println("***********************************2.Yontem****************************************");



        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen mesafeyi km cinsinden giriniz");

        double istenilenMesafeMetre = scanner.nextDouble();
        double istenilenMesafeCantimetre = scanner.nextDouble();
        double girilenMesafe = scanner.nextDouble();

        istenilenMesafeMetre = girilenMesafe*1000;
        istenilenMesafeCantimetre = girilenMesafe*100000;
        istenilenMesafeMetre = 1;
        if(istenilenMesafeMetre == 0) {
            System.out.println("Mesafenin cevrilmis hali " + istenilenMesafeMetre + " dir.");
        }else System.out.println("Mesafenin cevrilmis hali " + istenilenMesafeCantimetre + " dir.");






    }
}

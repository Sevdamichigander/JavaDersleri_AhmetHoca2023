package day08_StringManipulations;

import java.util.Scanner;

public class C04_Soru {
    public static void main(String[] args) {

        //SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen mail adresinizi giriniz.");
        String email = scanner.next();

        //if (email.contains("@")) bu iceriyorsa sartini karsilar

       /*

        if (!email.contains("@")){ // ! ile icermiyorsa ya donduk
            System.out.println("Gecersiz mail");
        }
        if (!email.contains("@gmail.com")) { // ! ile icermiyorsa ya donduk
            System.out.println("mail gmail olmali");
        }

        if (!email.endsWith("@gmail.com")) System.out.println("mailde yazim hatasi var");

        /*
            Etaplarimiz
            1 scanner
            2 if(contains)
            3 if contains
            4 if(endswith)

            */

        /*

        Her birini ayri ayri kontrol etmek istiyorsak if if if yapmaliyiz
         */

        //if (email.contains("@")) bu iceriyorsa sartini karsilar


        if (!email.contains("@")) { // ! ile icermiyorsa ya donduk
            System.out.println("Gecersiz mail");
        }
        else if (!email.contains("@gmail.com")) { // ! ile icermiyorsa ya donduk
            System.out.println("mail gmail olmali");
        }

        else if (!email.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }
    }

    // Bu ikinci kodda birbirine bagimli etaplar/kademeli yaptik.
    // (else if _ else if) Eger 2. etabi gecemiyorsa 3. ye gecemiyor.

}


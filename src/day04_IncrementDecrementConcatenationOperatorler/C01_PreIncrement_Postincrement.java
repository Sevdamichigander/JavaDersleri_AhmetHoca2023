package day04_IncrementDecrementConcatenationOperatorler;

import java.util.Scanner;

public class C01_PreIncrement_Postincrement {
    public static void main(String[] args) {
        // Kullanicidan bir tamsayi isteyin
        // Girilen tamsayiyi yazdirip sonra 1 artirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayi : " + girilenSayi);

        girilenSayi ++;
        System.out.println(girilenSayi);

        //Kullanicidan bir sayi daha alin.
        // Bu sayiyi once artirin
        //sonra yazdirin

        int girilenSayi2 = scanner.nextInt();
        System.out.println("Lutfen bir tamsayi daha giriniz");

        girilenSayi2 ++;

        System.out.println("Girilen 2. sayi : " + girilenSayi2);

        System.out.println("Kodun sonunda GS1 : " + girilenSayi + ", GS2 : " + girilenSayi2);

    }
}

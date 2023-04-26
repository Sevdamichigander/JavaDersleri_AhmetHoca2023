package day05_IfElseStatements;

import java.util.Scanner;

public class C03_Soru3 {
    public static void main(String[] args) {
      //Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi1 = scan.nextInt();

        if(sayi1 %3==0) System.out.println("3 ile bolunebilen sayi");
        if(sayi1 %5==0) System.out.println("5 ile bolunebilen sayi");

    }
}



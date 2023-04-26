package day07_SwitchStatements_StringManipulations;

import java.util.Scanner;

public class C15_Soru5_Switch_HaftaiciSonu {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir gun numarasi giriniz");

        int gunNumarasi = scan.nextInt();

        switch (gunNumarasi){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaici"); break;
            case 6:
            case 7:
                System.out.println("Haftasonu");break;
            default:
                System.out.println("Gecersiz giris yaptiniz");
        }

    }
}

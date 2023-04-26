package day07_SwitchStatements_StringManipulations;

import java.util.Scanner;

public class C02_Switch_Ay_Mevsim {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan ay numarasini alin, o ayin hangi mevsimde oldugunu yazdirin.

        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasi giriniz");
        int ayNumarasi = scanner.nextInt();

        switch (ayNumarasi) {

            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("Gecersiz ay numarasi");

                // case 12: case 1: case 2:
                //          System.out.println("Kis");
                //          break;
                // boyle de calisir. DIKKAT arada virgul yok

        }
    }
}

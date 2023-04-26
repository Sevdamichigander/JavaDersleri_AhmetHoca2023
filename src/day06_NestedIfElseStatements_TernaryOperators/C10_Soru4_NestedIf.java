package day06_NestedIfElseStatements_TernaryOperators;

import java.util.Scanner;

public class C10_Soru4_NestedIf {
    public static void main(String[] args) {
        /*
        Kullanicidan gunun ismini girmesini isteyin.
        Girilen gun haftaici bir gun ise "Simdi calisma zamani tatile .... gun var." seklinde yazdirin
        Girilen gun hafta sonu ise "Simdi dinlenme zamani" yazdirin.
         */


        Scanner scanner = new Scanner(System.in);


        System.out.println("Istediginiz gun ismi haftaicinde ise 'H', haftasonunda ise 'S' giriniz");
        String hIciHsonu = scanner.nextLine().toUpperCase();

        System.out.println("Istediginiz gun ismini giriniz");
        String gunIsmi = scanner.nextLine().toUpperCase();


        if (hIciHsonu.equals("H")) {
            if (gunIsmi.equals("PAZARTESI")) {
                System.out.println("Simdi calisma zamani tatile 5 gun var.");
            }
            else if (gunIsmi.equals("SALI")) {
                System.out.println("Simdi calisma zamani tatile 4 gun var.");
            }
            else if (gunIsmi.equals("CARSAMBA")) {
                System.out.println("Simdi calisma zamani tatile 3 gun var.");
            }
            else if (gunIsmi.equals("PERSEMBE")) {
                System.out.println("Simdi calisma zamani tatile 2 gun var.");
            }
            else if (gunIsmi.equals("CUMA")) {
                System.out.println("Simdi calisma zamani tatile 1 gun var.");

            }
        } else if (hIciHsonu.equals("S")) {
                if (gunIsmi.equals("CUMARTESI")) {
                    System.out.println("Simdi dinlenme zamani");
                }
                else if (gunIsmi.equals("PAZAR")) System.out.println("Simdi dinlenme zamani");
            }
            else {
                System.out.println("Gecersiz giris");
        }
             /*
        if (gunIsmi.equals("Pazartesi"))        System.out.println("Simdi calisma zamani tatile 5 gun var.");
        else if (gunIsmi.equals("Sali"))        System.out.println("Simdi calisma zamani tatile 4 gun var.");
        else if (gunIsmi.equals("Carsamba"))    System.out.println("Simdi calisma zamani tatile 3 gun var.");
        else if (gunIsmi.equals("Persembe"))    System.out.println("Simdi calisma zamani tatile 2 gun var.");
        else if (gunIsmi.equals("Cuma"))        System.out.println("Simdi calisma zamani tatile 1 gun var.");
        else if (gunIsmi.equals("Cumartesi"))   System.out.println("Simdi dinlenme zamani");
        else if (gunIsmi.equals("Pazar"))       System.out.println("Simdi dinlenme zamani");
        else System.out.println("Gecersiz giris");   */

    }
}

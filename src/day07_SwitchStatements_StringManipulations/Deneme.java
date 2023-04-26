package day07_SwitchStatements_StringManipulations;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yazdirmak istediginiz ayin ilk harfini giriniz");

        char harf = scanner.next().toUpperCase().charAt(0);

        switch (harf){
            case 'O':
                System.out.println("Ocak");
                break;
            case 'S':
                System.out.println("Subat");
                break;
            case 'M' :
                System.out.println("Mart veya Mayis");
                break;
            case 'N':
                System.out.println("nisan");
            default:
                System.out.println("gecersiz");
        }*/

        /*// Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yaziyla goruntulemek istediginiz iki basamakli sayiyi yaziniz");

        int sayi = scanner.nextInt();

        if(sayi>99 || sayi<10) System.out.println("gercersiz giris");

        else {

            switch (sayi/10){// burda /10

                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }

            switch (sayi%10){  //!!!! burda modulus

                case 1 :
                    System.out.println("bir");
                    break;
                case 2 :
                    System.out.println("iki");
                    break;
                case 3 :
                    System.out.println("uc");
                    break;
                case 4 :
                    System.out.println("dort");
                    break;
                case 5 :
                    System.out.println("bes");
                    break;
                case 6 :
                    System.out.println("alti");
                    break;
                case 7 :
                    System.out.println("yedi");
                    break;
                case 8 :
                    System.out.println("sekiz");
                    break;
                case 9 :
                    System.out.println("dokuz");
                    break;
            }

        }*/


    }
}

package day11_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int toplam = 0;

        while (sayi!=0){
            System.out.println("Lutfen bir sayi giriniz : ");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Toplam : " + toplam);

    }

}



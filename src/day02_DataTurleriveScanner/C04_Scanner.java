package day02_DataTurleriveScanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Gorev : Kullanicidan bir tamsayi isteyin
        // girilen sayinin iki katini yazin

            Scanner scanner = new Scanner(System.in);           // 1- Scanner class indan bir obje olusturuyoruz

            System.out.println("Lutfen bir tamsayi yaziniz");   // 2- Scanner calisinca kullanicidan bir sey bekleyecektir.
                                                                // Kullanicinin kendisinden ne beklendigini bilmesi icin
                                                                //  bir aciklama yazalim.


        int girilenSayi = scanner.nextInt();                   // 3- Kullanicinin girdigi degeri alabilmesi icin Scanner
                                                                // classindan uygun method u kullanip, kullanicidan degeri alin
                                                                // ve olusturdugumuz variable a atayin.

        System.out.println("Girdigimiz sayinin 2 kati : " + 2*girilenSayi);

    }
}

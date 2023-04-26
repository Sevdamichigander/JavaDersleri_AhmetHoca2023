package day02_DataTurleriveScanner;

import java.util.Scanner;

public class C07_Scanner_BelliFormattaYazma {
    public static void main(String[] args) {
       //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sirasiyla isminizi,soyisminizi ve yasinizi giriniz");
        String isim = scanner.nextLine();
        String soyisim = scanner.nextLine().toUpperCase();
        int yas = scanner.nextInt();

        System.out.println("Isminiz : " + isim + "\nSoyisminiz : " + soyisim + "\nYasiniz : " + yas + "\nKaydiniz basariyla tamamlanmistir");



    }

}

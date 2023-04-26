package day02_DataTurleriveScanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Kullanicidan ismini isteyip ismi buyuk harfe cevirip kaydedin. Sonra kullaniciya yeni halini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String kullaniciIsmi = scan.nextLine();
        //nextLine -- yazilan bilginin tumunu getirir.
        // next ise ilk space e kadar olan kismini getirir. H Ibrahim icin next te sadece H gelecek, nextLine de hepsi.
        kullaniciIsmi = kullaniciIsmi.toUpperCase(); //ismi buyuk harfe cevirip kaydettik
        System.out.println("Kullanici isminin duzenlenmis hali : " + kullaniciIsmi);




    }
}

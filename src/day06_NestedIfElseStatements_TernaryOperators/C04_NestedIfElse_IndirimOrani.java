package day06_NestedIfElseStatements_TernaryOperators;

import java.util.Scanner;

public class C04_NestedIfElse_IndirimOrani {

    //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
    // kullaniciya musteri karti olup olmadigini sorun.
    // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
    // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int urunSayisi = scanner.nextInt();

        System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
        double listeFiyati = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi? E: evet , H : hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        double toplamFiyat = 0;

        if(kartVarMi == 'E'){
            if(urunSayisi>10){
                toplamFiyat = urunSayisi*listeFiyati*0.20;
                System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);
            }else {
                toplamFiyat = urunSayisi*listeFiyati*0.15;
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
            }

        }else if(kartVarMi == 'H'){
            if(urunSayisi>10){
                toplamFiyat = urunSayisi*listeFiyati*0.15;
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
            }else {
                toplamFiyat = urunSayisi*listeFiyati*0.10;
                System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);
            }
        }else {
            System.out.println("Kart bilgisi icin yanlis giris yaptiniz");
        }


    }
}

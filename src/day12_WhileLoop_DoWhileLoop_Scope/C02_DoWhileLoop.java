package day12_WhileLoop_DoWhileLoop_Scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        //kontrol etmeden once bir kere loop u calistirir

        //while loop da loop body sinin hic calismama ihtimali var midir==> yanlis deger atanirsa vardir
        //ama do while loop ta loop body sinin hic calismama ihtimali olmaz.
        // cunku hicbir kontrol olmadan zaten en az 1 kere calisir
        // once islem sonra kontrol
        // bu bir avantaj da olabilir dezavantaj da
/*
            Do while loop kontrol etmeden once
            1 kere loop'u calistirir
            while loop'da loop body'sinin hic calismama ihtimali VARDIR
            do-while loop'da loop body'sinin hic calismama ihtimali YOKTUR
            loop body'si en az bir kere calisir
         */
        // kullanicidan sayi degerleri alip toplayalim
        // kullanici 0'a bastiginda islem bitsin
        // ve toplami yazdirsin
        Scanner scanner= new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        do {
            System.out.println("Lutfen toplamak icin bir sayi yazin \nBitirmek icin 0'a basin");
            sayi= scanner.nextInt();
            toplam+=sayi;
        }while (sayi != 0);

        System.out.println("Sayilarin toplami : " + toplam);

    }
}

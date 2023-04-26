package day09_StringManipulation_Soru_ForLoops;

public class C12_Soru_7_RakamlarToplami {
    public static void main(String[] args) {
       // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        // bir sayinin basamak sayisi nasil bulunur ==> String te length ile bulabiliriz. int da yapamayiz
        // hiclikle sayiyi toplayip string yapip onun length ini aldik

       int sayi = 25555;
       int basamakSayisi = (""+sayi).length(); // hiclikle sayiyi toplayip string yapip onun length ini aldik
        int rakam = 0;
        int rakamlarToplami = 0;

        for (int i = 1; i <=basamakSayisi ; i++) {
            rakam = sayi %10;
            rakamlarToplami +=rakam;
            sayi /=10;
        }
        System.out.println("Verilen sayinin rakamlari toplami : " + rakamlarToplami);




    }



}

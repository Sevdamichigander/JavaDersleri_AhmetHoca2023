package day10_NestedForLoop_MethodOlusturma;

public class C11_MiniHesapMakinesi {
    public static void main(String[] args) {
        //kullanicin verdigi iki sayi ve
        // sececegi isleme gore
        //sonucu double olarak bize donduren bir method olusturun
        //ornek sayilar 3,5, islem * oldugunde method 15 dondurmeli

    miniHesapMakinesi(3,2, '/');

        // Bize sonuc donduren methodlarda, islem sonucunu gormek icin
        // ya hemen yazdirmak lazim
        // ya da islem sonucunu kaydedip istedigimizde kullanabiliriz (atama yapmamiz lazim)

        System.out.println(miniHesapMakinesi(3, 2, '/'));//Yazdirma

        double sonuc = miniHesapMakinesi(3,2, '*');// Kaydetme


    }
    public static double miniHesapMakinesi(int sayi1, int sayi2, char islemSembolu){

        // islem sembolu olarak -,*,/,+ kullanilabilsin
        double sonuc = 0;

        switch (islemSembolu){
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                sonuc = (double)sayi1 / sayi2;
                break;
            default:
                System.out.println("islem sembolu yanlis, sonuc 0 olarak atandi");

        }
        return sonuc;
    }

}

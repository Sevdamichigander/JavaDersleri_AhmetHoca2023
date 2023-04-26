package day10_NestedForLoop_MethodOlusturma;

public class C12_FaktoriyelSonucuDondurme {
    public static void main(String[] args) {
        // Verilen sayinin faktoryel degerini hesaplayip
        // sonucu donduren bir method olusturun

        System.out.println(faktoryelDegeriDondur(6)); //yazdirma
        int yediFaktoryel = faktoryelDegeriDondur(7);//kaydeder
    }
    public static int faktoryelDegeriDondur(int sayi){

        int faktoryel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i;
        }
        return faktoryel;
    }
}

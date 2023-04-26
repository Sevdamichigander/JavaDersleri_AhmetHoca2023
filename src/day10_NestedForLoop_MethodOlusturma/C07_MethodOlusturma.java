package day10_NestedForLoop_MethodOlusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {
        // verilen iki sayinin toplamini yazdiran bir method olusturun

        ikiSayiTopla(5,9);
        ikiSayiTopla(7,1);

    }

    public static void ikiSayiTopla(int sayi1, int sayi2){
        /*
        public : access modifier ==> erisim belirleyici, simdilik hep public yapiyoruz
        static : ozel bir keyword dur. Ileride anlatilacak.Simdilik hep statik
        void : return type tir. method un bana birsey dondurmeyecegini sadece yazdiracagini belirtir
        isim : method'un yaptigi is ile baglantili olmali
        (parametreler) : method un yapacagi is icin bizim gondermemiz gereken degiskenler

         */

        System.out.println("Iki sayinin toplami :" + (sayi1+sayi2));

    }
}

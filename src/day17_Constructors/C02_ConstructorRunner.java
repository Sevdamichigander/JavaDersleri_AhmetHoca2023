package day17_Constructors;

public class C02_ConstructorRunner {
    public static void main(String[] args) {
        // Bu class tan C01 classinda ki variable ve methodlara ulasmak istiyorum.
        // Baska clas ta ki statik class uyelerine ulasmak icin ==> class adi.methodAdi yapariz

        System.out.println(C01_Constructors.isHappy);
        C01_Constructors.staticMethod();

        // Static olmayan class uyelerine ulasmak icin
        // o classtan obje olusturmamiz lazim.

        C01_Constructors obje = new C01_Constructors();

        // bastaki C01_Constructors==> hem class adidir hem de objenin data turudur.
        // obje ==> objenin adi
        //new ==> yeni obje olusturmak icin keyword
        //sondaki C01_Constructors() ==> constructor

        /*
        Bir objenin olusturulmasi ve ilk deger atamasinin (initialized)
        yapilmasi icin mutlaka constructor calismalidir. Ama gorunurde bir const. yok.

        Java bir class olusturuldugunda
        o class tan obje olusturulabilmesi icin her class a otomatik olarak
        default bir constructor yerlestirir.

        Bu default constructorlar gorunmez.

         */
        System.out.println(obje.str);
        obje.sayi = 20;
        obje.staticOlmayanMethod();

    }
}

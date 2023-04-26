package day10_NestedForLoop_MethodOlusturma;

public class C08_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {
        /*
        Java OOP consept in en buyuk avantaji
        proje icerisinde 1 kere olusturulan method un
        her yerden rahatlikla kullanilabilmesidir.

        Baska bir class da static keyword kullanilarak olusturulan methodlara
        classIsmi.methodIsmi(parametreler) seklinde ulasabiliriz

         */

        C07_MethodOlusturma.ikiSayiTopla(25,45);//Iki sayinin toplami :70

        C09_FaktoriyelDegeriYazdirma.faktoryelDegeriYazdir(6);//6! = 720

        C10_AsalSayiSonucuYazdirma.asalSayiMiYazdir(57);//sayi asal degil
    }
}

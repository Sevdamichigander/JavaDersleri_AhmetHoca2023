package day10_NestedForLoop_MethodOlusturma;

public class C09_FaktoriyelDegeriYazdirma {
    public static void main(String[] args) {
        //Verdigimiz bir sayinin faktoriyel degerini yazdiran
        // bir method olusturun

        faktoryelDegeriYazdir(3);

    }
    public static void faktoryelDegeriYazdir(int sayi){
        int faktoriyel = 1;
        for (int i = sayi; i >=1 ; i--) {

            faktoriyel*=i;

        }
        System.out.println(sayi + "! = "+ faktoriyel);
    }
}

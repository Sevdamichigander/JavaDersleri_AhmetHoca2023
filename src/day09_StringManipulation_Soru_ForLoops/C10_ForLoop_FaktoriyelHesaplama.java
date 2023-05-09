package day09_StringManipulation_Soru_ForLoops;

public class C10_ForLoop_FaktoriyelHesaplama {
    public static void main(String[] args) {
        //Verilen bir sayinin faktoriyel degerini bulun
        //5! = 5*4*3*2*1

        int sayi = 10;
        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i;
        }
        System.out.println(faktoryel);
        faktoryel=1;


        // sonucu 5 ! = 5 * 4 * 3 * 2 * 1 = 120  seklinde yazdirin

        String sonuc = sayi+" ! = ";
        System.out.print(sonuc);

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i;
            if (i != 1){
                System.out.print(i+" * ");
            }else{
                System.out.print("1 = ");
            }
        }
        System.out.println(faktoryel);
    }
}

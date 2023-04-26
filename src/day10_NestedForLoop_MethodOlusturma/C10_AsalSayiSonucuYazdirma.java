package day10_NestedForLoop_MethodOlusturma;

public class C10_AsalSayiSonucuYazdirma {
    public static void main(String[] args) {
        // verilen sayinin asal sayi olup olmadigin yazdiran bir method olusturun

        asalSayiMiYazdir(37);

    }

    public static void asalSayiMiYazdir(int sayi){

        boolean asalMi=true;
        for (int i = 2; i <sayi ; i++) {
            System.out.println("dene " + i);
            if (sayi % i == 0){
                asalMi=false;
                break;
            }
        }

        if (asalMi){
            System.out.println("sayi asal");
        }else {
            System.out.println("sayi asal degil");
        }


    }
}

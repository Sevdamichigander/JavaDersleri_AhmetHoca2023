package day10_NestedForLoop_MethodOlusturma;

public class Deneme {
    public static void main(String[] args) {


        System.out.println(faktoriyelDegeriDondur(4));

    }

    public static int faktoriyelDegeriDondur(int sayi){

        int faktoriyel = 1;
        for (int i = sayi; i >=1 ; i--) {

            faktoriyel*=i;

        }
        return faktoriyel;
    }
}
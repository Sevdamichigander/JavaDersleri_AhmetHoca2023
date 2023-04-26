package day14_Arrays_MehmetHocaileSoruCozumu;

import java.util.Arrays;

public class C07_Split_MethodaCevirme {
    public static void main(String[] args) {
        String str = "Java gercekten cok guzeldir";

        //kac tan 'e' harfi var?

        // 1. adim :  harf harf ayir
        //  2. adim : loop ile 'e' ye esit var mi bak
        //  3.adim :  kac tane esit var

        // ayiracimiz hiclik olacak. cunku herseyin arasinda hiclik var

        // 1. adim :  harf harf ayir

        str.split("");// str i her hiclik gordugunde ayir
        String[] tanetane = str.split(""); // kaydettik
        System.out.println(Arrays.toString(tanetane)); //[J, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , g, u, z, e, l, d, i, r]


        //  2. adim : loop ile 'e' ye esit var mi bak

        int sayac = 0;

        for (int i = 0; i < tanetane.length; i++) {

            if (tanetane[i].equals("e")) {
                System.out.println("e var");
                //3. adim kac tane var
                sayac++;
            }

        }
        System.out.println("Aradigimiz e harfi array in icinde " + sayac + " kadar var");//Aradigimiz e harfi array in icinde 4 kadar var
        System.out.println();
    }

    public static void arananStringIcindeVarMi(String str, String aranan) {

        //"Java gercekten cok guzel" in icinde "e" ariyoruz

        String[] tanetane = str.split("");

        int sayac = 0;

        for (int i = 0; i < tanetane.length; i++) {

            if (tanetane[i].equals(aranan)) {
                System.out.println("e var");
                //3. adim kac tane var
                sayac++;
            }


        }
        System.out.println("Aradigimiz e harfi array in icinde " + sayac + " adet var");
    }
}


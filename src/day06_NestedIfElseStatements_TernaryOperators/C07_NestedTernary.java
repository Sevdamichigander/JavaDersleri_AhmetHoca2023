package day06_NestedIfElseStatements_TernaryOperators;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {
       // Teorik olarak nested ternary mumkun olsa da pratik degildir

        //  Kullanicidan bir tamsayi alin.
        //  Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        //  Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scanner.nextInt();

        System.out.println( sayi>0
                                ?
                                sayi % 2 ==0 ? "cift sayi" : "cift sayi degil"
                                :
                                sayi>=-999 && sayi<=-100 ? "uc basamakli" : "uc basamakli degil"
                                );

        // sayi>0 ? sayi%2==0 ? "Cift sayi" : "Cift sayi degil" : sayi>= -999 && sayi<= -100 ? "Uc basamakli" : "Uc basamakli degil"

    }
}

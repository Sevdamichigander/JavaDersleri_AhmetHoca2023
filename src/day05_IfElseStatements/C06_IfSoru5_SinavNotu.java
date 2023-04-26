package day05_IfElseStatements;

import java.util.Scanner;

public class C06_IfSoru5_SinavNotu {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse “Sinifi Gectin”, 
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu yaziniz");

        double not  = scanner.nextDouble();
        
        if(not>50){
            System.out.println("Sinifi Gectin");
        }else System.out.println("Maalesef kaldin");

        /*
        Onceki sorulardan farkli olarak
        bu soruda iki if birbirine bagimlidir.
        Iki if ten sadece biri calisir.
        Ikisinin birden calisma ihtimali yoktur.
        Ikisinin de calismama ihtimali de yoktur.
         */

    }
}

package day09_StringManipulation_Soru_ForLoops;

import java.util.Scanner;

public class C01_StrinManip_Soru1_HomeSweetHome {

    public static void main(String[] args) {
        /*
                    Soru 1 : Kullanicidan bir cumle alin
            - cumlede ev geciyorsa, "home home sweet home" yazdirin
            - cumlede is geciyorsa, "calismak guzeldir"
            - ikisini de iceriyorsa "Hem ev lazim hem is"
            - hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle = scanner.nextLine().toLowerCase();

        // if-else kullanmaliyiz / En kisitlayici olan sarttan baslamaliyiz

        if(cumle.contains("ev") && cumle.contains("is")){
            System.out.println("Hem ev lazim hem is");
        }else if (cumle.contains("ev")){
            System.out.println("home home sweet home");
        }else if (cumle.contains("is")){
            System.out.println("calismak guzeldir"); //calismak kelimesindeki is hecesi de yeterli
        }else System.out.println("cok calisman lazim");


//Evden calismak buyuk rahatlik ==>Hem ev lazim hem is

//Kendini dev aynasinda goruyor ==> home home sweet home






    }
}

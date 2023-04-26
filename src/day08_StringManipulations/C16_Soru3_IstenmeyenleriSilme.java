package day08_StringManipulations;

import java.util.Scanner;

public class C16_Soru3_IstenmeyenleriSilme {
    public static void main(String[] args) {

         /*

            Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
            sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.

            input : java1 ogRe2@nMek3 #ne +Gu=zel
            output : Java ogrenmek ne guzel.

        */

        String str = "java1 ogRe2@nMek3 #ne +Gu=zel";
        System.out.println(str = str.replaceAll("\\d", " "));//digits

        str =str.replace(" ","5");
        System.out.println(str);

        System.out.println(str = str.replaceAll("\\W", ""));// harf veya rakam olmayan hersey

        System.out.println(str = str.toLowerCase());

        System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));// Ilk harfi buyuk yazdirma

        str = str.replace("5"," ");
        System.out.println(str); // java  ogre nmek  ne guzel

        //System.out.println("Java ogrenmek ne guzel"); //???? \b calismiyo





    }
}

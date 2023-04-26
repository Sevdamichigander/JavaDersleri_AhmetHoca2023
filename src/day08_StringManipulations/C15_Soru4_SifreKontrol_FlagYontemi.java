package day08_StringManipulations;

public class C15_Soru4_SifreKontrol_FlagYontemi {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip,
                asagidaki sartlari kontrol edin
                 ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
                  eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
                - ilk harf kucuk harf olmali
                - son karakter rakam olmali
                - sifre bosluk icermemeli
                - uzunlugu en az 10 karakter olmali


                soruyu if else ile yaparsak sadece 1 hata yazdirir, otekilere bakmaz
                bagimsiz 4 if cumlesi olmali
                en sonda 4 sarti da sagladigini kontrol eden bir variable kullanacagiz.


         */


        int flag = 0;
        String sifre = "a123456789" ;
        char sonHarf = sifre.charAt(sifre.length()- 1);

        // ilk harf kucuk harf olmali

        if(sifre.charAt(0)>='a' && sifre.charAt(0)<='z') flag++;
            else System.out.println("Ilk harf kucuk harf olmali");

        // - son karakter rakam olmali

        if((sonHarf)>='0' && (sonHarf)<='9') flag++;
            else System.out.println("son karakter rakam olmali");

        if(sifre.contains(" ")) System.out.println("Sifre bosluk icermemeli ");
            else flag++;

            //uzunlugu en az 10 karakter olmali
        if (sifre.length()>=10) flag++;
            else System.out.println("uzunlugu en az 10 karakter olmali");


            //sifre tum sartlari saglarsa
        if(flag==4) System.out.println("Sifre basariyla kaydedildi");

    }
}

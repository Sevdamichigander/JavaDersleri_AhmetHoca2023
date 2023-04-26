package day01_JavayaGiris;

public class C02_Assignement_Atama {
    public static void main(String[] args) {

        int sayi;


        // bir hesap acar, bu hesabin adi sayi olur,ve buna integer veriler gelir.

        /*
        Java'da bir kodun alti kirmizi cizili ise
        orada Compile Time Error CTE vardir
        eger projenin herhangi bir yerinde CTE varsa
        o projedeki hic bir class calismaz
        Java'da yazdirma islemi yapilirken
        " " arasina yazilan her sey bir metin olarak algilanir
        ve " " ne yazarsaniz oraya yazdiginiz sekilde consolda yazdirilir
        Eger bir variable'in o satirdaki degerini yazdirmak isterseniz
        sout icerisine varible ismini yazmaniz yeterlidir.
     */
        //System.out.println(sayi); Java da bir kodun alti kirmizi cizili ise orada compile time error_CTE vardir
        //Eger projenin herhangi bir yerinde CTE varsa o projedeki hicbir class calismaz.


        // Java deger atanmadan
        // bir variable olusturulmasina izin verir
        // ama deger atanmadan kullanmaya izin vermez
        // System.out.println(sayi);

        //System.out.println("sayi"); //Java da yazdirma islemi yapilirken "" arasina yazilan hersey bir metin olarak algilanir.
        // ve ne yazarsaniz oraya yazdiginiz sekilde konsolda yazdirilir.

        sayi = 20; // su anda sayi variable nin bir degeri var
        System.out.println(sayi);

        sayi = sayi +10;

        // sayi + 10 = sayi ;
        // Java'da esitligin sol tarafi variable'dir ve sol tarafta islem olmaz
        // esitligin sag tarafi degerdir, burada islemler olabilir
        // java = gordugunde once esitligin sagini hesaplar
        // sonra sag tarafta buldugu degeri, soldaki variable'a atama yapar
        // Java once sag tarafi yapar. Sonra buldugu degeri variable a atama yapar.

        System.out.println(sayi);

        sayi = 2*sayi;
        System.out.println(sayi);

        //int sayi = 50; // sayi variable i daha once tanimlandigi icin Java ikinci kez kabul etmiyor.
                       // Variable bir kere olusturulduktan sonra ona yeniden data turu yazamazsiniz.
                    // Java olusturulan bir variable in data turunun degistirilmesine izin vermez. Onun icin data turu sadece 1 kez yazilabilir.
        // int sayi = 50;
        // data turu yukarida tanimlanmisti
        // Java olusturulan bir variable'in data turunun degistirilmesine IZIN VERMEZ
        // onun icin data turu sadece 1 kere yazilabilir

    }
}


//Eger bir variable in o satirdaki degerini yazdirmak isterseniz sout icerisine variable ismini yazmaniz yeterlidir.
// Java da esitligin sol tarafi variable dir. Burda islem olmaz/
// Sag taraf degerdir, burda islemler olabilir. java = isaretini gordugunde once esitligin sag tarafini hesaplar,
//sonra buldugu degeri soldaki variable a atama yapar
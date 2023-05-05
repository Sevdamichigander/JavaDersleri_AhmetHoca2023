package day08_StringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        String str = "Java en iyisi";

        // indexOf methodu aranan yazi parcaciklarinin, yazi icerisindeki index ini bize dondurur

        // n harfinin yerini ogrenmek istedigimde


        System.out.println(str.indexOf("e")); // 5
        System.out.println(str.indexOf("i")); // 8 ___ birden cok varsa birincisinin indeksini getiriyor
        System.out.println(str.indexOf("a")); // 1
        System.out.println(str.indexOf("a")); // 1
        System.out.println(str.indexOf("en")); //5 ___ Java bunu bir tugla gibi dusunuyor(ayri ayri bakmiyor)
        // ve ilk harfine gore indeksini veriyor.

        System.out.println(str.indexOf("yi")); //9

        System.out.println(str.indexOf("iyisi"));// 8

        System.out.println(str.indexOf("m"));//-1
        System.out.println(str.indexOf("guzel"));// -1 ___ yok demek

        //kontrol etmek icin (a kacinci indekste?) _ aramayi belli bor noktadan sonra baslatmak icin
        // mesela 2. indeksten sonrasini kontrol etmek istiyorsaniz (str.indexOf("a", 2) yaziyoruz.
        // aradigimiz noktadan sonra 2. harf olmasina ragmen indeksi saymaya 0 dan basladigi icin sonuc 3 olur.
        // harflerin adresi/indeksi degismiyor

        System.out.println(str.indexOf("a", 1));// 1

        System.out.println(str.indexOf("a", 2));//3 her zaman saymaya indeks 0 dan baslar

        System.out.println(str.indexOf("i")); // 8
        System.out.println(str.indexOf("i", 5));//8

        System.out.println(str.indexOf("i", 9));//10
        System.out.println(str.indexOf("i", 11));//12

        System.out.println("======================================");


        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis

        //Java en iyisi ___ __ "en" kelimesi icin index of ile bulmaya calisiyoruz

        int birinciKelimeIndex = str.indexOf("en");

        if (str.indexOf("en") == -1) {
            System.out.println("Aradiginiz kelime bu cumlede yok");
        }
        else {
            if (str.indexOf("en", birinciKelimeIndex + 1) == -1) {
                System.out.println("Bu cumlede aradiginiz kelime bir tane");
            }
            else {
                System.out.println("Birden cok var"); // Bu cumlede aradiginiz kelime bir tane

            }
        }
    }
}
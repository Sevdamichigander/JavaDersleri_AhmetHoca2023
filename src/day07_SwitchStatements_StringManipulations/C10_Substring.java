package day07_SwitchStatements_StringManipulations;

public class C10_Substring {
    public static void main(String[] args) {

        String str = "Java Candir"; //herhangi bir stringin belli bir bolumunu almak istersek substring kullaniyoruz

        //sadece Candir kismini yazdiralim

        System.out.println(str.substring(5)); // Candir ==> 5 ten basladi.sona kadar hepsini yazdirdi

        System.out.println(str.substring(2)); //va Candir
        System.out.println(str.substring(10)); //r
        System.out.println(str.substring(11));// bi tane bos satir yazar.Mantigi su : r den sonra hicbirsey yok. onu yazdiriyor

        //System.out.println(str.substring(12));// Exception in thread "main" java.lang.
                                                        // StringIndexOutOfBoundsException:
                                                         //String index out of range: -1 (-1 daha buyuk)

        //System.out.println(str.substring(21));//String index out of range: -10

        // Sadece java kismini yazdirin

        System.out.println(str.substring(0));// Hepsini yazdirdi
        System.out.println(str.substring(0, 4)); // Baslangic ve bitis indexleri verildiginde
        // genellikle baslangic indeksi dahil (inclusive) bitis indeksi haric (exclusive) olur.
        // Bu ornekte 4. indeksi yazdirmiyor.


        System.out.println(str.substring(3,4)); // java nin ikinci a sini yazdirir
        System.out.println(str.substring(1,2));// java nin birinci a sini yazdirir

        //Eger sadece bir harf almak isterseniz substring(harfin indeksi, harfin indeksi + 1) yazabiliriz

        System.out.println(str.substring(5,5));// hiclik

        //System.out.println(str.substring(8,5));//Exception in thread "main" java.lang.
                                             // StringIndexOutOfBoundsException
                                            // : begin 8, end 5, length 11

         String str2 = "eSRa";

         //ilk harfini buyuk, kalanlari kucuk harf olacak sekilde duzenleyin. duzenleyin dedigi icin atama yapiyoruz

        str2 = str2.substring(0,1).toUpperCase() + str2.substring(1).toLowerCase();
        System.out.println(str2); // Esra
    }
}

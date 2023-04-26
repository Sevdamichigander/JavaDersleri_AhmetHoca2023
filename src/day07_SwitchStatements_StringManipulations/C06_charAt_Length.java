package day07_SwitchStatements_StringManipulations;

public class C06_charAt_Length {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor. Kendisini cok seviyoruz";
        System.out.println(str.charAt(5)); //g
        System.out.println(str.charAt(29)); //r

        //System.out.println(str.charAt(35)); //StringIndexOutOfBoundsException ___String index out of range: 35
        //System.out.println(str.charAt(30)); //StringIndexOutOfBoundsException ___String index out of range: 35

        // str da toplam kac karakter var?

        System.out.println(str.length());//30 !!!! Index ile uzunlugu karistirma

        // Java kelimesinin uzunlugu 4; ama son harfin indeksi (3) tur.Cunku sifirdan basliyoruz.

        // son harfi yazdirin
        int uzunluk = str.length();
        System.out.println(str.charAt(uzunluk-1)); // Degisikliklere cok iyi uyum saglar. Sonradan bir harf kelime eklendiginde
                                                // ona adapte olur. DINAMIKTIR

        //son harften bir onceki harfi yazdirin=sondan ikinci harf
        System.out.println(str.charAt(uzunluk-2));// u

        //Sondan ucuncu harfi yazdirin
        System.out.println(str.charAt(str.length() - 3)); //r her seferinde uzunluk variable i olusturmayalim diye string.length ile yaptik




    }
}

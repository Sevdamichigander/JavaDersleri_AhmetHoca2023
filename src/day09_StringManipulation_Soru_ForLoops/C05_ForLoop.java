package day09_StringManipulation_Soru_ForLoops;

public class C05_ForLoop {
    public static void main(String[] args) {
        // 10 kere "Hello World" yazdirin
        System.out.println("****************************************************");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("*******************************************************");

        String str = "Hello World";
        System.out.println(str.repeat(10)); //Helllo WorldHelllo WorldHelllo WorldHelllo WorldHelllo WorldHelllo WorldHelllo WorldHelllo WorldHelllo WorldHelllo World

        System.out.println("************************************************");

        // 1 den 100 e kadar olan sayilari yazdirin (Baslangic degeri, artis/azalis miktari ve bitis sarti onemli)

        // 3 basamakli cift sayilari toplayin
        // (3 basamkli ilk cift sayi 100, toplama diye bir variable al, 102 yi ekle, 104 u ekle...1000 e kadar)
        //Verilen bir sayinin rakamlar toplamini bulun
        // (1453, modulus 10 ile 3 u al, rakamlar toplamina 3 u ekle. sonra /10 deyip 3 ten kurtul. 145;
        // modulus 10 deyip birler basamagini bul, 10 a bol bundan lurtul...)

        // 1 den 100 e kadar(100 dahil) olan sayilari yazdirin

        for (int i = 1; i <=100 ; i++) { // baslangic sarti, bitis sarti, artma veya azalma yontemi
            System.out.print(i + " ");
        }
        // 3 basamakli cift sayilari toplayin
        int sayilarToplami = 0;
        for (int i = 100; i <=999; i+=2) { // i nin degerini 2 ser artirmak icin i+=2 yazdik
            sayilarToplami +=i;
        }
        System.out.print("\n" + sayilarToplami);

    }
}

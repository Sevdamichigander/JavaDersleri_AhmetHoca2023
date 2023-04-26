package day08_StringManipulations;

public class C12_replaceAll2 {
    public static void main(String[] args) {


        // str icindeki bütün sayilari method ile temizleyin
        String str = "      J23a3345+%v^+%4+%353a 23%&4C%&3543/(45a3()456n345d/(i&/r^+          ";
        System.out.println(str);

        // bütün sayıları hiçlik yap
        str=str.replaceAll("\\d","");
        System.out.println(str);

        // baştaki ve sondaki boşlukları sil
        str=str.trim();
        System.out.println(str);

        // boşluğu 5 yap
        str =str.replace(" ","5");
        System.out.println(str);

        // harf ve sayı olmayan herşeyi sil
        str = str.replaceAll("\\W","");
        System.out.println(str);

        // 5'i tekrardan boşluk yap
        str = str.replace("5"," ");
        System.out.println(str);
//
//
//
//
//        str =str.trim();
//        System.out.println(str);



    }
}

package day16_arrayList;

public class C14_ForEachLoop {
    public static void main(String[] args) {
        // iki sayiyi toplayan ve sonucu donduren bir method

        int a = 22;
        int b = 52;

        System.out.println(toplamaMethodu(a, b)); //74

    }

    public static int toplamaMethodu(int a, int b){

        int sonuc = 0;

        sonuc = a+b;

        return sonuc;

    }
}

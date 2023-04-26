package day09_StringManipulation_Soru_ForLoops;

public class C07_ForLoop {
    public static void main(String[] args) {
        //verilen iki sayi ve aralarindaki tum tam sayilari toplayip yazdirin
        //iki sayidan hangisinin kucuk oldugu bilinmiyor.
        int sayi1 = 3;
        int sayi2 = 5;
        int toplam = 0;


        if(sayi1<sayi2){
            for (int i = sayi1; i<=sayi2 ; i++) { // kucukten buyuge
                toplam+=i;

            }
        }else {

            for (int i = sayi1; i >= sayi2; i--) { // buyukten kucuge
                toplam += i;

            }
        }
        System.out.println(toplam);

    }
}

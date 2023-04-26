package day14_Arrays_MehmetHocaileSoruCozumu;

import java.util.Arrays;
import java.util.Scanner;

public class C10_KullaniciTarafindanOlusturulanArray_BoyutunuAlarak {
    public static void main(String[] args) {
        //array in boyutunu belirle
        //boyuta bagli degerleri kullanicidan al
        //yazdir
        //methoda cevir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array boyutunu giriniz");
        int arrayBoyutu = scan.nextInt();
        int[] arr = new int[arrayBoyutu];

        int arrayElementi = 0;

        for (int i = 0; i < arrayBoyutu; i++) {
            System.out.println("Lutfen arrayin " + i+ " ci elemanini giriniz");

            arrayElementi = scan.nextInt();

            arr[i] = arrayElementi;


        }
        System.out.println(Arrays.toString(arr));
    }
    public static int [] kullaniciArrayOlusturma(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array boyutunu giriniz");
        int arrayBoyutu = scan.nextInt();
        int[] arr = new int[arrayBoyutu];

        int arrayElementi = 0;

        for (int i = 0; i < arrayBoyutu; i++) {
            System.out.println("Lutfen arrayin " + i+ " ci elemanini giriniz");

            arrayElementi = scan.nextInt();

            arr[i] = arrayElementi;


        }
        return arr;
    }
}

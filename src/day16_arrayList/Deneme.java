package day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        // ogretmenden alinan ogrenci notlarinin ortalamasini ve
        // kac ogrencinin ortalamanin
        // ustunde not aldigini bize ulastiran bir method yazin


        Scanner scan = new Scanner(System.in);

        int ogrenciNotu=5;

        List<Integer> notlarListesi = new ArrayList<>();

        while (ogrenciNotu != 0) {
            System.out.println("Lutfen notlarinizi giriniz\nGiris islemi bittiginde 0 a basiniz");
            ogrenciNotu = scan.nextInt();

            if(ogrenciNotu!=0){
                notlarListesi.add(ogrenciNotu);
            }
        }
        System.out.println(notlarListesi);
    }
/*
    public static int notOrtalama(){

        int not = 0;
        int toplam = 0;
        int ogrenciSayisi=5;
        int ortalama = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 adet dersin notlarini giriniz");


        for (int i = 0; i <=ogrenciSayisi ; i++) {

            toplam+=not;
            i++;

            ortalama = toplam/i;

        }

       return notOrtalama();*/
}


package day16_arrayList;

import java.util.List;

public class C05_OgrenciNotlari {
    public static void main(String[] args) {

        // ogretmenden alinan ogrenci notlarinin ortalamasini ve kac ogrencinin ortalamanin
        // ustunde not aldigini bize ulastiran bir method yazin

        List<Integer> notlarListesi = C04_KullanicidanIntListeOlusturma.kullanicidanSayiAlarakListeOlusturanMethod();

        notOrtVeOrtUstOgrenciSayisi(notlarListesi);

    }

    public static void notOrtVeOrtUstOgrenciSayisi(List<Integer>notlarListesi){

        // not ortalamasi

        int toplamNot = 0;
        int ortalamaNot = 0;
        int sayac = 0;

        for (int i = 0; i < notlarListesi.size() ; i++) {

            toplamNot = toplamNot+notlarListesi.get(i);

        }

        ortalamaNot = toplamNot / notlarListesi.size();


        //not ortalamasi uzerindeki ogrenci sayisi

        for (int i = 0; i < notlarListesi.size(); i++) {

            if (notlarListesi.get(i)>ortalamaNot){

                sayac++;
            }

        }

        System.out.println("siniftaki ogrenci sayisi : " + notlarListesi.size());
        System.out.println("sinifin ortalama notu : " + ortalamaNot);
        System.out.println("sinifin ortalama not ustu ogrenci sayisi : " +sayac );

    }
}

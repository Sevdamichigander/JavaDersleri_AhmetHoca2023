package day14_Arrays_MehmetHocaileSoruCozumu;

import java.util.Arrays;

public class C02_Soru3_LoopileCozumu_Dinamik {
    public static void main(String[] args) {
        // 1. adim son elemani gecici bir yere kaydet
        // 2- elemanlari saga kaydir
        //3- kaydettigimiz son elemani yeni array in basina koy

        int[] input = {4, 5, 6, 7};
        System.out.println(Arrays.toString(input)); //[4, 5, 6, 7] ___ methodu kaydetmeden onceki halini yazdirdik

        //elemanlariSagaKaydir(input); // methodu kullanmak icin cagirdik

        input = elemanlariSagaKaydir(input);// burda methodu kaydettik
        System.out.println(Arrays.toString(input)); //burda kaydedilmis methodu yazdirdik
    }

    // methodun (makinenin) kendisi

    public static int[] elemanlariSagaKaydir(int[] input) {
        // [4, 5, 6, 7]
        // 1. adim son elemani gecici bir yere kaydet. Length kullanarak dinamik bir yapi olusturuyoruz

        int gecici = input[input.length - 1]; // son index i istedigim icin length -1 dedik

        // 2- dinamik olarak elemanlari saga kaydir

        for (int i = input.length - 2; i >= 0; i--) {// neden -2 ==> -1 i zaten halletmistim

            input[i + 1] = input[i];

        }
        // 3- kaydedilen gecici elemani basa koyduk

        input[0] = gecici;

        return input; //  updated (degistirilen) array methodu makine nerden cagrilmissa bu oraya iade edilecek son haliyle
    }
}

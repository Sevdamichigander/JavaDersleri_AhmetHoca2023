package day13_Arrays;

public class C05_ArraydekiEnBuyukSayiyiBulma {
        // Verilen int array deki en buyuk sayiyi bize donduren bir method olusturun

        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 8, 1, 3, 7, 5};

            System.out.println(enBuyukSayi(arr));// 8

        }

        public static int enBuyukSayi(int[] arr) {

        int enBuyuksayi = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>enBuyuksayi){
                enBuyuksayi = arr[i];
            }

        }
        return enBuyuksayi;
    }
}





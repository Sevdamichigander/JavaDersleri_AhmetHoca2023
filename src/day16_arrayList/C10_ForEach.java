package day16_arrayList;

public class C10_ForEach {
    public static void main(String[] args) {
        /*
        bir array icindeki sayilardan 5 den buyuk olanlari toplayalim
         */

        int[] arr = { 5, 7, 4, 6}; //13
        int toplam = 0;


        // for each kullandigimizda 3 unsura dikkat etmek gerekiyor
        //1- herbir elementin data type==> int
        //2-her bir elemente ortak isim ==> each
        //3-elementlerin geldigi kaynak ==> arr

        for (int each : arr) {
            if (each > 5) {
                toplam += each;

            }
        }
        System.out.println("Array icindeki 5 ten buyuk elemanlarin toplami : " + toplam);
    }
}

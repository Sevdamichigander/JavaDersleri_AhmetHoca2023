package day16_arrayList;

public class C08_ForEachLoop_Soru2 {
    public static void main(String[] args) {
        // index yapisini kullanmadan tum elementleri getirir. siralama olmaksizin.
        //Soru 2- Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[] arr = {5,3};


        arrayKareToplamlari(arr);


    }

    public static void arrayKareToplamlari(int[] arr){

        // array elementleri

        int toplam = 0;

        for (int each:arr) {
            // elementlerin toplamini hesapla

            toplam = toplam + each*each;
        }
        System.out.println("arrayin elemanlari toplami : " + toplam);
    }

}

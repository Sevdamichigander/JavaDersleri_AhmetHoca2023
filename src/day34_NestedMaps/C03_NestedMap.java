package day34_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C03_NestedMap {
    public static void main(String[] args) {

        /*
        Asagidaki body’yi map olarak olusturun
        {
            “firstname” : “Ahmet”,
            “lastname” : “Bulut”,
            “totalprice” : 500,
            “depositpaid” : false,
            “bookingdates” : {
                   “checkin” : “2021-06-01”,
                   “checkout” : “2021-06-10”
                      },
            “additionalneeds” : “wi-fi” }

            key lerin hepsi string
            value : String, Integer, Boolean, Map<String, String>
         */

        Map<String, Object> rezervasyonMap = new HashMap<>();
        //{
        //                   “checkin” : “2021-06-01”,
        //                   “checkout” : “2021-06-10”
        //                      }

        Map<String, String> bookingdatesMap = new HashMap<>();
        bookingdatesMap.put("checkin", "2021-06-01");
        bookingdatesMap.put("checkout", "2021-06-10");


        rezervasyonMap.put("firstname", "Ahmet");
        rezervasyonMap.put("lastname", "Bulut");
        rezervasyonMap.put("totalprice", 500);
        rezervasyonMap.put("depositpaid", false);
        rezervasyonMap.put("bookingdates",bookingdatesMap);
        rezervasyonMap.put("additionalneeds", "wi-fi");

        System.out.println(rezervasyonMap);

        /*

       {firstname=Ahmet,
        additionalneeds=wi-fi,
        bookingdates={checkin=2021-06-01, checkout=2021-06-10},
        totalprice=500,
        depositpaid=false,
        lastname=Bulut}

         */
        System.out.println(bookingdatesMap);//{checkin=2021-06-01, checkout=2021-06-10}

        // RezervzsyonMap te isim bilgisini yazdirin

        System.out.println(rezervasyonMap.get("firstname"));//Ahmet

        // RezervzsyonMap te additionalneeds bilgisini yazdirin

        System.out.println(rezervasyonMap.get("additionalneeds"));// wi-fi

      // RezervzsyonMap te lastname ilk harf bilgisini getirin

        System.out.println(((String) rezervasyonMap.get("lastname")).charAt(0));// B
            // RezervzsyonMap te olmayan birsey istedigimizde

        System.out.println(rezervasyonMap.get("yas")); //null

        // RezervzsyonMap te check in bilgisini getirin

        System.out.println(((Map) rezervasyonMap.get("bookingdates")).get("checkin")); //2021-06-01

    }
}

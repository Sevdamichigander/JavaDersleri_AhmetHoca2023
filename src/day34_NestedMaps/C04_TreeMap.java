package day34_NestedMaps;

import java.util.TreeMap;

public class C04_TreeMap {
    public static void main(String[] args) {

        /*
        TreeMap elementleri dogal sirali olarak tuttugu,
        ve yeni eklenen elementleri de bu siralamaya uygun bir konuma yerlestirdigi icin
        diger map lerde olmayan bazi ekstra ozelliklere sahiptir.
         */

        TreeMap<Integer, String> ogrenciMap = new TreeMap<>();
        ogrenciMap.put(103, "Ali Can");
        ogrenciMap.put(120, "Veli Cem");
        ogrenciMap.put(101, "Akif Han");
        ogrenciMap.put(140, "Yusuf San");

        System.out.println(ogrenciMap); // {101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.subMap(103, 110)); //{103=Ali Can}
        System.out.println(ogrenciMap.subMap(103, 120)); //{103=Ali Can}
        System.out.println(ogrenciMap.subMap(103, 121)); //{103=Ali Can, 120=Veli Cem}
        System.out.println(ogrenciMap.subMap(103,false, 120, true));  //{120=Veli Cem}
        // Sadece sinirlar yazilirsa baslangic dahil, bitis haric olur
        //Ama istersek baslangic ve bitisin dahil olup olmamasini boolean degerler ile belirleyebilirz

        System.out.println(ogrenciMap.descendingMap());
        // map i sondan basa dogru yazdiracak
        // kalici bir degisim yapmaz. TreeMap in ruhuna da aykiri
        //{140=Yusuf San, 120=Veli Cem, 103=Ali Can, 101=Akif Han}

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.descendingKeySet()); //[140, 120, 103, 101] sadece key leri getirir ama ters sirada

        /*
        Kullanildigi satirda treeMap in siralamasini terse cevirir ama bu degisim kalici olmaz.
        Sdece o satira ait  bir islemdir.
         */

        System.out.println(ogrenciMap.lowerKey(120));//120 den bir kucuk olani verir ==> 103

        System.out.println(ogrenciMap.lowerEntry(120)); // 120 den kucuk olan ==> 103=Ali Can

        System.out.println(ogrenciMap.floorKey(105));// asagi yuvarla demek == Deger yoksa bir asagi yuvarlayip ordaki degeri verir
                                                    //103
        System.out.println(ogrenciMap.floorKey(119));//103
        System.out.println(ogrenciMap.floorKey(120));//120


        System.out.println(ogrenciMap.floorEntry(135)); // 135 ten onceki degeri entry si ile verir
        //120=Veli Cem

        System.out.println(ogrenciMap.higherKey(120));// 120 den buyuk olan ==> 140

        System.out.println(ogrenciMap.higherEntry(100));//101=Akif Han

        System.out.println(ogrenciMap.ceilingKey(120)); // 120 yi yukariya dogru tamamlayacak ama 120 zaten var. Yuvarlamaya gerek yok

        System.out.println(ogrenciMap.ceilingKey(100));//101
        System.out.println(ogrenciMap.ceilingEntry(100));//101=Akif Han

        System.out.println(ogrenciMap);// {101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.headMap(120));// basa dogru map ==> {101=Akif Han, 103=Ali Can} bitisler dahil olmaz
        System.out.println(ogrenciMap.headMap(130));//{101=Akif Han, 103=Ali Can, 120=Veli Cem}
        System.out.println(ogrenciMap.headMap(120, true));//{101=Akif Han, 103=Ali Can, 120=Veli Cem} === bitis olarak verilen key i dahil eder
        System.out.println(ogrenciMap.headMap(130, true));// 130 isimli element olmadigi icin degisen birsey olmaz/dahil edemez

        System.out.println(ogrenciMap.tailMap(120));// sona dogru map
            //{120=Veli Cem, 140=Yusuf San} burda 120 baslangic degeri oldugu icin onu dahil etti
        System.out.println(ogrenciMap.tailMap(120, false));// false yazdigimiz icin exclusive olur

        System.out.println(ogrenciMap.firstEntry()); //101=Akif Han
        System.out.println(ogrenciMap.lastEntry());//140=Yusuf San
        System.out.println(ogrenciMap.firstKey());//101
        System.out.println(ogrenciMap.lastKey());//140

        System.out.println(ogrenciMap.pollLastEntry());// son entry yi silip bize dondurur
        //140=Yusuf San
        System.out.println(ogrenciMap);//{101=Akif Han, 103=Ali Can, 120=Veli Cem} artik son entry yok

        System.out.println(ogrenciMap.pollFirstEntry());//101=Akif Han bunu getirir ve siler
        System.out.println(ogrenciMap);//{103=Ali Can, 120=Veli Cem} son hald e101 yok

        ogrenciMap.clear();
        System.out.println(ogrenciMap);// {}


    }
}

package day22_StringBuilder_AccessModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {

        // StringBuilder sb1 = "Java";      Required type: //StringBuilder
        //                                  Provided://String
        /*
        Non-primitive data turlerinde bir data turunde ki degeri,
        farkli data turundeki bir variable a atayabilmek icin aralarinda
        parent-child iliskisi olmalidir.

         */

        Object obj = "Java";
        Object obj2 = "23";
        Object obj3 = "true";

        // Object butun data turlerinin parent i oldugu icin hersey atayabiliriz.

        //3 farkli sekilde String Builder olusturulabilir.
        //Bu yontemler arasindaki fark capacity yani hafiza kullanimi ile ilgilidir.


        StringBuilder sb2 = new StringBuilder("Java candir");
        System.out.println(sb2); //Java candir

        System.out.println(sb2.length());//11
        System.out.println(sb2.capacity());//27 ==>11karakter+16

        sb2.append(", buna inanmayan mi var?");

        System.out.println(sb2);
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//56 ==>27*2+2

        // Eger StringBuilder da fazla kullanilmis kapasiteyi temmizlemek,
        // length=kapasite yapmak isterseniz
        // sb2.trimToSize yapariz

        sb2.trimToSize();

        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//35


    }
}

package day08_StringManipulations;

public class C03_startsWith_andWith {
    public static void main(String[] args) {
        String str = "Java cok eglenceli";
        // Bir yazinin (str), bir yazi parcacigi ile baslayip baslamadigini test eder.

        System.out.println(str.startsWith("java")); // False __ case sensitive

        System.out.println(str.startsWith("Java")); // True

        System.out.println(str.startsWith(str)); // true __kendisi ile mi basliyor __evet

        System.out.println(str.startsWith("")); // true __en basta hic bir sey mi var

       System.out.println( "==================================================");


       //endswith metodu, istenilen bir yazinin belli bir yazi parcacigi ile bitip bitmedigini kontrol eder.
        System.out.println(str.endsWith("a")); // false __ yazi a ile bitmedigi icin
        System.out.println(str.endsWith("eglenceli")); // true
        System.out.println(str.endsWith("celi")); // true
        System.out.println(str.endsWith("Java cok eglenceli")); // true__ kendisiyle baslayip kendisiyle bitirir
        System.out.println(str.length()); //18

        System.out.println(str.substring(str.length() - 3)); //eli
        // str.endsWith(str.endsWith(substring(str.length())) - 3)).System.out.println();


    }
}

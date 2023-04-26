package day08_StringManipulations;

public class C01_substring {

    public static void main(String[] args) {

        String str = "Java cok guzel";

        System.out.println(str.substring(3)); // 3 ten baslayarak hepsini yazdir

        System.out.println(str.substring(5, 9));// cok 5 ten 9 a kadar yazdir. 5 dahil ama 9 dahil degil.

        System.out.println(str.substring(2, 6));// va c

        // Yazinin belli bir yerinin test edilmesi istenildiginde kullanilir. Cok faydalidir.

    }
}

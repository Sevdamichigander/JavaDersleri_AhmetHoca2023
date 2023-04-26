package day17_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Constructors {

    String str = "Constructor";
    int sayi = 10;
    static boolean isHappy = true;




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String>                                isimler       = new         ArrayList<>();

        // olustumak istedigimiz datanin turu       objenin adi   = keyword     constructor

        // abc() ==> method dur
        // constructor bir class tan obje olusturmak icin kullandigimiz ozel bir java yapisidir.
        //Constructor methoda benzer ama method degildir. Constructor dir.
        // Bir class tan obje olusturmaya yarar.

    }

    public static void staticMethod(){

        System.out.println("C01 static method calisti");
    }

    public  void staticOlmayanMethod(){
        System.out.println("C01 static olmayan method calisti.");
    }
}

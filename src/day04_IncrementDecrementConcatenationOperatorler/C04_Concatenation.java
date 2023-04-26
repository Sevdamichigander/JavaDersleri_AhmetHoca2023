package day04_IncrementDecrementConcatenationOperatorler;

public class C04_Concatenation {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int i1 = 3;
        int i2 = 4;

        //Sadece bu variablelari kullanarak asagida verilen metinleri yazdirin

        System.out.println(s1 + s3 + s2); // Java Candir

        System.out.println(s1+s3+i1+i2); // Java 34

        System.out.println(s1+s3+(i1+i2)); //Java 7

        System.out.println(i1*i2 + s3 + s1);//12 Java

        System.out.println(s4 + i1+i2+s3+s2);//34 Candir


    }
}

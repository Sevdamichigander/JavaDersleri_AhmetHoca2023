package day07_SwitchStatements_StringManipulations;

public class C09_EqualsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "JaVa";
        String str6 = new String("Java");
        //Eger buyuk kucuk harfe takilmak istemiyorum diyorsaniz

        System.out.println(str1.equalsIgnoreCase(str3));// str1 = Java str3=java ==>true
        System.out.println(str4.equalsIgnoreCase(str5));// true
        System.out.println(str6.equalsIgnoreCase(str2));// true

    }
}

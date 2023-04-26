package day08_StringManipulations;

public class Deneme {
    public static void main(String[] args) {

        String str = "Jav568a c6ok a9ma co2536k gu74zel";

        System.out.println(str.replaceAll(" ", ""));

        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str = str.trim());

    }
}

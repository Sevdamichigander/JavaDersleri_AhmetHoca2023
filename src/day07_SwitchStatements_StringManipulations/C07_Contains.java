package day07_SwitchStatements_StringManipulations;

public class C07_Contains {

    public static void main(String[] args) {
        String str = "Java ogren offer al";

        //str da a harfi var mi?

        System.out.println(str.contains("a")); //true
        System.out.println(str.contains("x"));//false

        //sadece bir harf mi aratabiliyoruz

        System.out.println(str.contains("Offer")); //false cunku cumlemizde kucuk o ile baslayan offer var buyuk harf ile degil
        System.out.println(str.contains("offer")); //true


        //char aratabilir miyiz ==> hayir
        // System.out.println(str.contains('a')); // required charSequence,,,, sequence string in obur adi gibi (dizi)==char dizisi


    }
}

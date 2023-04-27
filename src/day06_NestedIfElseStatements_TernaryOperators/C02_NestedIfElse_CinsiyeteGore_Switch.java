package day06_NestedIfElseStatements_TernaryOperators;

import java.util.Scanner;

public class C02_NestedIfElse_CinsiyeteGore_Switch {

    public static void main(String[] args) {

            // Kullanıcıdan cinsiyetini ve yaşını alın
            Scanner scanner = new Scanner(System.in);
            System.out.print("Cinsiyetinizi girin (k/kadın veya e/erkek): ");
            String cinsiyet = scanner.next();
            System.out.print("Yaşınızı girin: ");
            int yas = scanner.nextInt();

            // Emeklilik koşullarına göre karar verin ve sonucu yazdırın
            switch (cinsiyet) {
                case "k":
                case "K":
                    if (yas >= 60) {
                        System.out.println("Emekli olabilirsiniz.");
                    }
                    else {
                        System.out.println("Emekli olmak için " + (60 - yas) + " yıl daha çalışmanız gerekiyor.");
                    }
                    break;
                case "e":
                case "E":
                    if (yas >= 65) {
                        System.out.println("Emekli olabilirsiniz.");
                    }
                    else {
                        System.out.println("Emekli olmak için " + (65 - yas) + " yıl daha çalışmanız gerekiyor.");
                    }
                    break;
                default:
                    System.out.println("Geçersiz cinsiyet bilgisi girdiniz.");
            }
        }

    }


package day05_IfElseStatements;
import java.util.Scanner;

public class C07_IfElseStatementSoru1_EskenarUcgen {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
                // ucgen eskenar ise “Eskenar ucgen” yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sirayla kenar uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();
        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        } else System.out.println("Girilen kenarlar bir eskenar ucgen olusturmaz ");
    }
}


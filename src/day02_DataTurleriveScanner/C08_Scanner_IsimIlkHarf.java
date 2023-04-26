package day02_DataTurleriveScanner;

import java.util.Scanner;

public class C08_Scanner_IsimIlkHarf {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sirasiyla isminizi,soyisminizi ve yasinizi giriniz");


        char isimIlkHarf = scanner.nextLine().toUpperCase().charAt(0); // next.char olmadigi icin once nextLine sonra charAt atiyoruz.
                                                                        //once string i alacak - John, sonra upper case yapacak JOHN,
                                                                    //sonra da indekse gore harfi getirecek. Index 0 ile baslar. J-0, O-1, H-2, N-3
                                                                    // Index te boslukta sayiliyor.
        String soyisim = scanner.nextLine();
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + isimIlkHarf + " "  + soyisim + ", " + " " + yas);


    }
}

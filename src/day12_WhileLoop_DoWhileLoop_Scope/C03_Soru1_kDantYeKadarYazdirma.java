package day12_WhileLoop_DoWhileLoop_Scope;

public class C03_Soru1_kDantYeKadarYazdirma {
    public static void main(String[] args) {

        //Soru 1- ‘k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        for (int i = 'k'; i <='t' ; i++) {
            System.out.print(i + " "); //107 108 109 110 111 112 113 114 115 116

                                         // i yi matematiksel islem olarak algiladi ve ASCII degerlerini yazdirdi.
                                        // Bir sonraki ornekte (char) ekleyerek harfleri yazdirabildik.

        }
        System.out.println(" ");


        // for loop ile yapalim

        for (int i = 'k'; i <='t' ; i++) {
            System.out.print((char)i + " ");//k l m n o p q r s t


        }
        System.out.println(" ");
        //while loop ile yapalim

        char harf = 'k';
        while (harf<='t'){
            System.out.print(harf + " ");//k l m n o p q r s t
            harf++;
        }
        System.out.println(" ");

        //do while loop ile yapalim

        harf = 'k';

        do {
            System.out.print(harf + " ");//k l m n o p q r s t
            harf++;
        }while (harf<='t');
    }
}

package day08_StringManipulations;

public class C14_Soru2 {
    public static void main(String[] args) {
        /*
        Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        input : "15,30 TL ", input : "11,40 TL"
        output : 36,70 TL
         */

        String input1 = "15.30 TL ";
        String input2 = "11.40 TL";

        //Oncelikle inputlari int a cevirmeliyiz.(parseInteger ile)
        // Ama bunun icin digit olmayan herseyi yok etmek lazim

        input1 = input1.replaceAll("\\D", "");
        input2 = input2.replaceAll("\\D", "");

        //digit olmayanlari yok ettik. Ama string olduklari icin toplayamayiz.
        //int'a parse etmeliyiz

        double inp1 = Double.parseDouble(input1);
        double inp2 = Double.parseDouble(input2);

        System.out.println((inp1 + inp2)/100 + " TL");

    }
}

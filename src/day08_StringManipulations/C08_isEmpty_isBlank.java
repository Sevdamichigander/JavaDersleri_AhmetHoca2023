package day08_StringManipulations;

public class C08_isEmpty_isBlank {
    public static void main(String[] args) {

       // email kismi bos birakilamaz kutucugunun kontrolu

        String str = "Java candir";
        System.out.println(str.isEmpty()); //false

        System.out.println(str.isBlank());//false (sadece space tuslarindan/bosluklardan mi olusuyor u test ediyor)

        str = "           ";

        System.out.println(str.isEmpty()); //false

        System.out.println(str.isBlank());//true

        str = "";

        System.out.println(str.isEmpty());//true
        System.out.println(str.isBlank());//true

        System.out.println(str.length()); // true

    }
}

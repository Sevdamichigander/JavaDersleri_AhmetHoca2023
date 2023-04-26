package day18_parametreliConstructor_constructorCall;

public class C06 {


        C06(){                                                                              //7
            System.out.println("Parametresiz constructor");                                 //8
        }                                                                                   //9 geldigin yere don
        C06(int sayi){                                                                      //5
            // C06(); ==> Java bu sekilde yazimi method call kabul eder.
            // Yani constructorlar const ismi yazilarak cagrilamaz.


            //bir constructor in icinden baska bir constrcutor i calistirmak istersek
            // this(istenen argumentler) yazariz
            this(); // == constructor call                                                   //6 ==> parametresi olmayan const a git

            System.out.println("int parametreli constructor");                                   //10
        }                                                                                   //11 ==> geldigin yere don
        C06(String str){                                                                       //3
            this(3);                                                                         //4 int parametre kabul eden bir const a git
            System.out.println("String parametreli cons");                                      //12
        }                                                                                       //13

    public static void main(String[] args) {                                                    //1
        C06 obj = new C06("Java");                                                          //2
    }



}

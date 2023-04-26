package day21_DateTime_Varargs;

public class C10_Varargs {
    public static void main(String[] args) {


        islemYap(2,4);//2*1=2
        islemYap(5);// x=5, y=[] =0
        islemYap(5,4,7,8); //5*3=15

    }

    public static void islemYap(int x, int... y){

        System.out.println(x*y.length);
    }
}

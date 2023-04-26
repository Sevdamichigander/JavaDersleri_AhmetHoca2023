package day18_parametreliConstructor_constructorCall;

public class C05_CarRunner {
    public static void main(String[] args) {

        C03_Car car1 = new C03_Car(10000, "Ford");
        System.out.println(car1);//C03_Car{marka='Ford', model='model belirtilmedi', yil=0, fiyat=10000}

        C03_Car car2 = new C03_Car("Toyota", "Corolla", 2010, 12000);

        System.out.println(car2);//C03_Car{marka='Toyota', model='Corolla', yil=2010, fiyat=12000}





    }
}

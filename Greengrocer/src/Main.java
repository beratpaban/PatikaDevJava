import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutF=2.14,elmaF=3.67,domatesF=1.11,muzF=0.95,patlicanF=5.00,toplamF;
        double armut,elma,domates,muz,patlican;
        Scanner input =new Scanner(System.in);
        System.out.println("Kaç kilo armut? : ");
        armut=input.nextDouble();
        System.out.println("Kaç kilo elma? : ");
        elma=input.nextDouble();
        System.out.println("Kaç kilo domates? : ");
        domates=input.nextDouble();
        System.out.println("Kaç kilo muz? : ");
        muz=input.nextDouble();
        System.out.println("Kaç kilo patlıcan? : ");
        patlican=input.nextDouble();
        toplamF=((armutF*armut)+(elmaF*elma)+(domatesF*domates)+(muzF*muz)+(patlicanF*patlican));
        System.out.println("Toplam Fiyat: "+toplamF+" TL");

    }
}
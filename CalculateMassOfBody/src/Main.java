import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo,index;

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz: ");
        boy=input.nextDouble();
        System.out.println("Lütfen Kilonuzu Kilogram Cinsinden Giriniz: ");
        kilo=input.nextDouble();

        index=kilo/(boy*boy);

        System.out.println("Vucüt Kitle Endeksiniz: "+index);

    }
}
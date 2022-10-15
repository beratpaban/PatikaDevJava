import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double pi=3.14,alan,cevre,dilimAlan,r,alpha;

        Scanner input=new Scanner(System.in);
        System.out.println("Yarı Çapı giriniz: ");
        r=input.nextDouble();
        System.out.println("Açıyı giriniz: ");
        alpha=input.nextDouble();
        cevre=pi*(r*r);
        alan=2*(pi*r);
        dilimAlan=(pi*(r*r)*alpha)/360;

        System.out.println("Alan: "+alan);
        System.out.println("Çevre: "+cevre);
        System.out.println("Dilim alanı: "+dilimAlan);

    }
}
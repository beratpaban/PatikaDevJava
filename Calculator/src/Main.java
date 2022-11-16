import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input=new Scanner(System.in);

        System.out.println("İlk Sayıyı giriniz : ");
        n1=input.nextInt();
        System.out.println("İkinci Sayıyı giriniz : ");
        n2=input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: "+(n1*n2));
                break;
            case 4:
                System.out.println("Bölme: "+(n1/n2));
                break;
            default:
                System.out.println("Hatalı İşlem seçtiniz!");
                break;


        }


    }
}
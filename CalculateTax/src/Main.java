import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar,kdvOran=0.18,kdvOran2=0.08;
        Scanner input=new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz: ");
        tutar=input.nextDouble();
        if(tutar>=0 && tutar<=1000){
            double kdvTutar=tutar*kdvOran;
            System.out.println("KDV Tutarı: "+kdvTutar);
            System.out.println("KDV'siz Fiyat: "+ tutar);
            double kdvliTutar=kdvTutar+tutar;
            System.out.println("KDV'li Fiyat: "+kdvliTutar);
        } else if (tutar>1000) {
            double kdvTutar=tutar*kdvOran2;
            System.out.println("KDV Tutarı: "+kdvTutar);
            System.out.println("KDV'siz Fiyat: "+ tutar);
            double kdvliTutar=kdvTutar+tutar;
            System.out.println("KDV'li Fiyat: "+kdvliTutar);
        }
        else {
            System.out.println("Geçersiz Tutar Girdiniz");
        }


    }
}
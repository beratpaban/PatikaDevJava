import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        int mat,fzk,kim,turk,tar,muzik;
        //derslerin ağırlıkları tanımlandı
        int agirlikliMat;
        int agirlikliKim;
        int agirlikliFzk;
        int agirlikliTurk;
        int agirlikliTar;
        int agirlikliMuzik;
        int matX=5;
        int fzkX=5;
        int kimX=5;
        int turkX=4;
        int tarX=3;
        int muzikX=2;
        //scaner tanımlandı
        Scanner inp=new Scanner(System.in);

        //Değer alma
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat=inp.nextInt();
        agirlikliMat=mat*matX;

        System.out.print("Fizik Notunuzu Giriniz: ");
        fzk=inp.nextInt();
        agirlikliFzk=fzk*fzkX;

        System.out.print("Kimya Notunuzu Giriniz: ");
        kim=inp.nextInt();
        agirlikliKim=kim*kimX;

        System.out.print("Turkce Notunuzu Giriniz: ");
        turk=inp.nextInt();
        agirlikliTurk=turk*turkX;

        System.out.print("Tarih Notunuzu Giriniz: ");
        tar=inp.nextInt();
        agirlikliTar=tar*tarX;

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik=inp.nextInt();
        agirlikliMuzik=muzik*muzikX;


        double sonuc=  (agirlikliMat+agirlikliFzk+agirlikliKim+agirlikliTurk+agirlikliTar+agirlikliMuzik)/24.0;

        System.out.println("Ortalamanız :"+sonuc);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;

        Scanner inp=new Scanner(System.in);

        System.out.println("Kullanıcı adı giriniz: ");
        userName=inp.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password=inp.nextLine();

        if(userName.equals("Patika.dev")&&password.equals("java123")){
            System.out.println("Giriş Başarılı!");
        }
        else {
            System.out.println("Bilgileriniz Yanlış! Lütfen tekrar deneyiniz.");
        }
    }
}
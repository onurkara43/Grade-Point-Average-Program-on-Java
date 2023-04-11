package Giris;
import java.util.Scanner;
public class Register {
    public static void main(String[] args) {
        String userName,password, u , p , k;
        int a ;
        u = "Patika" ;
        p = "Java123";

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals(u) && password.equals(p)) {
            System.out.println("Giriş Yaptınız !");
            System.exit(0);
        }
        else {
            System.out.println("Bilgileriniz Yanlış !" + " Şifrenizi Sıfırlamak İçin 1'e basınız.");
            a = input.nextInt();
            if (a==1) {
                System.out.print("Yeni Şifre:");
                input = new Scanner(System.in);
                k = input.nextLine();
                    if (k.equals(p)) {
                    System.out.println("Yeni Şifre Eskisiyle Aynı Olamaz!");
                    }
                    else {
                    System.out.println("Şifreniz Başarıyla Değiştirildi!");
                    }
            }
            else{}
        }
    }
}

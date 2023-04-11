package Giris;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1 , n2 , select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        n2 = input.nextInt();

        System.out.println("Sayıları Toplamak İçin 1'e\nSayıları Çıkarmak İçin 2'ye");
        System.out.print("Sayıları Çarpmak İçin 3'e\nBirinci Sayıyı İkinciye Bölmek için 4'e " +"Basınız!" );
        select = input.nextInt();

        switch (select) {

            case 1:
                System.out.print("Sonuç:" + (n1+n2 ));
                break;
            case 2:
                System.out.println("Sonuç:" + (n1-n2));
                break;
            case 3:
                System.out.println("Sonuç:" + (n1*n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir Sayı '0' ile bölünemez.Hatalı İşlem Yaptınız!");
                        System.out.print("İkinci Sayıyı Tekrar Giriniz:");
                        n2= input.nextInt();
                        System.out.println("Sonuç:"+ (n1/n2));
                        break;
                    default:
                        System.out.println("Sonuç:"+ (n1/n2));
                }
                break;
            default:
                System.out.print("istediğiniz İşlemi Yaptırmak İçin Lütfen '1-4' arasında sayı giriniz: ");



        }





    }




}

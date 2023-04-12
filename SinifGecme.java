package Giris;
import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik, turkce , kimya , muzik , sum=0 , counter=5;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if (mat<0 || mat>100) {
            System.out.println("0-100 aralığı dışında bir not girdiniz.Hesaplamaya dahil edilmeyecek.");
            counter = counter - 1;
        }else{
            sum = sum + mat ;
        }
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik<0 || fizik>100) {
            System.out.println("0-100 aralığı dışında bir not girdiniz.Hesaplamaya dahil edilmeyecek.");
            counter = counter - 1;
        }else{
            sum = sum + fizik ;
        }
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce<0 || turkce>100) {
            System.out.println("0-100 aralığı dışında bir not girdiniz.Hesaplamaya dahil edilmeyecek.");
            counter = counter - 1;
        }else{
            sum = sum + turkce ;
        }
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya<0 || kimya>100) {
            System.out.println("0-100 aralığı dışında bir not girdiniz.Hesaplamaya dahil edilmeyecek.");
            counter = counter - 1;
        }else{
            sum = sum + kimya ;
        }
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik<0 || muzik>100) {
            System.out.println("0-100 aralığı dışında bir not girdiniz.Hesaplamaya dahil edilmeyecek.");
            counter = counter - 1;
        }else{
            sum = sum + muzik ;
        }
        double average = sum / counter;

        if (average<=55){
            System.out.println("Sonuç Başarısız.");
        }else {
            System.out.println("Tebrikler!");
        }
        System.out.println("Ortalamanız:" + average);
    }
}

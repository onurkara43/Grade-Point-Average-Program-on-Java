package Giris;
import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class HipotenusHesap {
    public static void main(String[] args) {
        double a , b , c , u , alan , cevre;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgeninizin ilk kenar uzunluğunu giriniz:");
        a = input.nextDouble();
        System.out.print("Üçgeninizin ikinci kenar uzunluğunu giriniz:");
        b = input.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c)) ;
        System.out.println("Üçgeninizin Hipotenüs Uzunluğu:" + c + " br");
        System.out.println("Üçgeninizin çevre uzunluğu:" + cevre + " br");
        System.out.print("Üçgeninizin alanı:" + alan + " br^2" );
                    }
}

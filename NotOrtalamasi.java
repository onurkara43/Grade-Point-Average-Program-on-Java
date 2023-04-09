import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        // Değişkenleri Oluşturuyoruz.
        int mat, fizik, kimya, turkce, tarih, muzik;
        double notOrtalamasi;

        Scanner input = new Scanner(System.in);
        // Scanner Sınıfı Tanımlandı.

        //Not Değerlerini İste.
        System.out.print( "Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print( "Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print( "Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print( "Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print( "Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print( "Müzik Notunuz: ");
        muzik = input.nextInt();

        notOrtalamasi = ( fizik + muzik + tarih + mat + turkce + kimya ) /6.0 ;
        System.out.println("Not Ortamalamanız : " + notOrtalamasi);

        boolean sonuc = notOrtalamasi > 60 ;

        String str = sonuc ? "SINIFI GEÇTİNİZ :)" : "SINIFI GEÇEMEDİNİZ" ;
        System.out.println(str);




        }
    }
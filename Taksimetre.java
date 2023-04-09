package Giris;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km , ucret;
        Scanner input = new Scanner(System.in);
        System.out.println("Taksimetre Açılış Ücreti 10TL'dir.");
        System.out.print("Toplam gidilen kilometreyi giriniz:");
        km = input.nextDouble();
        ucret = 10 + km*2.20;
        boolean tutar = ucret <= 20;
        String odenecektutar = tutar ? "Toplam Ücret:20 Tl'dir." : "Toplam Ücret: " + ucret +"TL'dir.";
        System.out.print(odenecektutar);
    }
}

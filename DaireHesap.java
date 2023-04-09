package Giris;
import java.util.Scanner;

public class DaireHesap {
    public static void main(String[] args) {
        double alan, r,a ,cevre, pi=3.14 , dilimalan ;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenizin Yarı Çap Değerini Giriniz:");
        r = input.nextDouble();
        System.out.print("Merkez Açı Ölçüsü Giriniz:");
        a = input.nextDouble();
        alan = pi*r*r;
        cevre = 2*pi*r;
        dilimalan = (pi*r*r*a)/360;
        System.out.println("Dairenizin Alanı: " + alan);
        System.out.println("Dairenizin Çevresi: " + cevre);
        System.out.println("Dairenizin Açınıza Göre Dilim Alanı: " + dilimalan);

    }
}

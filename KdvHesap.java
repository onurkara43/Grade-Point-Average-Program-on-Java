package Giris;
import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        double kdvlitutar , ucret;
        System.out.print("KVS'ini Hesaplamak İstediğiniz Tutarı Giriniz:");
        Scanner input = new Scanner(System.in);
        ucret = input.nextDouble();
        kdvlitutar = ucret*1.18;

        System.out.print(" Kdv eklenmiş tutarınız: "+ kdvlitutar + "TL");


    }
}

package Giris;
import java.util.Scanner;
public class VucutKitleIndex {
    public static void main(String[] args) {
        double kilo , boy , index ;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();
        index = kilo / (boy*boy);
        System.out.println();
        System.out.print("Vücut Kitle İndeksiniz: " + index );


    }
}


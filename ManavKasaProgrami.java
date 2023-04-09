package Giris;
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double toplam , akg, ekg, dkg, mkg, pkg,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double aucret , eucret, ducret, mucret, pucret;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        akg = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        ekg = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        dkg = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        mkg = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        pkg = input.nextDouble();
        aucret= akg*armut;
        eucret= ekg*elma;
        ducret= dkg*domates;
        mucret= mkg*muz;
        pucret= pkg*patlican;
        toplam= aucret + eucret + ducret + mucret + pucret ;
        System.out.print("Toplam Tutar: " + toplam + "TL'dir.");





    }
}

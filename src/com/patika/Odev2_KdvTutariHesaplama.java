package com.patika;

import java.util.Scanner;

public class Odev2_KdvTutariHesaplama {

    public static void main(String[] args) {

        double kdv = 0.18, fiyat, kdvTutar, kdvliFiyat;
        Scanner input = new Scanner(System.in);

        System.out.print("Ödenecek Tutar : ");
        fiyat = input.nextDouble();

        kdvTutar = fiyat * kdv;
        kdvliFiyat = fiyat + kdvTutar;

        System.out.println("Ürün Fiyatı : " + fiyat);
        System.out.println("KDV'li Ürün Fiyatı : " + kdvliFiyat);
        System.out.println("KDV Tutarı : " + kdvTutar);





    }
}

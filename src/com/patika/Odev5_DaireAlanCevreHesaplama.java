package com.patika;

import java.util.Scanner;

public class Odev5_DaireAlanCevreHesaplama {

    public static void main(String[] args) {

        double pi = 3.14, yariCap, alan, cevre, merkezAci, dilimAlan;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap : ");
        yariCap = input.nextDouble();

        System.out.print("Merkez Açısı : ");
        merkezAci = input.nextDouble();

        alan = pi * (yariCap * yariCap);
        cevre = 2 * pi * yariCap;
        dilimAlan = (pi * (yariCap * yariCap) * merkezAci) / 360;

        System.out.println("Alan : " + alan);
        System.out.println("Çevre : " + cevre);
        System.out.println("Dilim Alanı : " + dilimAlan);


    }
}

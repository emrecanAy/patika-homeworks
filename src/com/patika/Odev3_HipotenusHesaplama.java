package com.patika;

import java.util.Scanner;

public class Odev3_HipotenusHesaplama {

    public static void main(String[] args) {

        double kenar1, kenar2, hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Kenar : ");
        kenar1 = input.nextDouble();

        System.out.print("2.Kenar : ");
        kenar2 = input.nextDouble();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        System.out.println("Hipotenüs : " + hipotenus);



    }
}

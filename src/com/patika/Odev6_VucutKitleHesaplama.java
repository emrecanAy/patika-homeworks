package com.patika;

import java.util.Scanner;

public class Odev6_VucutKitleHesaplama {

    public static void main(String[] args) {

        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Boy(m) : ");
        boy = input.nextDouble();

        System.out.print("Kilo(kg) : ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksi : " + indeks);


    }

}

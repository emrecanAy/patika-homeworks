package com.patika;

import java.util.Scanner;

public class Odev4_TaksimetreHesaplama {

    public static void main(String[] args) {

        double acilisUcreti = 10.0, herKm = 2.20, minTutar = 20, toplam, minToplam;
        int km;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe(km) : ");
        km = input.nextInt();

        toplam = (km * herKm);
        toplam += acilisUcreti;

        if(toplam < minTutar){
            minToplam = toplam;
            toplam = 20;
            System.out.println("Toplam = " + minToplam +", fakat minimum tutar 20 TL'dir!");
        }

        System.out.println("Tutar : " + toplam);


    }





}

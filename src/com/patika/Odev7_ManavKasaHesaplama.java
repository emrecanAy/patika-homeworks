package com.patika;

import java.util.Scanner;

public class Odev7_ManavKasaHesaplama {

    public static void main(String[] args) {

        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5.00, toplam;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        Scanner input = new Scanner(System.in);

        System.out.println("******* Fiyatlar *******");
        System.out.println("----------------------------");
        System.out.println("Armut(kg) = 2,14 TL \n"
                          +"Elma(kg) = 3,67 TL \n"
                          +"Domates(kg) = 1,11 TL \n"
                          +"Muz(kg) = 0,95 TL \n"
                          +"Patlıcan(kg) = 5.00 TL \n");
        System.out.println("----------------------------");

        System.out.print("Armut kaç kilo : ");
        armutKilo = input.nextInt();

        System.out.print("Elma kaç kilo : ");
        elmaKilo = input.nextInt();

        System.out.print("Domates kaç kilo : ");
        domatesKilo = input.nextInt();

        System.out.print("Muz kaç kilo : ");
        muzKilo = input.nextInt();

        System.out.print("Patlıcan kaç kilo : ");
        patlicanKilo = input.nextInt();

        toplam = (armutFiyat * armutKilo) +
                 (elmaFiyat * elmaKilo) +
                 (domatesFiyat * domatesKilo) +
                 (muzFiyat * muzKilo) +
                 (patlicanFiyat * patlicanKilo);

        System.out.println("Toplam Tutar : " + toplam);





    }

}

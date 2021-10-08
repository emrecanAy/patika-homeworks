package com.patika;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Odev8_HesapMakinesi1 {

    public static void main(String[] args) {

        int sayi1, sayi2, sonuc;
        char islem;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayı : ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayı : ");
        sayi2 = input.nextInt();

        System.out.println("****** İşlemler ******");
        System.out.println("1-Toplama\n"
                          +"2-Çıkarma\n"
                          +"3-Çarpma\n"
                          +"4-Bölme\n"
                          +"q-Çıkış");
        System.out.println("----------------------------");

        System.out.print("Bir işlem seçin : ");
        islem = input.next().charAt(0);
        input.nextLine();

        switch (islem){
            case '1':
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç = " + sonuc);
                break;

            case '2':
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç = " + sonuc);
                break;

            case '3':
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç = " + sonuc);
                break;

            case '4':
                if(sayi2 != 0){
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç = " + sonuc);
                }
                else{
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;

            case 'q':
                System.out.println("Çıkış yapılıyor...");
                break;

            default:
                System.out.println("Hatalı seçim!");
                break;



        }




    }

}

package com.patika;

import java.util.Scanner;

public class Odev10_SinifGecmeDurumu {

    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;
        int dersSayisi = 5;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        if(!(mat > 0 && mat < 100)){
            mat = 0;
            dersSayisi--;
        }
        if(!(fizik > 0 && fizik < 100)){
            fizik = 0;
            dersSayisi--;
        }
        if(!(kimya > 0 && kimya < 100)){
            kimya = 0;
            dersSayisi--;
        }
        if(!(turkce > 0 && turkce < 100)){
            turkce = 0;
            dersSayisi--;
        }
        if(!(muzik > 0 && muzik < 100)){
            muzik = 0;
            dersSayisi--;
        }

        int toplam = (mat + fizik + kimya + turkce + muzik);

        double ortalama = (toplam / dersSayisi);

        if(ortalama <= 55){
            System.out.println("Sınıfta Kaldınız! \n Ortalama : " + ortalama);
        } else{
            System.out.println("Sınıfı Geçtiniz! \n Ortalama : " + ortalama);
        }


    }

}

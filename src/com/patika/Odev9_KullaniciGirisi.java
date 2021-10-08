package com.patika;

import java.util.Scanner;

public class Odev9_KullaniciGirisi {

    public static void main(String[] args) {

        String userName, password, istek;

        Scanner input = new Scanner(System.in);

        System.out.print("Username : " );
        userName = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("123")){
            System.out.println("Giriş başarılı!");
        }
        else{
            System.out.println("Hatalı kullanıcı adı veya şifre!");
            System.out.println("-----------------------------------");
            System.out.print("Şifrenizi sıfırlamak ister misiniz?(e, h) : ");
            istek = input.nextLine();

            switch (istek){
                case "e":
                    String yeniSifre;
                    System.out.print("Yeni Şifre : ");
                    yeniSifre=input.nextLine();
                    if(yeniSifre.equals(password)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                    }
                    else{
                        System.out.println("Şifre oluşturuldu!");
                    }
                    break;

                case "h":
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Hatalı seçim!");
                    break;
            }

        }

    }

}

package week1;

import java.util.Scanner;

public class _02_ManavKasaProgramı {
    public static void main(String[] args) {
        /*
        Soru :
        Java ile kullanıcıların manavdan almış oldukları ürünlerin
        kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

       Meyveler ve KG Fiyatları
       Armut : 2,14 TL
       Elma : 3,67 TL
       Domates : 1,11 TL
       Muz: 0,95 TL
       Patlıcan : 5,00 TL

         */
        double armutBirimFiyat = 2.14 ;
        double elmaBirimFiyat = 3.67 ;
        double domatesBirimFiyat = 1.11 ;
        double muzBirimFiyat = 0.95 ;
        double patlicanBirimFiyat = 5;

        System.out.println("----------------Deniz Manava Hoş Geldiniz--------------");
        Scanner scan =new Scanner(System.in);
        System.out.println("Kaç kg Armut vereyim size ?  : ");
        double armutKg =scan.nextDouble();
        System.out.println("Kaç kg Elma vereyim size ? : ");
        double elmaKg = scan.nextDouble();
        System.out.println("Kaç kg Domates vereyim size ? : ");
        double domatesKg = scan.nextDouble();
        System.out.println("Kaç kg Muz vereyim size ? : ");
        double muzKg =scan.nextDouble();
        System.out.println("Kaç kg Patlıcan vereyim size ? : ");
        double patlicanKg = scan.nextDouble();

        double totalTutar = (armutKg*armutBirimFiyat) + (elmaKg*elmaBirimFiyat) + (domatesKg*domatesBirimFiyat)
                + (muzKg*muzBirimFiyat) + (patlicanKg * patlicanBirimFiyat) ;

        System.out.println("Toplam Tutarınız :" + totalTutar);
        System.out.println("------------------Güle Güle Yine Bekleriz---------------");


    }
}

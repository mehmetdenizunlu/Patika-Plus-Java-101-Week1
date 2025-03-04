package week1;

import java.util.Scanner;

public class _06_AritmetikIslemlerVeIslemOnceligi_Soru {
    public static void main(String[] args) {
        /*
        Soru: Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre işleyen bir program yazın.
        İşlem sırası şöyle olsun: a+b*c-b.
         İşlem tamamladıktan sonra sonucu ekrana yazdırın.
         */

        Scanner scan =new Scanner(System.in);
        // kullanıcan 3 sayı alınız
          int a= getUserInput(scan);
          int b= getUserInput(scan);
          int c= getUserInput(scan);
         int total= calculate(a,b,c);
        System.out.println("işlem sonucu = " + total );



    }
   static int getUserInput(Scanner scan) {
        System.out.println("Sayı Giriniz");
        return scan.nextInt();
    }

    static int calculate (int a , int b, int c) {
        return ((a+b)*c)-b;
    }



}

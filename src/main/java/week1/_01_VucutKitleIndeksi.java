package week1;

import java.util.Scanner;

public class _01_VucutKitleIndeksi {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Formül :

        Kilo (kg) / Boy(m) * Boy(m)
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu giriniz :");
        double kilo = scan.nextDouble();
        System.out.println("Lütfen Boyunuzu (metre cinsinden) giriniz");
        double boy = scan.nextDouble();

        double kitleIndeks= kilo/(boy*boy) ;

        System.out.println("Vucut Kitle İndeksiniz :" + kitleIndeks);


    }
}

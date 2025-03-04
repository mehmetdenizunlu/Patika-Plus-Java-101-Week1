package week1;

import java.util.Scanner;

public class _04_ChineseZodiacCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // kullanıcıdan veri al
        int birthYear = getUserInput(scan) ;

        int zodiacSign = calculateChineseZodiac(birthYear);
        // System.out.println("kalan:" + zodiacSign); // kalan değeri göstericek
        hangiBurc(zodiacSign);



    }
    // Kullanıcıdan veri alan method
      static int getUserInput(Scanner scan ){
        System.out.println("Doğum Yılınızı Giriniz :");
        return scan.nextInt();
    }
    // Doğum tarihine göre kalan hesabını yapan method
     static int calculateChineseZodiac(int birthYear ) {
        return birthYear%12;
    }

     static void hangiBurc (int zodiacSign ) {
        switch (zodiacSign) {
            case 0 : System.out.println("Çin Zodyağı Burcunuz : At");break;
            case 1 : System.out.println("Çin Zodyağı Burcunuz : Horoz");break;
            case 2 : System.out.println("Çin Zodyağı Burcunuz : Köpek");break;
            case 3 : System.out.println("Çin Zodyağı Burcunuz : Domuz");break;
            case 4 : System.out.println("Çin Zodyağı Burcunuz : Fare");break;
            case 5 : System.out.println("Çin Zodyağı Burcunuz : Öküz");break;
            case 6 : System.out.println("Çin Zodyağı Burcunuz : Kaplan");break;
            case 7 : System.out.println("Çin Zodyağı Burcunuz : Tavşan");break;
            case 8 : System.out.println("Çin Zodyağı Burcunuz : Ejderha");break;
            case 9 : System.out.println("Çin Zodyağı Burcunuz : Yılan");break;
            case 10 : System.out.println("Çin Zodyağı Burcunuz : At");break;
            case 11 : System.out.println("Çin Zodyağı Burcunuz : Koyun");break;


        }
    }


}

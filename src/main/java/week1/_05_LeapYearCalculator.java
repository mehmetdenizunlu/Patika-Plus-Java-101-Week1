package week1;

import java.util.Scanner;

public class _05_LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int year = getUserInput(scan);
        checkLeapYear(year);

        }


         static int getUserInput(Scanner scan) {
            System.out.println("Yılı Giriniz");
            return scan.nextInt();
        }

         static void checkLeapYear(int year) {
            if ((year%4==0 && year %100 !=0) || (year%400==0)) {
                System.out.println(year + " yılı artık yıldır.");
            }else {
                System.out.println(year + "yılı artık yıl değildir.");
            }
        }
}

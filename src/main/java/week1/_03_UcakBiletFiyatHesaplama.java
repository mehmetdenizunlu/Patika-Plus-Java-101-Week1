package week1;

import java.util.Scanner;

public class _03_UcakBiletFiyatHesaplama {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
         Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
         Mesafe başına ücret 0,10 TL / km olarak alın.
         İlk olarak uçuşun toplam fiyatını hesaplayın
         ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

              ----------------------ŞARTLAR -----------------------

         * Kullanıcıdan alınan değerler geçerli (distance ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
         Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         --------------------------------------------------------------------------------------------------------------
         */

        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan girişleri al
        double distance = getDistance(scan);
        int age = getYear(scan);
        int tripType = getTripType(scan);

        // Hatalı giriş kontrolü
        if (!inputValidation(distance, age, tripType)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        // Normal bilet ücreti
        double normalFare = calculateNormalFare(distance);

        // Yaş indirimi uygula
        double discountedFareByAge = calculateAgeDiscount(normalFare, age);

        // Gidiş-Dönüş indirimi uygula
        double totalFare = calculateRoundTripDiscount(discountedFareByAge, tripType);

        // Sonucu yazdır
        printTicket(distance, normalFare, totalFare);
    }

     static double getDistance(Scanner scan) {
        System.out.print("Mesafeyi Km cinsinden giriniz: ");
        return scan.nextDouble();
    }

     static int getYear(Scanner scan) {
        System.out.print("Yaşınızı giriniz: ");
        return scan.nextInt();
    }

     static int getTripType(Scanner scan) {
        System.out.print("Yolculuk Tipinizi Seçiniz (Tek Yön -> 1 , Gidiş-Dönüş -> 2): ");
        return scan.nextInt();
    }

     static boolean inputValidation(double distance, int age, int tripType) {
        return distance > 0 && age >= 0 && (tripType == 1 || tripType == 2);
    }

     static double calculateNormalFare(double distance) {
        double farePerKilometer = 0.1;
        return distance * farePerKilometer;
    }

     static double calculateAgeDiscount(double normalFare, int age) {
        if (age < 12) {
            return normalFare * 0.5;  // %50 indirim
        } else if (age < 24) {
            return normalFare * 0.9;  // %10 indirim
        } else if (age > 65) {
            return normalFare * 0.7;  // %30 indirim
        }
        return normalFare;
    }

     static double calculateRoundTripDiscount(double fare, int tripType) {
        if (tripType == 2) {
            return fare*0.8;
        }else {
            return  fare;
        }
    }

     static void printTicket(double mesafe, double normalTutar, double toplamTutar) {
        System.out.println("-------------------------------------------------");
        System.out.println("           ---> BİLET SONUÇLARINIZ <---          ");
        System.out.println("Gidilecek mesafe: " + mesafe + " KM");
        System.out.println("Normal Uçak Fiyatı: " + normalTutar + "₺");
        System.out.println("İndirimli Uçuş Fiyatınız: " + toplamTutar + "₺");
        System.out.println("-------------------------------------------------");
    }


}


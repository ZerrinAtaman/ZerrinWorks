package day08_practice_tasks;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("PIN numaranızı girin: ");
        int enteredPin = scanner.nextInt();

        // Doğru PIN numarası ve başlangıç bakiyesi
        int pinNumber = 1234;
        double accountBalance = 1000.0;

        // Yanlış PIN deneme hakkı
        int maxAttempts = 3;
        int attempts = 0;

        // PIN giriş denemeleri
        while (attempts < maxAttempts) {

            attempts++;

            if (enteredPin == pinNumber) {
                // PIN doğru ise işlem seçenekleri sunulur
                System.out.println("Hoş geldiniz!");
                System.out.println("1. Bakiye Sorgula");
                System.out.println("2. Para Yatırma");
                System.out.println("3. Para Çekme");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Bakiyeniz: $" + accountBalance);
                        break;
                    case 2:
                        System.out.print("Yatırmak istediğiniz miktarı girin: $");
                        double depositAmount = scanner.nextDouble();

                        if (depositAmount <= 0) {
                            System.out.println("Geçersiz miktar. Lütfen pozitif bir miktar girin.");
                        } else {
                            accountBalance += depositAmount;
                            System.out.println("Yeni bakiyeniz: $" + accountBalance);
                        }
                        break;
                    case 3:
                        System.out.print("Çekmek istediğiniz miktarı girin: $");
                        double withdrawAmount = scanner.nextDouble();

                        if (withdrawAmount <= 0) {
                            System.out.println("Geçersiz miktar. Lütfen pozitif bir miktar girin.");
                        } else if (withdrawAmount > accountBalance) {
                            System.out.println("Yetersiz bakiye. Çekme işlemi başarısız.");
                        } else {
                            accountBalance -= withdrawAmount;
                            System.out.println("Yeni bakiyeniz: $" + accountBalance);
                        }
                        break;
                    default:
                        System.out.println("Geçersiz seçenek. ATM'den çıkılıyor. İyi günler!");
                        break;
                }
                break;
            } else {
                if (attempts < maxAttempts) {
                    System.out.println("Hatalı PIN numarası. Kalan deneme hakkınız: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Kartınız bloke oldu. Lütfen bankanızla iletişime geçin.");
                }
            }
        }

        scanner.close();
    }
}
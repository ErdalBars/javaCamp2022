import java.util.Scanner;

public class friendsNumber {
    public static void main(String[] args) {

        System.out.println("Lütfen Birinci Sayıyı Giriniz");

        Scanner number1 = new Scanner(System.in);

        int inNumber1 = number1.nextInt();

        System.out.println("Lütfen İkinci Sayıyı Giriniz");

        Scanner number2 = new Scanner(System.in);

        int inNumber2 = number2.nextInt();

        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < inNumber1; i++) {
            if (inNumber1 % i == 0) {
                total1 = total1 + i;

            }
        }

        for (int j = 1; j < inNumber2; j++) {
            if (inNumber2 % j == 0) {
                total2 = total2 + j;

            }
        }

        if (total1 == inNumber2 && total2 == inNumber1) {
            System.out.println("Girmiş olduğun " + inNumber1 + " Sayısı ile " + inNumber2 + " Sayısı Arkadaş Sayılardır.");
        } else {

            System.out.println("Maalesef Girmiş olduğun " + inNumber1 + " Sayısı ile " + inNumber2 + " Sayısı Arkadaş Sayı Değil!.");
        }
    }
}

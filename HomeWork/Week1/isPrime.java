package homeWorkWeek1;

import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isPrime = false;

        System.out.println("Lütfen Bir Sayı Girin");

        int number = scan.nextInt();

        for (int i = 2; i < number; i++) {
            if(number%2==0) {
                isPrime=false;
                break;

            }else {
                isPrime=true;
            }
        }
        if (isPrime) {
            System.out.println("Girdiğiniz " + number+ " Sayısı Asaldır");

        } else {
            System.out.println("Girdiğiniz "+number+" Sayısı Asal Değildir");

        }
    }
}
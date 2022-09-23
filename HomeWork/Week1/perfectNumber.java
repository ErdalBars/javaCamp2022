import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        System.out.println("Lütfen herhangi bir sayı girin");

        Scanner number = new Scanner(System.in);

        int inNumber = number.nextInt();

        int total = 0;

        for (int i = 1; i < inNumber; i++) {

            if (inNumber % i == 0) {

                total = total + i;
            }

        }
        if (inNumber == total) {
            System.out.println("Tebrikler " + inNumber +" Sayısı Mükemmel Bir Sayı");
        }else {
            System.out.println("Üzgünüm " + inNumber +" Sayısı Mükemmel Bir Sayı Değil!");
        }


    }
}

import java.util.Scanner;

public class findNumber {
    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Lütfen Bir Sayı Giriniz");
        Scanner Number = new Scanner(System.in);

        int inNumber = Number.nextInt();
        boolean control = false;

        for (int num : numbers) {

            if (inNumber == num) {

                control = true;
                break;
            }
        }
        if (control) {
            System.out.println("Tebrikler Doğru Tahmin!");

        } else {
            System.out.println("Maalesef Yanlış Tahmin Tekrar Deneyim!");
        }
    }
}


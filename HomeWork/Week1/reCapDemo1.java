package homeWorkWeek1;

public class reCapDemo1 {
    public static void main(String[] args) {
        int sayi1 = 55;
        int sayi2 = 35;
        int sayi3 = 65;

        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        } else if (enBuyuk < sayi3) {
            enBuyuk = sayi3;

        }
        System.out.println("En Büyük Sayı" + " " + enBuyuk);
    }
}
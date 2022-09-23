public class Main {
    public static void main(String[] args) {
        findNumber();
        findNumber();
        sendMessage("Sayı Var");

    }

    public static void findNumber() {
        int[] numbers = new int[]{0, 1, 2, 5, 6, 7, 9};
        int findNumber = 4;
        boolean isFind = false;
        for (int number : numbers) {
            if (number == findNumber) {
                isFind = true;
                break;

            }
        }
        if (isFind) {
            System.out.println("Sayı " + findNumber + " Mevcuttur ");
        } else {
            System.out.println("Sayı " + findNumber + " Mevcut Değildir ");
        }
    }
    public static void sendMessage(String mesaj){
        System.out.println(mesaj);

    }
}

public class Main {
    public static void main(String[] args) {
        int number = topla(55, 77);
        System.out.println(number);
        int numbers = topla2(1, 3, 5, 7, 8, 6, 97, 231);
        System.out.println(numbers);

    }

    public static void add() {
        System.out.println("Eklendi");
    }

    public static void delete() {
        System.out.println("Silindi");
    }

    public static void update() {
        System.out.println("Güncellendi");
    }

    public static int topla(int number1, int number2) {
        return number1 + number2;

    }

    public static int topla2(int... numbers) {
        {
            int toplam = 0;
            for (int number : numbers) {
                toplam += number;
            }
            return toplam;
        }


    }


}

import java.util.Scanner;

public class sesliHarfler {
    public static void main(String[] args) {

        // kalın sesli harfler  a, ı, o, u
        // ince sesli harfler e, i, ö, ü

        char[] kalinSesli = {'a', 'ı', 'o', 'u', 'A', 'I', 'O', 'U'};
        char[] inceSesli = {'e', 'i', 'ö', 'ü', 'E', 'İ', 'Ö', 'Ü'};
        System.out.println("Lütfen Sesli Bir Harf Girin");
        Scanner inChar = new Scanner(System.in);
        char gelenHarf = inChar.next().charAt(0);

        for (int i = 0; i < 8; i++) {

            if (kalinSesli[i] == gelenHarf) {
                System.out.println("Girdiğiniz Harf Kalın Sesli Bir Harftir");
            }
            if (inceSesli[i] == gelenHarf) {
                System.out.println("Girdiğiniz Harf İnce Sesli Bir Harftir");
            }
        }


    }
}

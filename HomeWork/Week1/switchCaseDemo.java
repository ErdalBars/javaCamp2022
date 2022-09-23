package homeWorkWeek1;

public class switchCaseDemo {
    public static void main(String[] args) {
        char grade = 'F';


        switch (grade) {
            case 'A':
                System.out.println("Tebrikler En İyi Notla Geçtiniz");
                break;
            case 'B':
                System.out.println("Tebrikler Geçtiniz");
                break;
            case 'C':
                System.out.println("Tebrilkler Ortalama Bir Notla Geçitiniz");
                break;
            case 'D':
                System.out.println("Kıl Payı Geçtin Daha İyi Çalış");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Bir Not Girdiniz");


        }
    }
}
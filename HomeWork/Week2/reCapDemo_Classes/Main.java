public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonucTopla = dortIslem.Topla(8, 2, 2, 5);
        int sonucCikar = dortIslem.cikar(-25, 5);
        int sonucCarp = dortIslem.carp(5, 10,2);
        int sonucBol = dortIslem.bol( 8,2);

        System.out.println("Toplam Sonuç "+sonucTopla);
        System.out.println("Çıkarma Sonuş "+sonucCikar);
        System.out.println("Çarpma Sonuç  "+sonucCarp);
        System.out.println("Bölme Sonuç "+sonucBol);


    }
}
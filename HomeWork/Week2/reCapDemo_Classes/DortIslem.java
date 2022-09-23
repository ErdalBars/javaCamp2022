public class DortIslem {
    public int Topla(int... numbers) {
        int toplam = 0;
        for (int number : numbers) {
            toplam += number;
        }
        return toplam;
    }

    public int cikar(int... numbers) {
        int cikart = 0;
        for (int number : numbers) {
            cikart -= number;
        }
        return cikart;
    }

    public int carp(int... numbers) {
        int carpim = 1;
        for (int number : numbers) {
            carpim *= number;
        }
        return carpim;
    }

    public int bol(int... numbers) {
        int bolme =0;

        for (int number : numbers) {

            bolme /= number;
        }
        return bolme;

    }
}
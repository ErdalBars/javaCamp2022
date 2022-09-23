package homeWorkWeek1;

public class stringDemo {

    public static void main(String[] args) {

        String mesaj = "Bugün Hava Çok Güzel.";

        System.out.println(mesaj);

        System.out.println("Eleman Sayısı" + " " + mesaj.length());

        System.out.println("5.Eleman" + " " + mesaj.charAt(4));

        System.out.println(mesaj.concat(" Yaşasın!"));

        System.out.println(mesaj.startsWith("B"));

        System.out.println(mesaj.endsWith("."));

        char[] karakterler = new char[5];

        mesaj.getChars(0, 5, karakterler, 0);

        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a'));

        System.out.println(mesaj.lastIndexOf('a'));

        System.out.println(mesaj.replace( ' ','-'));

        String yeniMesaj=mesaj.replace(' ','-');

        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(6));

        System.out.println(mesaj.substring(2,5));

        //split operatörü kelimeleri alt alta yazar
        for (String kelime:mesaj.split(" ")) {
            System.out.println(kelime);
        }
        //toLowerCase bütün harfleri küçük yapar.
        System.out.println(mesaj.toLowerCase());
        //toUpperCase bütün harfleri BÜYÜK harf yapar.
        System.out.println(mesaj.toUpperCase());
        //trim metnin başındaki ve sonundaki boşlkları siler.
        System.out.println(mesaj.trim());





    }

}

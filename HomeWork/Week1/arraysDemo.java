package homeWorkWeek1;

public class arraysDemo {
    public static void main(String[] args) {
        String[] ogrenciler = {"ogrenci1", "ogrenci2", "ogrenci3"};
        for (int i = 0; i < ogrenciler.length; i++) {

            System.out.println(ogrenciler[i]);
        }
        System.out.println("birinci loop sonu");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Cihad";
        String ogrenci2 = "Mustafa";
        String ogrenci3 = "Kerem";
        String ogrenci4 = "Barış";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Sesil";
        ogrenciler[1] = "Zeynep";
        ogrenciler[2] = "Eren";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        //Genelde aşağıdaki gibi kullanılır, daha iyi bir yazımdır - foreach ile benzer
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
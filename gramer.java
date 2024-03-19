import java.util.Scanner;

public class gramer {
    
    static String[] ozne = {"Ben", "Sen", "Hasan", "Nursah", "Elif", "Abdulrezzak", "Sehribanu", "Zeynelabidin", "Naki"};
    static String[] nesne = {"Bahce", "Okul", "Park", "Sinif", "Yarin", "Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma",
            "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Gunes", "Beydagi"};
    static String[] yuklem = {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yurumek", "Gormek"};
   
    static boolean cumleKontrol(String cumle) {
        String[] kelimeler = cumle.split("\\s+");
        
        if (kelimeler.length != 3)
            return false;

        String ozneKelime = kelimeler[0];
        String nesneKelime = kelimeler[1];
        String yuklemKelime = kelimeler[2];

        return kelimeUygun(ozneKelime, ozne) && kelimeUygun(nesneKelime, nesne) && kelimeUygun(yuklemKelime, yuklem);
    }

    static boolean kelimeUygun(String kelime, String[] kume) {
        for (String eleman : kume) {
            if (eleman.equals(kelime))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir cumle girin: ");
        String cumle = scanner.nextLine();

        if (cumleKontrol(cumle)) {
            System.out.println("EVET Girilen cumle gramer kurallarina uygundur.");
        } else {
            System.out.println("HAYIR Girilen cumle gramer kurallarina uymamaktadir.");
        }
    }
}


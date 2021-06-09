import sun.plugin.cache.OldCacheEntry;

import java.sql.SQLOutput;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "Muhammad";
        String namaTengah = "Adhietya";
        String namaBelakang = "Rafflie";

        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.8889;
        char nilaiAbjad = 'A';
        boolean Tampan = true;

        System.out.println(namaDepan+namaTengah+namaBelakang);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);
        System.out.println(uniskaChar);

        String namaLengkap = namaDepan + " " + namaTengah + " " + namaBelakang;

        System.out.println(namaLengkap);
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("fli"));
        System.out.println(namaLengkap.substring(8));
        System.out.println(namaLengkap.substring(8,13));
        System.out.println(namaLengkap.replace( "Adh", "Radh"));
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.charAt(9));

        String[] namaArray = namaLengkap.split(" ");

        for (String nama: namaArray)
            System.out.println(nama);

    }
}

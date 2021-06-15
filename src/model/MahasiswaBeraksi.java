package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args){


       String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(polaTanggal);


        //instance - pembuatan object
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19631003";
        mahasiswa.nama = "Awal";
        try {
            mahasiswa.tanggalLahir = sdf.parse("02-01-2000");
            mahasiswa.tampilkanAtribut();
        } catch (ParseException e) {
            System.err.println("Format tanggal tidak sesuai");
        }




    }
}

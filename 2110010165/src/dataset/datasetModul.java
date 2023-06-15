/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;
import jualbelibaju.modul;

public class datasetModul {
    public static void main(String[] args) {
        // Membuat dataset
        List<modul> modulList = new ArrayList<>();
        modulList.add(new modul(1, "Beranda", "beranda", true, "beranda.jpg", "Aktif", true, 1));
        // Tambahkan data modul lainnya sesuai kebutuhan
        // Menggunakan dataset
        for (modul modul : modulList) {
            System.out.println("ID Modul: " + modul.getIdModul());
            System.out.println("Nama Modul: " + modul.getNamaModul());
            System.out.println("Link: " + modul.getLink());
            System.out.println("Static Konten: " + modul.isStaticKonten());
            System.out.println("Gambar: " + modul.getGambar());
            System.out.println("Status: " + modul.getStatus());
            System.out.println("Aktif: " + modul.isAktif());
            System.out.println("Urutan: " + modul.getUrutan());
            System.out.println();
        }
    }
}


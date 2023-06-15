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
import jualbelibaju.kota;

public class datasetKota {
    public static void main(String[] args) {
        // Membuat dataset
        List<kota> kotaList = new ArrayList<>();
        kotaList.add(new kota(1, "Jakarta", 15000.0));
        kotaList.add(new kota(2, "Surabaya", 20000.0));
        // Tambahkan data kota lainnya sesuai kebutuhan

        // Menggunakan dataset
        for (kota kota : kotaList) {
            System.out.println("ID Kota: " + kota.getIdKota());
            System.out.println("Nama Kota: " + kota.getNamaKota());
            System.out.println("Ongkos Kirim: " + kota.getOngkosKirim());
            System.out.println();
        }
    }
}


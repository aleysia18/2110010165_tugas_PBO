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
import jualbelibaju.kategori;

public class datasetKategori {
    public static void main(String[] args) {
        // Membuat dataset
        List<kategori> kategoriList = new ArrayList<>();
        kategoriList.add(new kategori(1, "Pakaian Wanita", "pakaian-wanita"));
        kategoriList.add(new kategori(2, "Pakaian Pria", "pakaian-pria"));
        // Tambahkan data kategori lainnya sesuai kebutuhan

        // Menggunakan dataset
        for (kategori kategori : kategoriList) {
            System.out.println("ID Kategori: " + kategori.getIdKategori());
            System.out.println("Nama Kategori: " + kategori.getNamaKategori());
            System.out.println("Kategori SEO: " + kategori.getKategoriSeo());
            System.out.println();
        }
    }
}


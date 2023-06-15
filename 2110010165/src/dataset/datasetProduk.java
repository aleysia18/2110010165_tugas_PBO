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
import jualbelibaju.produk;

public class datasetProduk {
    public static void main(String[] args) {
        // Membuat dataset
        List<produk> produkList = new ArrayList<>();
        produkList.add(new produk(1, 1, "Baju Polos", "baju-polos", "Baju polos warna hitam", 100000, 10, "L", 0.5,
                "2023-05-19", "baju_polos.jpg", 0, "Tersedia"));
        // Tambahkan data produk lainnya sesuai kebutuhan

        // Menggunakan dataset
        for (produk produk : produkList) {
            System.out.println("ID Produk: " + produk.getIdProduk());
            System.out.println("ID Kategori: " + produk.getIdKategori());
            System.out.println("Nama Produk: " + produk.getNamaProduk());
            System.out.println("Produk SEO: " + produk.getProdukSeo());
            System.out.println("Deskripsi: " + produk.getDeskripsi());
            System.out.println("Harga: " + produk.getHarga());
            System.out.println("Stok: " + produk.getStok());
            System.out.println("Ukuran: " + produk.getUkuran());
            System.out.println("Berat: " + produk.getBerat());
            System.out.println("Tanggal Masuk: " + produk.getTglMasuk());
            System.out.println("Gambar: " + produk.getGambar());
            System.out.println("Diskon: " + produk.getDiskon());
            System.out.println("Status: " + produk.getStatus());
            System.out.println();
        }
    }
}


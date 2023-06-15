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
import jualbelibaju.konsumen;

public class datasetKonsumen {
    public static void main(String[] args) {
        // Membuat dataset
        List<konsumen> konsumenList = new ArrayList<>();
        konsumenList.add(new konsumen(1, "John Doe", "password123", "john@example.com", "Jl. Contoh No. 123",
                "Baju T-Shirt", "12345", "Jakarta", "081234567890", "2023-05-19", 2, 150000.0));
        konsumenList.add(new konsumen(2, "Jane Smith", "password456", "jane@example.com", "Jl. Contoh No. 456",
                "Celana Jeans", "67890", "Surabaya", "082345678901", "2023-05-20", 3, 250000.0));
        // Tambahkan data konsumen lainnya sesuai kebutuhan

        // Menggunakan dataset
        for (konsumen konsumen : konsumenList) {
            System.out.println("ID Konsumen: " + konsumen.getIdKonsumen());
            System.out.println("Nama User: " + konsumen.getNamaUser());
            System.out.println("Password: " + konsumen.getPassword());
            System.out.println("Email User: " + konsumen.getEmailUser());
            System.out.println("Alamat User: " + konsumen.getAlamatUser());
            System.out.println("Nama Produk: " + konsumen.getNamaProduk());
            System.out.println("Kodepos User: " + konsumen.getKodeposUser());
            System.out.println("Kota User: " + konsumen.getKotaUser());
            System.out.println("Telpon: " + konsumen.getTelpon());
            System.out.println("Tanggal: " + konsumen.getTanggal());
            System.out.println("Jumlah: " + konsumen.getJumlah());
            System.out.println("Total: " + konsumen.getTotal());
            System.out.println();
        }
    }
}


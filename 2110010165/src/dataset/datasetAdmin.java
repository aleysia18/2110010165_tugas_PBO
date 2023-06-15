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
import jualbelibaju.Admin;

public class datasetAdmin {
    public static void main(String[] args) {
        // Membuat dataset
        List<Admin> adminList = new ArrayList<>();
        adminList.add(new Admin("admin1", "admin123"));
        // Tambahkan data admin lainnya sesuai kebutuhan

        // Menggunakan dataset
        String enteredUsername = "admin1";
        String enteredPassword = "admin123";

        // Proses otentikasi
        boolean isAuthenticated = false;
        for (Admin admin : adminList) {
            if (admin.authenticate(enteredUsername, enteredPassword)) {
                isAuthenticated = true;
                break;
            }
        }

        if (isAuthenticated) {
            System.out.println("Otentikasi berhasil. Selamat datang, admin!");
            // Lakukan tindakan yang diperlukan oleh admin
        } else {
            System.out.println("Otentikasi gagal. Silakan coba lagi.");
            // Lakukan tindakan jika otentikasi gagal
        }
    }
}

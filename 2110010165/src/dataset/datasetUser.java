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
import jualbelibaju.user;

public class datasetUser {
    public static void main(String[] args) {
        // Membuat dataset
        List<user> userList = new ArrayList<>();
        userList.add(new user(1, "John Doe", "johndoe", "123456", "johndoe@example.com", "123 Main St", "12345",
                "New York", "1234567890", "Aktif"));
        // Tambahkan data user lainnya sesuai kebutuhan

        // Menggunakan dataset
        for (user user : userList) {
            System.out.println("ID User: " + user.getIdUser());
            System.out.println("Nama User: " + user.getNamaUser());
            System.out.println("Login User: " + user.getLoginUser());
            System.out.println("Password User: " + user.getPassUser());
            System.out.println("Email User: " + user.getEmailUser());
            System.out.println("Alamat User: " + user.getAlamatUser());
            System.out.println("Kode Pos User: " + user.getKodeposUser());
            System.out.println("Kota User: " + user.getKotaUser());
            System.out.println("Telepon: " + user.getTelpon());
            System.out.println("Status: " + user.getStatus());
            System.out.println();
        }
    }
}


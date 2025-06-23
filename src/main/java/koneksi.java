
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daffa Alwan Al R
 */
/**
 * Kelas koneksi digunakan untuk mengatur koneksi antara aplikasi Java dengan database MySQL.
 * 
 * Kelas ini melakukan koneksi ke database `db_restoran` menggunakan JDBC, 
 * dengan kredensial default XAMPP (username: root, password: kosong).
 * Objek Connection yang dihasilkan dapat diakses menggunakan metode {@code getCon()}.
 * 
 * Contoh penggunaan:
 * <pre>
 *     koneksi k = new koneksi();
 *     k.connect();
 *     Connection con = k.getCon();
 * </pre>
 * 
 * Pastikan MySQL aktif dan database `db_restoran` telah dibuat sebelum digunakan.
 * 
 * @author 
 */
public class koneksi {

    /**
     * URL koneksi JDBC ke database MySQL lokal, mengarah ke database bernama "db_restoran".
     */
    private String url = "jdbc:mysql://localhost/db_restoran";

    /**
     * Username default untuk XAMPP (MySQL).
     */
    private String username_xampp = "root";

    /**
     * Password default untuk XAMPP (MySQL), kosong secara default.
     */
    private String password_xampp = "";

    /**
     * Objek {@link java.sql.Connection} yang digunakan untuk koneksi ke database.
     */
    private Connection con;

    /**
     * Metode ini digunakan untuk melakukan koneksi ke database.
     * 
     * Jika koneksi berhasil, akan mencetak "Koneksi Berhasil" ke konsol.
     * Jika gagal, akan menampilkan pesan error menggunakan {@link javax.swing.JOptionPane}.
     */
    public void connect() {
        try {
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * Mengembalikan objek koneksi yang sudah terbentuk.
     * 
     * @return objek {@link java.sql.Connection} yang terhubung ke database
     */
    public Connection getCon() {
        return con;
    }
}


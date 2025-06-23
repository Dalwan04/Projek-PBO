/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daffa Alwan Al R
 */
/**
 * Kelas {@code masakan} merepresentasikan entitas masakan pada sistem,
 * dengan atribut dasar seperti ID, nama, harga, dan status ketersediaan.
 * 
 * Kelas ini bisa digunakan untuk menyimpan informasi masakan yang akan
 * dimasukkan ke dalam database, ditampilkan ke pengguna, atau digunakan
 * dalam transaksi.
 * 
 * Contoh penggunaan:
 * <pre>
 *     masakan m = new masakan("Nasi Goreng", 15000, "Tersedia");
 *     System.out.println(m.nama_masakan);
 * </pre>
 * 
 * Atribut bersifat publik agar dapat diakses langsung oleh kelas lain.
 * 
 * @author 
 */
public class masakan {

    /**
     * ID unik untuk setiap masakan.
     */
    public int id_masakan;

    /**
     * Harga dari masakan.
     */
    public int harga;

    /**
     * Nama dari masakan.
     */
    public String nama_masakan;

    /**
     * Status ketersediaan masakan (misalnya: "Tersedia", "Habis").
     */
    public String status;

    /**
     * Konstruktor untuk membuat objek {@code masakan} dengan nama, harga, dan status.
     *
     * @param nama   nama masakan
     * @param harga  harga masakan
     * @param status status ketersediaan masakan
     */
    public masakan(String nama, int harga, String status) {
        this.nama_masakan = nama;
        this.harga = harga;
        this.status = status;
    }

    /**
     * Konstruktor default (tanpa parameter) yang dapat digunakan saat inisialisasi tanpa nilai awal.
     */
    public masakan() {}
}



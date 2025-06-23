/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daffa Alwan Al R
 */
/**
 * Kelas {@code Makanan} merepresentasikan sebuah entitas makanan dengan atribut
 * dasar berupa nama dan harga.
 *
 * Kelas ini menyediakan konstruktor untuk menginisialisasi data makanan serta
 * dua metode {@code info} untuk menampilkan informasi mengenai makanan.
 * Salah satu metode {@code info} merupakan metode overloading dengan parameter tambahan.
 * 
 * Contoh penggunaan:
 * <pre>
 *     Makanan m = new Makanan("Nasi Goreng", 15000);
 *     m.info(); // Menampilkan info dasar
 *     m.info("Spesial dengan telur"); // Overload dengan keterangan tambahan
 * </pre>
 * 
 * Kelas ini dapat digunakan sebagai kelas induk (superclass) untuk tipe makanan yang lebih spesifik.
 * 
 * @author 
 */
public class Makanan {

    /**
     * Nama dari makanan.
     */
    protected String nama;

    /**
     * Harga dari makanan.
     */
    protected int harga;

    /**
     * Konstruktor untuk membuat objek {@code Makanan} dengan nama dan harga tertentu.
     *
     * @param nama  nama makanan
     * @param harga harga makanan
     */
    public Makanan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    /**
     * Menampilkan informasi dasar tentang makanan, yaitu nama dan harga.
     * Format: {@code Makanan: <nama>, Harga: <harga>}
     */
    public void info() {
        System.out.println("Makanan: " + nama + ", Harga: " + harga);
    }

    /**
     * Overload dari metode {@code info} yang menampilkan informasi tambahan
     * tentang makanan.
     * 
     * @param tambahan informasi tambahan atau keterangan tentang makanan
     */
    public void info(String tambahan) {
        System.out.println(nama + " - " + tambahan);
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daffa Alwan Al R
 */
/**
 * Kelas {@code Snack} merupakan turunan dari kelas {@link Makanan} dan mengimplementasikan
 * antarmuka {@link BisaDipesan}.
 * <p>
 * Kelas ini merepresentasikan makanan ringan (snack) yang dapat dipesan,
 * dan mengimplementasikan metode {@code pesan()} dari interface {@code BisaDipesan}.
 * 
 * Contoh penggunaan:
 * <pre>
 *     Snack keripik = new Snack("Keripik", 7000);
 *     keripik.info();       // Menampilkan nama dan harga snack
 *     keripik.pesan();      // Menampilkan pesan berhasil dipesan
 * </pre>
 * 
 * @see Makanan
 * @see BisaDipesan
 * 
 * @author 
 */
public class Snack extends Makanan implements BisaDipesan {

    /**
     * Konstruktor untuk membuat objek {@code Snack} dengan nama dan harga tertentu.
     *
     * @param nama  nama snack
     * @param harga harga snack
     */
    public Snack(String nama, int harga) {
        super(nama, harga);
    }

    /**
     * Implementasi dari metode {@code pesan()} dalam interface {@link BisaDipesan}.
     * Menampilkan pesan bahwa snack berhasil dipesan.
     */
    @Override
    public void pesan() {
        System.out.println(nama + " berhasil dipesan!");
    }
}




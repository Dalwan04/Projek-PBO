/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daffa Alwan Al R
 */
/**
 * Kelas {@code MakananUtama} merupakan turunan dari kelas {@link Makanan} yang 
 * merepresentasikan makanan utama dengan tambahan atribut lauk.
 *
 * Kelas ini meng-override metode {@code info()} untuk menampilkan informasi tambahan
 * berupa lauk yang menyertai makanan utama.
 * 
 * Contoh penggunaan:
 * <pre>
 *     MakananUtama nasiPadang = new MakananUtama("Nasi Padang", 20000, "Rendang");
 *     nasiPadang.info(); // Menampilkan info makanan dan lauk
 * </pre>
 * 
 * @see Makanan
 * 
 * @author 
 */
public class MakananUtama extends Makanan {

    /**
     * Nama lauk yang menjadi pelengkap makanan utama.
     */
    private String lauk;

    /**
     * Konstruktor untuk membuat objek {@code MakananUtama} dengan nama, harga, dan lauk tertentu.
     *
     * @param nama  nama makanan utama
     * @param harga harga makanan utama
     * @param lauk  lauk yang menyertai makanan utama
     */
    public MakananUtama(String nama, int harga, String lauk) {
        super(nama, harga); // super constructor
        this.lauk = lauk;
    }

    /**
     * Menampilkan informasi lengkap makanan utama, termasuk nama, harga, dan lauk.
     * Override dari metode {@link Makanan#info()}.
     */
    @Override
    public void info() {
        super.info();
        System.out.println("Lauk: " + lauk);
    }

    /**
     * Mengembalikan lauk yang menyertai makanan utama.
     *
     * @return nama lauk
     */
    public String getLauk() {
        return lauk;
    }

    /**
     * Mengatur atau mengubah lauk dari makanan utama.
     *
     * @param lauk nama lauk yang baru
     */
    public void setLauk(String lauk) {
        this.lauk = lauk;
    }
}



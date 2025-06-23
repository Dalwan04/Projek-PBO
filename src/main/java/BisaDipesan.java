/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Daffa Alwan Al R
 */
/**
 * Interface {@code BisaDipesan} mendefinisikan kontrak untuk objek yang dapat dipesan.
 * 
 * Interface ini biasanya digunakan untuk jenis makanan, minuman, atau item lain 
 * yang dapat melakukan aksi pemesanan, melalui metode {@link #pesan()}.
 * 
 * Interface ini juga memiliki metode {@code main} hanya sebagai placeholder atau untuk keperluan uji coba.
 * 
 * Contoh implementasi:
 * <pre>
 * public class Snack extends Makanan implements BisaDipesan {
 *     public void pesan() {
 *         System.out.println("Snack berhasil dipesan!");
 *     }
 * }
 * </pre>
 * 
 * @see Snack
 * @author 
 */
public interface BisaDipesan {

    /**
     * Metode ini digunakan untuk memesan objek yang mengimplementasikan interface ini.
     * Implementasi dari metode ini akan menentukan aksi spesifik saat objek dipesan.
     */
    void pesan();

    /**
     * Metode utama (main) yang dapat digunakan untuk pengujian mandiri terhadap
     * implementasi interface ini.
     * 
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}


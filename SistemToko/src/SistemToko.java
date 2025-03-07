/*
*File: SistemToko.java (v1)
* By: Praditama Ajmal Hasan
* Desc: Ini adalah program simulasi Toko E-commerce
*/

import java.util.*;

//  MAIN PROGRAM
public class SistemToko {

    public static void main(String[] args) {
        // inisialisasi object admin
        Admin admin = new Admin("Dewi", "admin@toko.com");

        // inisialisasi object Toko
        Toko toko1 = new Toko("Toko BestBuy");
        admin.tambahToko(toko1);

        // inisialisasi object Kategori
        Kategori kategoriPakaian = new Kategori("Pakaian");
        Kategori kategoriElektronik = new Kategori("Elektronik");
        Kategori kategoriBuku = new Kategori("Buku");

        // inisialisasi object Produk
        Kemeja kemeja = new Kemeja("Kemeja Batik", 250000, 10, kategoriPakaian, "L", "Katun");
        Celana celana = new Celana("Celana Loose Pants", 150000, 5,kategoriPakaian, "30", "katun");
        Elektronik laptop = new Elektronik("Laptop MacBook", 15000000, 5, kategoriElektronik, 100);
        Buku buku = new Buku("Pemrograman Java", 120000, 20, kategoriBuku, "John Doe");

        // inisialisasi object Penjual
        Penjual penjual1 = new Penjual("Budi", "budi@toko.com", toko1);

        // Penjual Menambahkan Produk
        penjual1.tambahProduk(kemeja);
        penjual1.tambahProduk(celana);
        penjual1.tambahProduk(laptop);
        penjual1.tambahProduk(buku);

        // menampilkan Produk Toko
        toko1.tampilkanProduk();

        // inisialisasi object Pembeli
        Pembeli pembeli1 = new Pembeli("Andi", "andi@gmail.com");

        // Pembeli Menambahkan Produk ke Keranjang
        pembeli1.tambahKeKeranjang(kemeja);
        pembeli1.tambahKeKeranjang(laptop);

        // inisialisasi object metodePembayaran
        metodePembayaran metodePembayaran = new kartuKredit();

        // Checkout
        pembeli1.checkout(metodePembayaran);

        // Lihat Riwayat Pembelian
        pembeli1.tampilkanRiwayat();

        // Kirim Notifikasi untuk masing masing user
        admin.kirimNotifikasi("Telah terjadi transaksi di toko BestBuy");
        penjual1.kirimNotifikasi("Selamat! Produk telah terjual");
        pembeli1.kirimNotifikasi("Pembelian Anda berhasil!");
    }
}
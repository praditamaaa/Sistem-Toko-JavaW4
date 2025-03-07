
//Abstract class Produk untuk mengurus produk pada toko
abstract class Produk {

//  Deklarasi variabel
    protected String nama;
    protected double harga;
    protected int stok;
    protected Kategori kategori;

//  Constructor
    public Produk(String nama, double harga, int stok, Kategori kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

//   Abstract method
    abstract void deskripsi();

//  Getter
    double getHargaSetelahDiskon() {
        return harga;
    }
    int getStok() {
        return stok;
    }

//  Prosedur untuk menampilkan produk
    void tampilkanInfo() {
        System.out.println("Nama Produk: " + nama + ", Harga: Rp " + harga + ", Stok: " + stok + ", Kategori: " + kategori.getNama());
    }

//  Prosedur kurangiStok yang bisa digunakan untuk mengembangkan program
    void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("⚠️ Stok produk '" + nama + "' tidak mencukupi.");
        }
    }



}
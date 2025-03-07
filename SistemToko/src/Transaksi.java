import java.util.List;

//class transaksi untuk mengurus transaksi pembayaran
class Transaksi {

//  Deklarasi variabel
    private Pembeli pembeli;
    private List<Produk> produk;
    private double total;
    private metodePembayaran MetodePembayaran;

//  Constructor
    public Transaksi(Pembeli pembeli, List<Produk> produk, double total, metodePembayaran MetodePembayaran) {
        this.pembeli = pembeli;
        this.produk = produk;
        this.total = total;
        this.MetodePembayaran = MetodePembayaran;
    }

//  Prosedur untuk menampilkan detail transaksi
    public void tampilkanDetail() {
        System.out.println("\n📄 Detail Transaksi:");
        System.out.println("Pembeli: " + pembeli.nama);
        System.out.println("Metode Pembayaran: " + MetodePembayaran.getNama());
        System.out.println("Produk:");
        for (Produk p : produk) {
            System.out.println("- " + p.nama + " | Rp " + p.getHargaSetelahDiskon());
        }
        System.out.println("Total: Rp " + total);
    }
}
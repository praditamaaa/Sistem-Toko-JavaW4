import java.util.ArrayList;
import java.util.List;

// class Pembeli (child class User)
class Pembeli extends User {
    private List<Produk> keranjang = new ArrayList<>();
    private List<Transaksi> riwayatTransaksi = new ArrayList<>();

    public Pembeli(String nama, String email) {
        super(nama, email);
    }

    public void tambahKeKeranjang(Produk produk) {
        if (produk.getStok() > 0) {
            keranjang.add(produk);
            System.out.println("🛒 Produk '" + produk.nama + "' ditambahkan ke keranjang.");
        } else {
            System.out.println("⚠️ Produk '" + produk.nama + "' stok habis.");
        }
    }

    public void checkout(metodePembayaran MetodePembayaran) {
        if (keranjang.isEmpty()) {
            System.out.println("⚠️ Keranjang kosong.");
            return;
        }

        double total = 0;
        System.out.println("\n✅ Checkout Berhasil! Produk yang dibeli:");
        for (Produk p : keranjang) {
            System.out.println("- " + p.nama + " | Rp " + p.getHargaSetelahDiskon());
            total += p.getHargaSetelahDiskon();
            p.kurangiStok(1);
        }
        System.out.println("Total: Rp " + total);

        Transaksi transaksi = new Transaksi(this, keranjang, total, MetodePembayaran);
        riwayatTransaksi.add(transaksi);
        keranjang.clear();
    }

    public void tampilkanRiwayat() {
        System.out.println("\n📜 Riwayat Pembelian:");
        for (Transaksi t : riwayatTransaksi) {
            t.tampilkanDetail();
        }
    }

    @Override
    void tampilkanInfo() {
        System.out.println("[Pembeli] Nama: " + nama + ", Email: " + email);
    }

    @Override
    public void kirimNotifikasi(String pesan) {
        System.out.println("[Notifikasi Pembeli] " + pesan);
    }
}
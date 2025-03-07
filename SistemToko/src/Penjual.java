
// class Pembeli (child class User)
class Penjual extends User {
    private Toko toko;

    public Penjual(String nama, String email, Toko toko) {
        super(nama, email);
        this.toko = toko;
    }

    public void tambahProduk(Produk produk) {
        toko.tambahProduk(produk);
        System.out.println("✅ Produk '" + produk.nama + "' berhasil ditambahkan ke Toko '" + toko.getNamaToko() + "'.");
    }

    @Override
    void tampilkanInfo() {
        System.out.println("[Penjual] Nama: " + nama + ", Email: " + email + ", Toko: " + toko.getNamaToko());
    }

    @Override
    public void kirimNotifikasi(String pesan) {
        System.out.println("[Notifikasi Penjual] " + pesan);
    }
}
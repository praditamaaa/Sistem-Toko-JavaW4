
// Subclass Buku (child class Produk)
class Buku extends Produk {

//  Deklarasi
    private String penulis;

//  Constructor
    public Buku(String nama, double harga, int stok, Kategori kategori, String penulis) {
        super(nama, harga, stok, kategori);
        this.penulis = penulis;
    }

//  Prosedur yang berasal dari parent class untuk menampilkan deskripsi produk
    @Override
    void deskripsi() {
        System.out.println("Buku '" + nama + "' oleh " + penulis);
    }
}
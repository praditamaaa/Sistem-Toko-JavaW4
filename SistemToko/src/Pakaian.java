// abstract subclass Pakaian (child class Produk)
abstract class Pakaian extends Produk {

//  Deklarasi variabel
    protected String ukuran;
    protected String bahan;

//  Constructor
    public Pakaian(String nama, double harga, int stok, Kategori kategori, String ukuran, String bahan) {
        super(nama, harga, stok, kategori);
        this.ukuran = ukuran;
        this.bahan = bahan;
    }
}
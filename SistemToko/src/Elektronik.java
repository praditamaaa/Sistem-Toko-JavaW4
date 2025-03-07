
// Subclass Elektronik (child class Produk)
class Elektronik extends Produk {

//  Deklarasi variabel
    private int daya;

//  Constructor
    public Elektronik(String nama, double harga, int stok, Kategori kategori, int daya) {
        super(nama, harga, stok, kategori);
        this.daya = daya;
    }

//  Prosedur yang berasal dari parent class untuk menampilkan deskripsi produk
    @Override
    void deskripsi() {
        System.out.println("Elektronik " + nama + " dengan daya " + daya + " Watt.");
    }
}
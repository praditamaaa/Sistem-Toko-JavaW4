
//class Kemeja(child class Pakaian)
class Kemeja extends Pakaian {

//  Constructor
    public Kemeja(String nama, double harga, int stok, Kategori kategori, String ukuran, String bahan) {
        super(nama, harga, stok, kategori, ukuran, bahan);
    }

    //  Prosedur yang berasal dari parent class untuk menampilkan deskripsi produk
    @Override
    void deskripsi() {
        System.out.println("Kemeja " + nama + " ukuran " + ukuran + " berbahan " + bahan);
    }
}
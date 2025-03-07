
//Class celana (child class Pakaian)
public class Celana extends Pakaian {

//  Constructor
    public Celana(String nama, double harga, int stok, Kategori kategori, String ukuran, String bahan) {
        super(nama, harga, stok, kategori, ukuran, bahan);
    }

    //  Prosedur yang berasal dari parent class untuk menampilkan deskripsi produk
    @Override
    void deskripsi() {
        System.out.println("Celana " + nama + " ukuran " + ukuran + " berbahan " + bahan);
    }
}

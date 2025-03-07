import java.util.ArrayList;
import java.util.List;

//Class toko untuk simulasi toko
class Toko {

//  Deklarasi variabel
    private String namaToko;
    private List<Produk> daftarProduk = new ArrayList<>();

//  Constructor
    public Toko(String namaToko) {
        this.namaToko = namaToko;
    }

//  Getter
    public String getNamaToko() {
        return namaToko;
    }

//  Prosedur untuk menambahkan produk
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

//  Prosedur untuk menampilkan produk yang dimiliki toko
    public void tampilkanProduk() {
        System.out.println("\n🏪 Toko: " + namaToko);
        for (Produk p : daftarProduk) {
            p.tampilkanInfo();
        }
    }
}
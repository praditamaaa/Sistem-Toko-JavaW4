
//abstract class (parent class) metodePembayaran
abstract class metodePembayaran {
//  Deklarasi variabel
    protected String nama;

//  Constructor
    public metodePembayaran(String nama) {
        this.nama = nama;
    }

//  Getter
    public String getNama() {
        return nama;
    }

//  abstract class yang akan digunakan child class
    abstract void prosesPembayaran(double jumlah);
}
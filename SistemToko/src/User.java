
//class User sebagai parent class dari Admin, Penjual, Pembeli dan mengambil interface Notifikasi
abstract class User implements Notifikasi {

//  Deklarasi variabel
    protected String nama;
    protected String email;

//  Constructor
    public User(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

//  Abstract class yang akan digunakan oleh child class
    abstract void tampilkanInfo();
}

import java.util.ArrayList;
import java.util.List;

// class Admin (child class User)
class Admin extends User {

//  Deklarasi variabel
    private List<Toko> daftarToko = new ArrayList<>();

//  Costructor
    public Admin(String nama, String email) {
        super(nama, email);
    }

//  Prosedur untuk menambahkan toko
    public void tambahToko(Toko toko) {
        daftarToko.add(toko);
        System.out.println("✅ Toko '" + toko.getNamaToko() + "' berhasil ditambahkan oleh Admin.");
    }

//  Prosedur yang berasal dari parent class
    @Override
    void tampilkanInfo() {
        System.out.println("[Admin] Nama: " + nama + ", Email: " + email);
    }

//  Prosedur yang berasal dari interface
    @Override
    public void kirimNotifikasi(String pesan) {
        System.out.println("[Notifikasi Admin] " + pesan);
    }
}
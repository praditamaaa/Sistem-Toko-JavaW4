
//Class tunai (child class metodePembayaran)
class Tunai extends metodePembayaran {

//  Constructor
    public Tunai() {
        super("Tunai");
    }

    //  Prosedur prosesPembayaran yang berasal dari parent class
    @Override
    void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran tunai sebesar Rp " + jumlah + " berhasil.");
    }
}
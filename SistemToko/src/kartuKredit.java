
//Class KartuKredit(child class metodePembayaran)
class kartuKredit extends metodePembayaran {

//  Constructor
    public kartuKredit() {
        super("Kartu Kredit");
    }

//  Prosedur prosesPembayaran yang berasal dari parent class
    @Override
    void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran dengan kartu kredit sebesar Rp " + jumlah + " berhasil.");
    }
}

//Class transferbank (child class dari metodePembayaran)
class transferBank extends metodePembayaran {
//  Constructor
    public transferBank() {
        super("Transfer Bank");
    }

//  Prosedur prosesPembayaran yang berasal dari parent class
    @Override
    void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran dengan transfer bank sebesar Rp " + jumlah + " berhasil.");
    }
}
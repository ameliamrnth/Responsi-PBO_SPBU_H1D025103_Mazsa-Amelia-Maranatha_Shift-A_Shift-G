public class Minimarket extends FasilitasSPBU {
    private boolean buka;

    public Minimarket(String idFasilitas, String namaFasilitas, boolean buka) {
        super(idFasilitas, namaFasilitas);
        this.buka = buka;
    }

    public Minimarket(String idFasilitas) {
        super(idFasilitas);
        this.buka = false;
    }

    public boolean isBuka() {
        return buka;
    }

    public void setBuka(boolean buka) {
        this.buka = buka;
    }

    @Override
    public void prosesLayanan(int jumlah) {
        System.out.println("Belanja " + jumlah + " barang di " + getNamaFasilitas());
        if (buka) {
            double total = jumlah * 15000;
            tambahPendapatan(total);
            System.out.println("Total belanja: Rp" + (long) total);
        } else {
            System.out.println("Minimarket sedang tutup");
        }
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Status: " + (buka ? "buka" : "tutup"));
    }
}
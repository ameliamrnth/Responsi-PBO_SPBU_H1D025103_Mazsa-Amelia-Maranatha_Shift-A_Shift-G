public class PompaBensin extends FasilitasSPBU implements Operasional, Transaksi {
    private int stokLiter;

    public PompaBensin(String idFasilitas, String namaFasilitas, int stokLiter) {
        super(idFasilitas, namaFasilitas);
        this.stokLiter = stokLiter;
    }

    public int getStokLiter() {
        return stokLiter;
    }

    public void setStokLiter(int stokLiter) {
        this.stokLiter = stokLiter;
    }

    // fungsi: ada return value
    public double hitungBiaya(int liter) {
        return liter * 19600;
    }

    @Override
    public void mulaiOperasi() {
        System.out.println(getNamaFasilitas() + " mulai beroperasi");
    }

    @Override
    public void catatTransaksi(double nominal) {
        tambahPendapatan(nominal);
        System.out.println("Transaksi dicatat: Rp" + (long) nominal);
    }

    @Override
    public void prosesLayanan(int jumlah) {
        System.out.println("Isi bensin " + jumlah + " liter");
        if (jumlah <= 0) {
            System.out.println("Gagal, jumlah liter harus lebih dari 0");
        } else if (jumlah <= stokLiter) {
            stokLiter -= jumlah;
            catatTransaksi(hitungBiaya(jumlah));
            System.out.println("Berhasil, sisa stok " + stokLiter + " liter");
        } else {
            System.out.println("Gagal, stok tidak cukup (sisa " + stokLiter + " liter)");
        }
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Stok: " + stokLiter + " liter");
    }
}
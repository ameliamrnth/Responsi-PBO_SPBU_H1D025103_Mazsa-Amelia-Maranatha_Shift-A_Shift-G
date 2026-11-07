public class Main {
    public static void main(String[] args) {
        System.out.println("SPBU " + FasilitasSPBU.NAMA_PERUSAHAAN);
        System.out.println();

        // objek PompaBensin disimpen di variabel yg bertipe interface
        Operasional operasi = new PompaBensin("PB-01", "Pertamax Turbo 98", 50);
        operasi.mulaiOperasi();

        // downcast agar bisa pakai method milik PompaBensin
        PompaBensin pompa = (PompaBensin) operasi;
        System.out.println();

        // percabangan if/else: pertama berhasil, kedua gagal karena stok ny kurang
        pompa.prosesLayanan(20);
        pompa.prosesLayanan(40);
        System.out.println();

        // objek yg sama bisa dipegang interface lain (multiple interface)
        Transaksi kasir = pompa;
        kasir.catatTransaksi(5000);
        System.out.println("Pendapatan pompa: Rp" + (long) pompa.getPendapatan());
        System.out.println();

        // method override yg manggil super.tampilkanInformasi()
        pompa.tampilkanInformasi();
        System.out.println();

        // subclass ke-2
        FasilitasSPBU toko = new Minimarket("MM-01", "Pertamina Shop", true);
        toko.prosesLayanan(3);
        toko.tampilkanInformasi();
        System.out.println("Pendapatan toko: Rp" + (long) toko.getPendapatan());
        System.out.println();

        // konstruktor ke-2 (overloading), nama diisi lewat setter
        Minimarket tokoBaru = new Minimarket("MM-02");
        tokoBaru.tampilkanInformasi();
        tokoBaru.setNamaFasilitas("Pertamina Shop 2");
        tokoBaru.prosesLayanan(2);
        tokoBaru.setBuka(true);
        tokoBaru.prosesLayanan(2);
    }
}
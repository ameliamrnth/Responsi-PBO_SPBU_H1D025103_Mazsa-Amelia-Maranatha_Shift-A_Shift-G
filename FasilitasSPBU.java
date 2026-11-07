public abstract class FasilitasSPBU {
    public static final String NAMA_PERUSAHAAN = "Pertamina";

    private final String idFasilitas;
    private String namaFasilitas;
    private double pendapatan;

    public FasilitasSPBU(String idFasilitas) {
        this(idFasilitas, "Tanpa Nama");

    }

    public FasilitasSPBU(String idFasilitas, String namaFasilitas) {
        this.idFasilitas = idFasilitas;
        this.namaFasilitas = namaFasilitas;
        this.pendapatan = 0;
    }

    public abstract void prosesLayanan(int jumlah);

    public String getIdFasilitas() {
        return idFasilitas;
    }

    public String getNamaFasilitas() {
        return namaFasilitas;
    }

    public void setNamaFasilitas(String namaFasilitas) {
        this.namaFasilitas = namaFasilitas;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public void tambahPendapatan(double jumlah) {
        this.pendapatan += jumlah;
    }

    public void tampilkanInformasi() {
        System.out.println("ID: " + idFasilitas);
        System.out.println("Nama: " + namaFasilitas);
    }
}
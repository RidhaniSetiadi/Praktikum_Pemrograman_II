package PRAKTIKUM4_Soal2;
public abstract class Buku {
    protected String judul;
    protected String penulis;
    protected int tahun;

    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }
    public abstract String getDetail();
}

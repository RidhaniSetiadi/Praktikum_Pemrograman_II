package PRAKTIKUM4_Soal2;
public class HewanPeliharaan {

    private String nama, ras;
    public HewanPeliharaan(String ras, String nama) {
        this.ras = ras;
        this.nama = nama;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
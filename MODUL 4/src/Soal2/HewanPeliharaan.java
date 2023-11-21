package Soal2;
public class HewanPeliharaan {
    private String nama, ras;
    public HewanPeliharaan(String r, String n) {
        this.ras = r;
        this.nama = n;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
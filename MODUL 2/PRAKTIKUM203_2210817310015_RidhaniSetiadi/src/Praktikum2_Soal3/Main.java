package Praktikum2_Soal3;
public class Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
//        p1.nama = "Roi" //  pada baris ini seharusnya tambahkan titik koma
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.umur = "17 tahun";
        p1.setJabatan("Assasin"); // tambahkan parameter
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur);
    }
}

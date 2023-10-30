package Soal3;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu : ");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik) : ");
                    String nim = input.nextLine();

                    boolean nimUnique = true;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNim().equals(nim)) {
                            nimUnique = false;
                            break; }
                    }
                    if (nimUnique) {
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                        daftarMahasiswa.add(mahasiswa);
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    } else {
                        System.out.println("NIM harus unik. Mahasiswa tidak ditambahkan.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus : ");
                    String nimHapus = input.nextLine();

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        Mahasiswa mhs = daftarMahasiswa.get(i);
                        if (mhs.getNim().equals(nimHapus)) {
                            daftarMahasiswa.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                            break; }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari : ");
                    String nimCari = input.nextLine();
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNim().equals(nimCari)) {
                            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                            break; }
                    }
                    break;
                case 4:
                    System.out.println("Daftar Mahasiswa :");
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
            }
        } while (pilihan != 0);
    }
}

package PRAKTIKUM4_Soal2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Input
        int pilihan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        pilihan = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nama hewan peliharaan: ");
        String nama = scanner.nextLine();
        System.out.print("Ras = ");
        String ras = scanner.nextLine();
        System.out.print("Warna bulu = ");
        String warnaBulu = scanner.nextLine();

        // Proses
        HewanPeliharaan hewanPeliharaan;
        if (pilihan == 1) {
            hewanPeliharaan = new Kucing(ras, nama, warnaBulu);
        } else {
            System.out.print("Kemampuan = ");
            String kemampuan = scanner.nextLine() ;

            String[] pisah = kemampuan.split("\\,") ;

            hewanPeliharaan = new Anjing(ras, nama,warnaBulu, pisah);
        }

        // Output
        hewanPeliharaan.display();
    }
}
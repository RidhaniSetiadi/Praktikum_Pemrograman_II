package Praktikum2_Soal2;
public class Kopi {
        String namaKopi;
        String ukuran;
        double harga;
        String pembeli;
        void info() {
            System.out.println("Nama Kopi: " + namaKopi);
            System.out.println("Ukuran: " + ukuran);
            System.out.println("Harga: Rp. " + harga);
        }
        void setPembeli(String pembeli) {
            this.pembeli = pembeli;
        }
        String getPembeli() {
            return pembeli;
        }
        double getPajak() {
            return harga * 0.11;
        }
    }

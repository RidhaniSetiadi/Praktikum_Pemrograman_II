public class Buah {

    String Nama;
    double Berat;
    double Harga;
    double JumlahBeli;
    double HargaSebelumDiskon;
    double TotalDiskon;
    double HargaSetelahDiskon;

    public Buah(String nama, double Berat, double Harga, double HargaSebelumDiskon, double JumlahBeli) {
        this.Nama = nama;
        this.Berat = Berat;
        this.Harga = Harga;
        this.HargaSebelumDiskon = HargaSebelumDiskon;
        this.JumlahBeli = JumlahBeli;
    }
    public void hitungTotalDiskon() {
        TotalDiskon = (Math.floor(JumlahBeli / 4) * 0.02 * Harga * 4);
        HargaSetelahDiskon = HargaSebelumDiskon - TotalDiskon;

        System.out.printf(" Total diskon : Rp%.2f\n", TotalDiskon);
        System.out.printf(" Harga setelah diskon : Rp%.2f\n\n", HargaSetelahDiskon);
    }
    public void buahInfo() {
        System.out.println(" Nama buah : " + Nama);
        System.out.println(" Berat : " + Berat);
        System.out.println(" Harga : " + Harga);
        System.out.println(" Jumlah beli : " + JumlahBeli + "kg");
        System.out.printf(" Harga sebelum diskon : Rp%.2f\n", HargaSebelumDiskon);
        hitungTotalDiskon();
    }
}

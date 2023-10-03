import java.util.Scanner;
public class PRAK101_2210817310015_RidhaniSetiadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String Namalengkap = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int Bulanlahir = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int Tahunlahir = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int Tinggibadan = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        float beratBadan = input.nextFloat();

        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("Nama Lengkap " + Namalengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + namaBulan[Bulanlahir - 1] + " " + Tahunlahir);
        System.out.println("Tinggi Badan " + Tinggibadan + " cm dan Berat Badan " + beratBadan + " kilogram");
    }
}

import java.util.Scanner;
public class PRAK102_2210817310015_RidhaniSetiadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");

        int Angkaawal = input.nextInt();
        int jumlah_Deret = 10;
        int i = 0;
        while (i <= jumlah_Deret) {
            int angka = (Angkaawal % 5 == 0) ? Angkaawal / 5 - 1 : Angkaawal;
            System.out.print(angka);

            if (i <= jumlah_Deret - 1) {
                System.out.print(",");
            }
            Angkaawal++;
            i++;
        }
    }
}

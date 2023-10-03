import java.util.Scanner;

public class PRAK103_2210817310015_RidhaniSetiadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Masukkan Angka : ");
        int N = input.nextInt();

        System.out.print(" ");
        int bilangan_Awal = input.nextInt();
        int baris = 1;
        int Bilangan = bilangan_Awal;

        while (baris <= N) {
            if (Bilangan % 2 != 0) {
                System.out.print(Bilangan);
                if (baris < N) {
                    System.out.print(", ");
                }
                baris++;
            }
            Bilangan++;
        }
    }
}

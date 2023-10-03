import java.util.Scanner;
public class PRAK104_2210817310015_RidhaniSetiadi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan pilihan tangan Abu : ");
            String[] TanganAbu = scanner.nextLine().split(" ");

            System.out.print("Masukkan pilihan tangan Bagas : ");
            String[] TanganBagas = scanner.nextLine().split(" ");

            int Scoreabu = 0;
            int Scorebagas = 0;

            for (int i = 0; i < 3; i++) {
                if ((TanganAbu[i].equals("G") && TanganBagas[i].equals("K")) ||
                        (TanganAbu[i].equals("K") && TanganBagas[i].equals("B")) ||
                        (TanganAbu[i].equals("B") && TanganBagas[i].equals("G"))) {
                    Scoreabu++;
                } else if ((TanganBagas[i].equals("G") && TanganAbu[i].equals("K")) ||
                        (TanganBagas[i].equals("K") && TanganAbu[i].equals("B")) ||
                        (TanganBagas[i].equals("B") && TanganAbu[i].equals("G"))) {
                    Scorebagas++;
                }
            }

            if (Scoreabu > Scorebagas) {
                System.out.println("Abu");
            } else if (Scorebagas > Scoreabu) {
                System.out.println("Bagas");
            } else {
                System.out.println("Seri");
            }
        }
    }

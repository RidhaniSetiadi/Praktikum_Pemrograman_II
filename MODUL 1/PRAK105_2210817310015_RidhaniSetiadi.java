import java.util.Scanner;
public class PRAK105_2210817310015_RidhaniSetiadi {

        public static void main(String[] args) {
            final double PHI = 3.14;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jari-jari : ");
            float Jarijari = scanner.nextFloat();

            System.out.print("Masukkan Tinggi : ");
            float Tinggi = scanner.nextFloat();

            double volume = PHI * Math.pow(Jarijari, 2) * Tinggi;

            String output = String.format("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", Jarijari, Tinggi, volume);
            System.out.print(output);
        }
    }


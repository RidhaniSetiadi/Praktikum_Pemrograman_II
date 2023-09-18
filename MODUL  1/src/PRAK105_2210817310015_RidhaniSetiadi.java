import java.util.Scanner;
public class PRAK105_2210817310015_RidhaniSetiadi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Makanan Favorit: ");
        String makanan = scanner.nextLine();
        System.out.print("Masukkan Hobi: ");
        String hobi = scanner.nextLine();
        System.out.println("Aku Suka Makan " + makanan + ", dan Hobiku " + hobi);
        scanner.close();
    }
}

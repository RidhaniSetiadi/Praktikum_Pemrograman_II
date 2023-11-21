package Soal1;
import java.util.Scanner;
public class Hewan {
    private String nama, Ras;
    public Hewan(String n, String R) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan : ");
        n = scanner.nextLine();
        this.nama = n ;
        System.out.print("Ras : ");
        R = scanner.nextLine();
        this.Ras = R ;
    }
    public void display() {
        System.out.println("\nDetail :");
        System.out.println("Nama Hewan peliharaan : " + nama);
        System.out.println("Ras : " + Ras);
    }
}


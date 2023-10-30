package PRAKTIKUM4_Soal2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);

        // Pilih buku
        do {
            System.out.println("Pilih buku yang ingin diinputkan:");
            System.out.println("1 = Novel");
            System.out.println("2 = Komik");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
        } while (pilihan < 1 || pilihan > 2);

        // Input data buku
        switch (pilihan) {
            case 1:
                String judulNovel, penulisNovel, genreNovel, sinopsisNovel;
                System.out.print("Judul: ");
                judulNovel = input.nextLine();
                System.out.print("Penulis: ");
                penulisNovel = input.nextLine();
                System.out.print("Tahun Terbit: ");
                int tahunNovel = input.nextInt();
                System.out.print("Genre: ");
                genreNovel = input.nextLine();
                System.out.print("Sinopsis: ");
                sinopsisNovel = input.nextLine();

                Buku bukuNovel = new Novel(judulNovel, penulisNovel, tahunNovel, genreNovel, sinopsisNovel);
                System.out.println(bukuNovel.getDetail());
                break;

            case 2:
                String judulKomik, penulisKomik, sinopsisKomik;
                System.out.print("Judul: ");
                judulKomik = input.nextLine();
                System.out.print("Penulis: ");
                penulisKomik = input.nextLine();
                System.out.print("Tahun Terbit: ");
                int tahunKomik = input.nextInt();
                System.out.print("Volume: ");
                int volumeKomik = input.nextInt();
                System.out.print("Sinopsis: ");
                sinopsisKomik = input.nextLine();

                Buku bukuKomik = new Komik(judulKomik, penulisKomik, tahunKomik, volumeKomik, sinopsisKomik);
                System.out.println(bukuKomik.getDetail());
                break;
        }
    }

}

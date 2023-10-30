package PRAKTIKUM4_Soal2;
class Komik extends Buku {

    private int volume;

    public Komik(String judul, String penulis, int tahun, int volume, String sinopsis) {
        super(judul, penulis, tahun);
        this.volume = volume;
    }

    @Override
    public String getDetail() {
        return "Sebuah komik dengan judul " + judul + ". Komik tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun + ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + " buah.\n" + null;
    }

}

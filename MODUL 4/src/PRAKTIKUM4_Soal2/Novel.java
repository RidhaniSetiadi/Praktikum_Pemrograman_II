package PRAKTIKUM4_Soal2;
class Novel extends Buku {

    private String genre;
    private String sinopsis;

    public Novel(String judul, String penulis, int tahun, String genre, String sinopsis) {
        super(judul, penulis, tahun);
        this.genre = genre;
        this.sinopsis = sinopsis;
    }

    @Override
    public String getDetail() {
        return "Sebuah novel bergenre " + genre + " dengan judul " + judul + ". Novel tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + tahun + ".\n" + sinopsis;
    }

}


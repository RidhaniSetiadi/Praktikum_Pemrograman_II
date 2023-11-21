package PRAKTIKUM4_Soal2;
class Kucing extends HewanPeliharaan {

    private String warnaBulu;

    public Kucing(String ras, String nama, String warnaBulu) {
        super(ras, nama);
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}
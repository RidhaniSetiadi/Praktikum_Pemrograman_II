package Soal2;
class Kucing extends HewanPeliharaan {
    private String warnaBulu;
    public Kucing(String r, String n, String W) {
        super(r, n);
        this.warnaBulu = W;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}
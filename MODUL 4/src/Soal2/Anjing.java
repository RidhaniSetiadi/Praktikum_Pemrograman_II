package Soal2;
class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;
    public Anjing(String r, String n, String W, String[] k) {
        super(r, n);
        this.warnaBulu = W;
        this.kemampuan = k;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + kemampuan[0] + " " + kemampuan[1] + " " + kemampuan[2]);
    }
}

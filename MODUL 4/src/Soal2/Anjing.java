package PRAKTIKUM4_Soal2;
class Anjing extends HewanPeliharaan {

    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String ras, String nama, String warnaBulu, String[] kemampuan) {
        super(ras, nama);
        this.warnaBulu = warnaBulu;
        this.kemampuan = kemampuan;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + kemampuan[0] + " " + kemampuan[1] + " " + kemampuan[2]);
    }
}

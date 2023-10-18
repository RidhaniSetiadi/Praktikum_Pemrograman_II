package Praktikum2_Soal3;
public class Pegawai {
        public String nama;
        public String asal;
        public String jabatan;
        public String umur;
        public String getNama() {
            return nama;
        }
        public String getAsal() {
            return asal;
        }
//        public void setJabatan (){ Pada baris ini terjadi error karena
//        metode setJabatan() tidak memiliki parameter sehingga
//        menyebabkan kesalahan kompilasi. Metode yang dikoreksi
//        mengambil parameter String j dan menyetel properti jabatan ke nilainya.
        public void setJabatan(String j) {
            this.jabatan = j;
}
        }


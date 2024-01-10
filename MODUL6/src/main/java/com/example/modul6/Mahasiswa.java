package com.example.modul6;
public class Mahasiswa {
    private int id;
    private String nama, nim;
    public Mahasiswa(int id, String nama, String nim) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
    }
    public int getId() {
        return id; }
    public void setId(int id) {
        this.id = id; }
    public String getNama() {
        return nama; }
    public void setNama(String nama) {
        this.nama = nama; }
    public String getNim() {
        return nim; }
    public void setNim(String nim) {
        this.nim = nim; }
}


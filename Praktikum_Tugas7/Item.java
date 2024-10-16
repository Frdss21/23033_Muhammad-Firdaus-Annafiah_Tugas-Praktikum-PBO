package Praktikum_Tugas7;

public class Item {
    private String kode;
    private String nama;
    private int harga;
    private int jumlahBeli;

    public Item(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public int getTotalHarga() {
        return harga * jumlahBeli;
    }
}
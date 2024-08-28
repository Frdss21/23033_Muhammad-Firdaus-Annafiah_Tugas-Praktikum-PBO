package Praktikum_Tugas1;

public class Nilai {
    private String nim;
    private String nama;
    private int nilaiAbsen;
    private int nilaiTugas;
    private int nilaiUTS;
    private int nilaiUAS;
    private double nilaiAkhir;

    // Konstruktor dengan parameter
    public Nilai(String nim, String nama, int nilaiAbsen, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiAkhir = hitungNilaiAkhir();
    }

    // Metode untuk menghitung nilai akhir
    private double hitungNilaiAkhir() {
        return nilaiAbsen * 0.1 + nilaiTugas * 0.2 + nilaiUTS * 0.3 + nilaiUAS * 0.4;
    }

    // Metode untuk mencetak nilai
    public void cetakNilai() {
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nilai Absen[10%]\t: " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]\t: " + nilaiTugas);
        System.out.println("Nilai UTS [30%]\t\t: " + nilaiUTS);
        System.out.println("Nilai UAS [40%]\t\t: " + nilaiUAS);
        System.out.println("Nilai Akhir\t\t: " + nilaiAkhir);
    }
}


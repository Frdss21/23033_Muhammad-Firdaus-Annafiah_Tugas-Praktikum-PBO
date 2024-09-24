package Praktikum_Tugas5;

public class Mahasiswa {
    private String npm;
    private String nama;
    private double nilaiKehadiran;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;
    private double nilaiAkhir;
    private String grade;
    private String keterangan;

    public Mahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        hitungNilaiAkhir();
        tentukanGrade();
        tentukanKeterangan();
    }

    private void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    private void tentukanGrade() {
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            this.grade = "A";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            this.grade = "B";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            this.grade = "C";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            this.grade = "D";
        } else {
            this.grade = "E";
        }
    }

    private void tentukanKeterangan() {
        switch (grade) {
            case "A":
                this.keterangan = "ISTIMEWA";
                break;
            case "B":
                this.keterangan = "BAIK";
                break;
            case "C":
                this.keterangan = "CUKUP";
                break;
            case "D":
                this.keterangan = "KURANG";
                break;
            case "E":
                this.keterangan = "KURANG SEKALI";
                break;
        }
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public String getGrade() {
        return grade;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
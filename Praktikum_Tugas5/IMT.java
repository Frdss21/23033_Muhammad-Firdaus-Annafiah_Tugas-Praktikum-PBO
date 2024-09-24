package Praktikum_Tugas5;

public class IMT {
    private double beratBadan;
    private double tinggiBadan;
    private double nilaiIMT;
    private String kriteria;

    public IMT(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
        hitungIMT();
        tentukanKriteria();
    }

    private void hitungIMT() {
        this.nilaiIMT = beratBadan / (tinggiBadan * tinggiBadan);
    }

    private void tentukanKriteria() {
        if (nilaiIMT < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (nilaiIMT >= 18.5 && nilaiIMT <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (nilaiIMT >= 25 && nilaiIMT <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (nilaiIMT >= 30 && nilaiIMT <= 39.9) {
            kriteria = "Gemuk";
        } else if (nilaiIMT >= 40) {
            kriteria = "Sangat Gemuk";
        }
    }

    public double getNilaiIMT() {
        return nilaiIMT;
    }

    public String getKriteria() {
        return kriteria;
    }
}
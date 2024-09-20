package Praktikum_Tugas4;

public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    double hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}
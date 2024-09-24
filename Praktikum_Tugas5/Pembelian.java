package Praktikum_Tugas5;

public class Pembelian {
    private double totalPembelian;
    private double potongan;
    private double totalBayar;

    public Pembelian(double totalPembelian) {
        this.totalPembelian = totalPembelian;
        hitungPotongan();
        hitungTotalBayar();
    }

    private void hitungPotongan() {
        if (totalPembelian >= 50000) {
            potongan = 0.2 * totalPembelian;
        } else {
            potongan = 0.05 * totalPembelian;
        }
    }

    private void hitungTotalBayar() {
        totalBayar = totalPembelian - potongan;
    }

    public double getTotalPembelian() {
        return totalPembelian;
    }

    public double getPotongan() {
        return potongan;
    }

    public double getTotalBayar() {
        return totalBayar;
    }
}
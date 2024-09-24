package Praktikum_Tugas5;

import java.util.Scanner;

public class PembelianMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = scanner.nextDouble();

        Pembelian pembelian = new Pembelian(totalPembelian);

        System.out.println("\nHasil:");
        System.out.println("Total pembelian Rp. = " + pembelian.getTotalPembelian());
        System.out.println("Besarnya potongan Rp. = " + pembelian.getPotongan());
        System.out.println("Jumlah yang harus dibayarkan Rp. = " + pembelian.getTotalBayar());

        scanner.close();
    }
}
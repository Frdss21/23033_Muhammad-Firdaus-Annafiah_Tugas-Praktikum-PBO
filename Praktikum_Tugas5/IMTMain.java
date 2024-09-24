package Praktikum_Tugas5;

import java.util.Scanner;

public class IMTMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();
        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggiBadan = scanner.nextDouble();

        IMT imt = new IMT(beratBadan, tinggiBadan);

        System.out.println("\nHasil:");
        System.out.println("Nilai IMT: " + imt.getNilaiIMT());
        System.out.println("Kriteria: " + imt.getKriteria());

        scanner.close();
    }
}
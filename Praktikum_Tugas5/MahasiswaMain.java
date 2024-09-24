package Praktikum_Tugas5;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NPM: ");
        String npm = scanner.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = scanner.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        Mahasiswa mahasiswa = new Mahasiswa(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);

        System.out.println("\nHasil:");
        System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("Nilai Rata-rata: " + mahasiswa.getNilaiAkhir());
        System.out.println("Grade: " + mahasiswa.getGrade());
        System.out.println("Keterangan: " + mahasiswa.getKeterangan());

        scanner.close();
    }
}
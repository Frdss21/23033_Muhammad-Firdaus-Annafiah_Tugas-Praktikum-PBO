package Praktikum_Tugas7;

import java.util.ArrayList;
import java.util.Scanner;

public class TokoSerbaAda {
    private ArrayList<Item> daftarBarang;
    private int totalBayar;

    public TokoSerbaAda() {
        daftarBarang = new ArrayList<>();
        // Tambahkan daftar 10 barang berdasarkan kode, nama, dan harga
        daftarBarang.add(new Item("01", "Beras", 10000));
        daftarBarang.add(new Item("02", "Minyak", 15000));
        daftarBarang.add(new Item("03", "Telur", 2000));
        daftarBarang.add(new Item("04", "Gula", 5000));
        daftarBarang.add(new Item("05", "Garam", 2500));
        daftarBarang.add(new Item("06", "Tepung", 4000));
        daftarBarang.add(new Item("07", "Mie", 3000));
        daftarBarang.add(new Item("08", "Sabun", 6000));
        daftarBarang.add(new Item("09", "Sampo", 1500));
        daftarBarang.add(new Item("10", "Kopi", 7000));
        totalBayar = 0;
    }

    // Menampilkan daftar barang
    public void tampilkanDaftarBarang() {
        System.out.println("\nDaftar Barang yang Tersedia:");
        System.out.println("========================================");
        System.out.println("Kode Barang  Nama Barang    Harga (Rp)");
        System.out.println("========================================");

        for (Item item : daftarBarang) {
            System.out.printf("%-12s %-12s %-6d\n", item.getKode(), item.getNama(), item.getHarga());
        }
        System.out.println("========================================");
    }

    public void masukkanData() {
        Scanner scanner = new Scanner(System.in);

        // Tampilkan daftar barang sebelum input
        tampilkanDaftarBarang();

        System.out.print("Masukkan Item Barang: ");
        int jumlahBarang = scanner.nextInt();

        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.println("Data ke " + i);

            System.out.print("Masukkan Kode Barang: ");
            String kode = scanner.next();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Cari barang berdasarkan kode
            Item item = cariBarangBerdasarkanKode(kode);
            if (item != null) {
                item.setJumlahBeli(jumlahBeli);
                totalBayar += item.getTotalHarga();
            } else {
                System.out.println("Kode barang tidak ditemukan.");
            }
        }
    }

    private Item cariBarangBerdasarkanKode(String kode) {
        for (Item item : daftarBarang) {
            if (item.getKode().equals(kode)) {
                return item;
            }
        }
        return null;
    }

    public void tampilkanStruk() {
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("******************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");

        int no = 1;
        for (Item item : daftarBarang) {
            if (item.getJumlahBeli() > 0) {
                System.out.printf("%-3d %-12s %-12s %-6d %-12d %-12d\n",
                        no, item.getKode(), item.getNama(), item.getHarga(),
                        item.getJumlahBeli(), item.getTotalHarga());
                no++;
            }
        }

        System.out.println("==============================================================");
        System.out.println("Total Bayar: " + totalBayar);
    }

    public static void main(String[] args) {
        TokoSerbaAda toko = new TokoSerbaAda();
        toko.masukkanData();
        toko.tampilkanStruk();
    }
}
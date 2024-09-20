package Praktikum_Tugas4;

public class BangunRuangMain {
    public static void main(String[] args) {
        // Membuat objek Balok
        Balok balok = new Balok(9, 3, 5);
        System.out.println("Balok:");
        System.out.println("Volume: " + balok.hitungVolume());
        System.out.println("Luas Permukaan: " + balok.hitungLuasPermukaan());

        // Membuat objek Kubus
        Kubus kubus = new Kubus(5);
        System.out.println("\nKubus:");
        System.out.println("Volume: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan());
    }
}
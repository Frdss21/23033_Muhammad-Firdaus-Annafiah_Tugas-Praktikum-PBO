package Praktikum_Tugas3;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 matematika2 = new Matematika2();

        System.out.println("Hasil Penjumlahan: " + matematika2.tambah(15, 8));
        System.out.println("Hasil Pengurangan: " + matematika2.kurang(20, 7));
        System.out.println("Hasil Perkalian: " + matematika2.kali(9, 6));
        System.out.println("Hasil Pembagian: " + matematika2.bagi(18, 3));
        System.out.println("Hasil Modulus: " + matematika2.modulus(14, 5));
    }
}
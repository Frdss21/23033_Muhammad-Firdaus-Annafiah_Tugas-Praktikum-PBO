package Praktikum_Tugas2;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        int hasilTambah = matematika.pertambahan(20, 10);
        int hasilKurang = matematika.pengurangan(10, 5);
        int hasilKali = matematika.perkalian(10, 3);
        int hasilBagi = matematika.pembagian(21, 2);

        System.out.println("Pertambahan : 20 + 10 = " + hasilTambah);
        System.out.println("Pengurangan : 10 - 5 = " + hasilKurang);
        System.out.println("Perkalian : 10 * 3 = " + hasilKali);
        System.out.println("Pembagian : 21 / 2 = " + hasilBagi);
    }
}

package Praktikum_Tugas6;

public class LaguAnakAyam {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Lagu Anak Ayam Turun " + n + ":");
        while (n > 0) {
            System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            n--;
        }
    }
}
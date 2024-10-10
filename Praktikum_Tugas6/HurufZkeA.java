package Praktikum_Tugas6;

public class HurufZkeA {
    public static void main(String[] args) {
        System.out.println("Huruf dari Z ke A:");
        char huruf = 'Z';
        do {
            System.out.print(huruf + " ");
            huruf--;
        } while (huruf >= 'A');
        System.out.println();
    }
}
package Praktikum_Tugas6;

public class GanjilGenap {
    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil dan Genap dari 0-20:");
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
            i++;
        }
    }
}
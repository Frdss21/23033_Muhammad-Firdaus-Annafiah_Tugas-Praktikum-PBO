package Praktikum_Tugas1;

public class DemoNilai {
    public static void main(String[] args) {
        // Membuat objek Nilai dengan data yang diberikan
        Nilai mahasiswa1 = new Nilai("2310631170033", "Muhammad Firdaus Annafiah", 90, 82, 87, 85);

        // Memanggil metode cetakNilai untuk menampilkan data mahasiswa
        mahasiswa1.cetakNilai();
    }
}


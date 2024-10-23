package Praktikum_Tugas8;

import java.time.YearMonth;

public class HitungHari {

    public int hitung(int tahun, int bulan) {
        YearMonth yearMonth = YearMonth.of(tahun, bulan);
        return yearMonth.lengthOfMonth();
    }
}
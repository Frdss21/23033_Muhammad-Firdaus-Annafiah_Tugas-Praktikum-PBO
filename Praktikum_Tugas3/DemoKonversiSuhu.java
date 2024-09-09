package Praktikum_Tugas3;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu suhu1 = new KonversiSuhu();
        KonversiSuhu2 suhu2 = new KonversiSuhu2();

        double celsius = 40.0;

        System.out.println("Celsius to Fahrenheit: " + suhu1.celciusToFahrenheit(celsius));
        System.out.println("Celsius to Reamur: " + suhu1.celciusToReamur(celsius));

        double fahrenheit = suhu1.celciusToFahrenheit(celsius);

        System.out.println("Fahrenheit to Reamur: " + suhu2.fahrenheitToReamur(fahrenheit));
    }
}
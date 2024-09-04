package Praktikum_Tugas2;

public class BingoSong {
    private final String[] lyrics;

    public BingoSong() {
        lyrics = new String[] {
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "And Bingo was his name-o", 

        };
    }

    public void printLyrics() {
        for (String line : lyrics) {
            System.out.println(line);
        }

        // Add code to print the claps and the remaining letters as needed
    }
}

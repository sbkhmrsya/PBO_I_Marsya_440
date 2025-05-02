package Perpustakaan;

public class Fiksi extends Buku {

    private String genre;

    public Fiksi(String judul, String penulis, String Genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Buku Fiksi: " + judul + " oleh " + penulis + " (Genre: " + genre + ")");
    }
}


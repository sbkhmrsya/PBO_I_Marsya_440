package Perpustakaan;

public class Nonfiksi extends Buku{
        private String bidang;
        public Nonfiksi(String judul, String penulis, String bidang) {
            super(judul, penulis);
            this.bidang = bidang;
        }

        @Override
        public void DisplayInfo() {
            System.out.println("Buku NonFiksi: " + judul + " oleh " + penulis + " (Bidang: " + bidang + ")");
        }
    }



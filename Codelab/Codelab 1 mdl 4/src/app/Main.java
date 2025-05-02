package app;

import Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Nonfiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
         Buku Buku2 = new Fiksi("Dikta dan Hukum", "Dhia'an", "Romantis");

        buku1.DisplayInfo();
        Buku2.DisplayInfo();

        System.out.println();

        Anggota anggota1 = new Anggota("Marsya", "I440");
        Anggota anggota2 = new Anggota("Atun", "I429");

        anggota1.DisplayInfo();
        anggota2.DisplayInfo();

        System.out.println();

        anggota1.pinjamBuku("Dikta Dan Hukum");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        System.out.println();

        anggota1.kembalikanBuku("Dikta dan Hukum");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}
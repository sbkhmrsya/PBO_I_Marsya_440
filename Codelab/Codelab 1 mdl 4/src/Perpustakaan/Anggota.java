package Perpustakaan;

public class Anggota implements Peminjaman {
    private String Nama;
    private String nomorAnggota;

    public Anggota (String Nama, String nomorAnggota) {
        this.Nama = Nama;
        this.nomorAnggota = nomorAnggota;


    }
    public void DisplayInfo(){
        System.out.println("Anggota : " + Nama + "ID :" + nomorAnggota);
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println(Nama + " meminjam buku berjudul: " + judul);
    }


    public void pinjamBuku(String judul, int durasi) {
        System.out.println(Nama + " Meminjam buku \"" + judul + "\" selama " + durasi + " hari.");
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(Nama + " Mengembalikan buku berjudul: " + judul);
    }




}

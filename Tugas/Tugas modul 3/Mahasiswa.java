public class Mahasiswa extends User {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Login Mahasiswa berhasil. Selamat datang, " + getNama());
    }
}

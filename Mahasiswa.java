public class Mahasiswa {
    private String[][] dataMahasiswa = {
            {"Marsya", "202410370110440"},

    };

    public boolean login(String nama, String nim) {
        for (String[] mahasiswa : dataMahasiswa) {
            if (mahasiswa[0].equals(nama) && mahasiswa[1].equals(nim)) {
                System.out.println("Login Mahasiswa berhasi");
                displayInfo(mahasiswa);
                return true;
            }
        }
        System.out.println("Login Mahasiswa gagal!! Nama atau NIM anda salah .");
        return false;
    }

    public void displayInfo(String[] mahasiswa) {
        System.out.println(" Informasi Mahasiswa ");
        System.out.println("Nama: " + mahasiswa[0]);
        System.out.println("NIM : " + mahasiswa[1]);
    }
}

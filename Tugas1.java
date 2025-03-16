import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Jenis : ");
        System.out.println("1.Admin");
        System.out.println("2.Mahasiswa");
        System.out.print("Masukkan pilihan 1/2 : ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan Username : ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password : ");
            String password = scanner.nextLine();

            String validUsername = "marsya440";
            String validPassword = "marsya440";

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Login Admin berhasil!!!!");
            } else {
                System.out.println("Login Gagal!!");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            String validNama = "Sabiikha Marsya Ananda";
            String validNIM = "202410370110440";

            if (nama.equals(validNama) && nim.equals(validNIM)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }


}


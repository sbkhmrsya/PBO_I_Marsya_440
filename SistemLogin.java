 import java.util.Scanner;

public class SistemLogin{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Admin admin = new Admin();
            Mahasiswa mahasiswa = new Mahasiswa();

            System.out.println(" Pilih Sistem Login ");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.print("Pilih menu (1/2): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();
                admin.login(username, password);
            } else if (pilihan == 2) {
                System.out.print("Masukkan nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();
                mahasiswa.login(nama, nim);
            } else {
                System.out.println(" Pilihan tidak valid!");
            }


        }

}

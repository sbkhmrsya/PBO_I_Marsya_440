public class Admin {
    private String Username = "DY";
    private String password = "doyoung12";

    public void login(String Username, String Password) {
        if (Username.equals(Username) && Password.equals(Password)) {
            System.out.println("Login Admin Berhasil");
        } else {
            System.out.println("Login Admin gagal username atau password anda salah ");

        }
    }
}

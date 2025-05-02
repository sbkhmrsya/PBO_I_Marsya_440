public class main {
    public static void main(String[] args) {

        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.Nama = "Kucing";
        hewan1.Suara ="Meong";
        hewan1.Jenis = "Mamalia";
        hewan2.Nama = "Anjing";
        hewan2.Suara ="Guk Guk";
        hewan2.Jenis = "Mamalia";

        hewan1.Tampilkan();
        hewan2.Tampilkan();
    }
}
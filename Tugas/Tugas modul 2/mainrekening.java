public class mainrekening {
    public static void main(String[] args) {
        Rekening rekening1 = new Rekening();
        Rekening rekening2 = new Rekening();

        rekening1.nomorRekening = "202410370110440";
        rekening1.namaPemilik = "Sabiikha Marsya Ananda";
        rekening1.saldo = 5000000;
        rekening2.nomorRekening = "092024010285";
        rekening2.namaPemilik = "Sahrul Ramadhan";
        rekening2.saldo = 1000000;

        rekening1.Tampilkan();
        rekening2.Tampilkan();


        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        rekening1.tarikuang(8000000);
        rekening2.tarikuang(2500000);

        System.out.println();
        rekening1.Tampilkan();
        rekening2.Tampilkan();
    }
}




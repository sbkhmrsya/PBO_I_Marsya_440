public class Rekening {

    String nomorRekening;
    String namaPemilik;
    double saldo;

    public void Tampilkan(){
        System.out.println("Nomor Rekening :" + nomorRekening);
        System.out.println("Nama Pemilik   :" + namaPemilik);
        System.out.println("Saldo          : Rp" + saldo);
        System.out.println();

    }

    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println("Jumlah setoran harus lebih dari 0.");
        }

    }

    public void tarikuang(double jumlah){
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + "menarik Rp " + jumlah + "(berhasil) Saldo sekarang : Rp " + saldo);
        } else if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else {
            System.out.println("Jumlah penarikan harus lebih dari 0.");



        }
    }

}

package utspbo;
public class Bus {
    private int jumlahPenumpang;

    public Bus(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public void turun(int jumlahTurun) {
        this.jumlahPenumpang -= jumlahTurun;
    }

    public void naik(int jumlahNaik) {
        this.jumlahPenumpang += jumlahNaik;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }
}
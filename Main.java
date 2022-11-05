public class Main {
    public static void main(String[] args) {
        Penyewa penyewa = new Penyewa();
        mobil mobil = new mobil();
        sewa sewa = new sewa();
        notadp notadp = new notadp();
        kembali kembali = new kembali();
        notakembali notakembali = new notakembali();



        penyewa.output();
        mobil.output();
        sewa.output();
        notadp.output();
        kembali.output();
        notakembali.output();
    }
}
import java.util.Scanner;

public class kembali {
    private int tgl_kembali;
    private int tgl_sewa;
    private int no_kwitansi;

    public void setTgl_kembali(int tgl_kembali){
        this.tgl_kembali = tgl_kembali;
    }

    public void setTgl_sewa(int tgl_sewa){
        this.tgl_sewa = tgl_sewa;
    }

    public void setNo_kwitansi(int no_kwitansi){
        this.no_kwitansi = no_kwitansi;
    }

    public int getTgl_kembali(){
        return tgl_kembali;
    }

    public int getTgl_sewa(){
        return tgl_sewa;
    }

    public int getNo_kwitansi(){
        return no_kwitansi;
    }

    public void output() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Tanggal Sewa : ");
        setTgl_sewa(userinput.nextInt());
        System.out.println("Masukkan tanggal Kembali: ");
        setTgl_kembali(userinput.nextInt());
        System.out.println("Masukkan No Kwitansi: ");
        setNo_kwitansi(userinput.nextInt());
        System.out.println("Tanggal Sewa " + this.tgl_sewa);
        System.out.println("Tanggal Kembali " + this.tgl_kembali);
        System.out.println("No Kwitansi " + this.no_kwitansi);
    }
}


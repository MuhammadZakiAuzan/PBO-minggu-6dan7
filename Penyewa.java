import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Penyewa extends mobil {
    private int id_penyewa;
    private String nama_penyewa;
    private int telp;
    private String alamat;
    public void setId_penyewa(int id_penyewa){
        this.id_penyewa = id_penyewa;
    }

    public void setNama_penyewa(String nama_penyewa){
        this.nama_penyewa = nama_penyewa;
    }

    public void setTelp(int telp){
        this.telp = telp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void output() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("silahkan isi ID Penyewa: ");
        setId_penyewa(userinput.nextInt());
        System.out.println("silahkan isi Nama penyewa: ");
        setNama_penyewa(userinput.next());
        System.out.println("silahkan isi No Telepon Penyewa: ");
        setTelp(userinput.nextInt());
        System.out.println("silahkan isi Alamat Penyewa: ");
        setAlamat(userinput.next());
        System.out.println("ID Penyewa " + this.id_penyewa);
        System.out.println("Nama Penyewa " + this.nama_penyewa);
        System.out.println("Alamat Penyewa " + this.alamat);
        System.out.println("No Telpon Penyewa " + this.telp);
    }
}

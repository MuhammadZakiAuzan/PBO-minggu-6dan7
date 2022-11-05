import java.util.Scanner;

public class sewa {
    private int biaya_sewa;
    private int tanggal_mulai;
    private int tanggal_selesai;

    public void setBiaya_sewa(int biaya_sewa){
        this.biaya_sewa = biaya_sewa;
    }

    public void setTanggal_mulai(int tanggal_mulai){
        this.tanggal_mulai = tanggal_mulai;
    }

    public void setTanggal_selesai(int tanggal_selesai){
        this.tanggal_selesai = tanggal_selesai;
    }

    public int getBiaya_sewa(){
        return biaya_sewa;
    }

    public int getTanggal_mulai(){
        return tanggal_mulai;
    }

    public int getTanggal_selesai(){
        return tanggal_selesai;
    }

    public void output() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Biaya Sewa /hari : ");
        setBiaya_sewa(userinput.nextInt());
        System.out.println("Tanggal Mulai: ");
        setTanggal_mulai(userinput.nextInt());
        System.out.println("tanggal selesai : ");
        setTanggal_selesai(userinput.nextInt());
        System.out.println("Biaya Sewa/hari " + this.biaya_sewa);
        System.out.println("Tanggal Mulai " + this.tanggal_mulai);
        System.out.println("Tanggal Selesai " + this.tanggal_selesai);
    }
}

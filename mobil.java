import java.util.Scanner;

public class mobil {
    private int id_mobil;
    private String jenis_mobil;
    private int harga;

    public void setId_mobil(int id_mobil){
        this.id_mobil = id_mobil;
    }

    public void setJenis_mobil(String jenis_mobil){
        this.jenis_mobil= jenis_mobil;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void output() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan ID mobil: ");
        setId_mobil(userinput.nextInt());
        System.out.println("Masukkan Jenis mobil: ");
        setJenis_mobil(userinput.next());
        System.out.println("Masukkan Harga: ");
        setHarga(userinput.nextInt());
        System.out.println("ID mobil " + this.id_mobil);
        System.out.println("Jenis mobil " + this.jenis_mobil);
        System.out.println("Harga " + this.harga);
    }
}

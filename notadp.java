import java.util.Scanner;

public class notadp {
    private int no_notadp;
    private int tgl_sewa;
    private int total;

    public void setNo_notadp(int no_notadp){
        this.no_notadp = no_notadp;
    }

    public void setTgl_sewa(int tgl_sewa){
        this.tgl_sewa = tgl_sewa;
    }

    public void setTotal(int total){
        this.total = total;
    }

    public int getNo_notasewa(){
        return no_notadp;
    }

    public int getTgl_sewa(){
        return tgl_sewa;
    }

    public int getTotal(){
        return total;
    }

    public void output() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan No notadp : ");
        setNo_notadp(userinput.nextInt());
        System.out.println("Masukkan tanggal Sewa: ");
        setTgl_sewa(userinput.nextInt());
        System.out.println("Masukkan Total: ");
        setTgl_sewa(userinput.nextInt());
        System.out.println("No nota kembali " + this.no_notadp);
        System.out.println("Tgl nota kembali " + this.tgl_sewa);
        System.out.println("Tgl nota kembali " + this.total);
    }
}

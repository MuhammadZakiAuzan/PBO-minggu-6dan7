import java.util.Scanner;

public class notakembali {
    private int no_notakembali;
    private int tgl_notakembali;
    public void setNo_notakembali(int no_notakembali){
        this.no_notakembali = no_notakembali;
    }

    public void setTgl_notakembali(int tgl_notakembali){
        this.tgl_notakembali = tgl_notakembali;
    }

    public int getNo_notakembali(){
        return no_notakembali;
    }



    public void output() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan No nota Kembali: ");
        setNo_notakembali(userinput.nextInt());
        System.out.println("Masukkan tanggal nota Kembali: ");
        setTgl_notakembali(userinput.nextInt());
        System.out.println("No nota Kembali " + this.no_notakembali);
        System.out.println("Tgl nota Kembali " + this.tgl_notakembali);
    }



}


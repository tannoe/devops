package app;
import java.io.Console;
public class App {
    public static void main(String[] args) {

        String nama,tpt;
        int usia;

        Console con = System.console();

        System.out.print("Inputkan nama: ");
        nama = con.readLine();
        System.out.print("Inputkan usia: ");
<<<<<<< HEAD
        usia = Integer.parseInt(con.readLine());
=======
        usia = 20;
	System.out.print("Inputkan tempat tinggal: ");
	tpt = vilper;
>>>>>>> fe278c1d8a4e1fdee602ab7f2804d76086d3543e
        
        System.out.println("Nama kamu adalah: " + nama);
        System.out.println("Saat ini berusia " + usia + " tahun");
	System.out.print("Bertempat tinggal: " + tpt);
    }
}

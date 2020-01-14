package app;
import java.io.Console;
public class App {
    public static void main(String[] args) {

        String nama,tpt;
        int usia;

        Console con = System.console();

        System.out.print("Inputkan nama: ");
        nama = "nagi";
        System.out.print("Inputkan usia: ");
        usia = 20;
	    System.out.print("Inputkan tempat tinggal: ");
	    tpt = "vilper";

        
        System.out.println("Nama kamu adalah: " + nama);
        System.out.println("Saat ini berusia " + usia + " tahun");
	    System.out.print("Bertempat tinggal: " + tpt);
    }
}

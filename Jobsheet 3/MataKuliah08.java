import java.util.Scanner;

public class MataKuliah08 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah08(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Scanner sc) {
        System.out.print("----- TAMBAH DATA -----\n");
        System.out.print("Kode: ");
        kode = sc.nextLine();
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("SKS: ");
        sks = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Jumlah jam: ");
        jumlahJam = sc.nextInt();
        sc.nextLine(); 
    }

    public void cetakInfo() {
        System.out.println("\n-------- DATA MATA KULIAH --------");
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("-----------------------");
    }
}

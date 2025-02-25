import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        System.out.println();
        sc.nextLine(); 
        Dosen08[] arrayOfDosen08 = new Dosen08[jumlahDosen];

        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < arrayOfDosen08.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true untuk Pria, false untuk Wanita): ");
            boolean jenisKelamin = sc.nextBoolean();
            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            arrayOfDosen08[i] = new Dosen08(kode, nama, jenisKelamin, usia);
            System.out.println("----------------------------------------------------------");
        }
        sc.close();
        System.out.println();

        DataDosen08 dataDosen = new DataDosen08();
        
        System.out.println("----------------------- DATA DOSEN -----------------------");
        dataDosen.dataSemuaDosen(arrayOfDosen08);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen08);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen08);
        dataDosen.infoDosenPalingTua(arrayOfDosen08);
        dataDosen.infoDosenPalingMuda(arrayOfDosen08);

        sc.close();
    }
}
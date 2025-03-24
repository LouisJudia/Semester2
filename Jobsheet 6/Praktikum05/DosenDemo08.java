import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen08 dataDosen = new DataDosen08();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan Data Dosen termuda ke Dosen tertua (ASC)");
            System.out.println("4. Urutkan Data Dosen tertua ke dosen termuda (DESC)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine(); 
                    System.out.print("Nama: ");
                    String nama = sc.nextLine(); 
                    System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
                    boolean jenisKelamin = sc.nextBoolean(); 
                    System.out.print("Usia: ");
                    int usia = sc.nextInt(); 
                    sc.nextLine(); 

                    Dosen08 dosen = new Dosen08(kode, nama, jenisKelamin, usia);
                    dataDosen.tambah(dosen);
                    break;

                case 2:
                    System.out.println("Data Dosen:");
                    dataDosen.tampil();
                    break;

                case 3:
                    dataDosen.sortingASC();
                    System.out.println("Data Dosen setelah diurutkan (ASC):");
                    dataDosen.tampil();
                    break;

                case 4:
                    dataDosen.sortingDSC();
                    System.out.println("Data Dosen setelah diurutkan (DESC):");
                    dataDosen.tampil();
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
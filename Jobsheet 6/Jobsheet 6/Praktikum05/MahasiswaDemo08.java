import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("------------------------");

            Mahasiswa08 mhs = new Mahasiswa08(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        //System.out.println("Data mahasiswa sebelum sorting:");
        //list.tampil();

        //System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC):");
        //list.bubbleSort();
        //list.tampil();

        //System.out.println("Data yang usdah terurut menggunkan SELECTION SORT (ASC)");
        //list.selectionSort();
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunkan INSERTION SORT (DESC)");
        //list.insertionSort();
        //list.tampil();

        
        list.tampil();
        //melakukan pencarian data sequential
        //System.out.println("-----------------------------------------------------");
        //System.out.println("Pencarian data");
        //System.out.println("-----------------------------------------------------");
        //System.out.println("masukkan ipk mahasiswa yang dicari: ");
        //System.out.print("IPK : ");
        //double cari = sc.nextDouble();11
        //sc.nextLine();

        //System.out.println("menggunakan sequential searching");
        //double posisi = list.sequentialSearching(cari);
        //int pss = (int) posisi;
        //list.tampilPosisi(cari, pss);
        //list.tampilDataSearch(cari, pss);

        //melakukan pencarian data Binary
        System.out.println("-----------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();
        sc.nextLine();
        System.out.println("menggunakan binary search");
        double posisi2 = list.findBinarySearch(cari,0,jumMhs);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        
        sc.close();
    }
}
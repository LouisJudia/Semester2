import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();


        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            System.out.print("Kelas: ");
            String kelas = sc.next();
            System.out.println("------------------------");

            Mahasiswa08 mhs = new Mahasiswa08(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang usdah terurut menggunkan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunkan INSERTION SORT (DESC)");
        list.insertionSort();
        list.tampil();
    }
}
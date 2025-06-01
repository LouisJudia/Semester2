package Pertemuan12;

import java.util.Scanner;

public class TugasMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList08 antrian = new QueueLinkedList08();
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Lihat Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    antrian.enqueue(new MhsTugas08(nim, nama));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.printQueue();
                    break;
                case 6:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getSize());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
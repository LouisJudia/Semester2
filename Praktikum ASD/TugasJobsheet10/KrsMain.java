package TugasJobsheet10;

import java.util.Scanner;
public class KrsMain {
    public static void main(String[] args) {
        AntiranKrs antrianKRS = new AntiranKrs();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Proses KRS");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Tampilkan 2 Terdepan");
            System.out.println("7. Tampilkan Mahasiswa Paling Akhir");
            System.out.println("8. Cetak Jumlah Antrian");
            System.out.println("9. Cetak Jumlah yang Sudah Diproses");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    if (!antrianKRS.isFull()) {
                        System.out.print("Nama Mahasiswa: ");
                        String nama = scanner.nextLine();
                        System.out.print("NIM Mahasiswa: ");
                        String nim = scanner.nextLine();
                        antrianKRS.tambahAntrian(new Mahasiswa(nama, nim));
                    } else {
                        System.out.println("Antrian sudah penuh.");
                    }
                    break;

                case 2:
                    antrianKRS.prosesAntrian();
                    break;

                case 3:
                    System.out.println("Antrian kosong: " + antrianKRS.isEmpty());
                    break;

                case 4:
                    System.out.println("Antrian penuh: " + antrianKRS.isFull());
                    break;

                case 5:
                    antrianKRS.tampilkanSemua();
                    break;

                case 6:
                    antrianKRS.tampilkanDuaTerdepan();
                    break;

                case 7:
                    antrianKRS.tampilkanAkhir();
                    break;

                case 8:
                    antrianKRS.cetakJumlahAntrian();
                    break;

                case 9:
                    antrianKRS.cetakJumlahDiproses();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        
        scanner.close();
    }
}
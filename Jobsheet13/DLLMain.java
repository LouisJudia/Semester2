import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedLists list = new DoubleLinkedLists();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah setelah NIM tertentu");
            System.out.println("8. Hapus setelah NIM tertentu");
            System.out.println("9. Tambah di indeks tertentu");
            System.out.println("10. Hapus setelah NIM tertentu");
            System.out.println("11. Hapus di indeks tertentu");
            System.out.println("12. Tampilkan jumlah data dalam linked list");
            System.out.println("13. Tampilkan data pertama, terakhir, atau indeks tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node01 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang akan disisipkan setelahnya: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhs);
                }
                case 8 -> {
                    System.out.print("Masukkan NIM yang akan dihapus setelahnya: ");
                    String keyNim = scan.nextLine();
                    list.removeAfter(keyNim);
                }
                case 9 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.add(mhs, index);
                }
                case 10 -> {
                    System.out.print("Masukkan NIM yang akan dihapus setelahnya: ");
                    String keyNim = scan.nextLine();
                    list.removeAfter(keyNim);
                }
                case 11 -> {
                    System.out.print("Masukkan indeks yang akan dihapus: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                }
                case 12 -> System.out.println("Jumlah data dalam linked list: " + list.size());
                case 13 -> {
                    System.out.println("1. Get First");
                    System.out.println("2. Get Last");
                    System.out.println("3. Get by Index");
                    System.out.print("Pilih opsi: ");
                    int pilihan2 = scan.nextInt();
                    scan.nextLine();

                    switch (pilihan2) {
                        case 1 -> System.out.println("Data pertama: " + list.getFirst().nama);
                        case 2 -> System.out.println("Data terakhir: " + list.getLast().nama);
                        case 3 -> {
                            System.out.print("Masukkan indeks: ");
                            int index = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Data di indeks " + index + ": " + list.getIndex(index).nama);
                        }
                        default -> System.out.println("Pilihan tidak valid!");
                    }
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }

    public static Mahasiswa01 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
}

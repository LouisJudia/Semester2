import java.util.Scanner;

public class SuratDemo08 {
  public static void main(String[] args) {
    Scanner scan08 = new Scanner(System.in);
    int pilih; 

    StackSurat08 stack = new StackSurat08(5);

    do {
      System.out.println("\nMenu:");
      System.out.println("1. Terima Surat Izin");
      System.out.println("2. Proses Surat Izin");
      System.out.println("3. Lihat Surat Izin Terakhir");
      System.out.println("4. Cari Surat");
      System.out.print("Pilih: ");
      pilih = scan08.nextInt();
      scan08.nextLine();

      switch (pilih) {
        case 1:
          System.out.print("Nama Mahasiswa: ");
          String nama = scan08.nextLine();
          System.out.print("Id Surat: ");
          String idSurat = scan08.nextLine();
          System.out.print("Kelas: ");
          String kelas = scan08.nextLine();
          Surat08 surat = new Surat08(idSurat, nama, kelas);
          stack.push(surat);
          break;
        case 2:
          Surat08 prosesSurat = stack.pop();
          if (prosesSurat != null) {
            System.out.println("Memproses surat dari " + prosesSurat.namaMahasiswa);
            System.out.print("Masukkan jenis izin: ");
            char jenisIzin = scan08.nextLine().charAt(0);
            System.out.print("Masukkan durasi izin: ");
            int durasi = scan08.nextInt();
            prosesSurat.isiSurat(jenisIzin, durasi);
          }
          break;
        case 3:
          Surat08 lihat = stack.peek();
          if (lihat != null) {
            System.out.println("Surat terakhir:");
            System.out.println("Id Surat: " + lihat.idSurat);
            System.out.println("Nama Mahasiswa: " + lihat.namaMahasiswa);
            System.out.println("Kelas: " + lihat.kelas);
          }
          break;
        case 4:
          System.out.print("Masukkan nama mahasiswa: ");
          String namaDicari = scan08.nextLine();
          boolean cariMhs = stack.cariSurat(namaDicari);
          if (cariMhs) {
            System.out.println("Surat ditemukan.");
          } else {
            System.out.println("Surat tidak ditemukan.");
          }
          break;
        default:
          System.out.println("Pilihan tidak valid.");
      }

    } while (pilih >= 1 && pilih <= 4);

  }
}
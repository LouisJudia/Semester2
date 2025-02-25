import java.util.Scanner;

public class MataKuliahDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kulias : ");
        int jumlahmatkul = sc.nextInt();
        MataKuliah08[] arrayOfMatakuliah = new MataKuliah08[jumlahmatkul];

        String kode = "", nama = "";
        int sks = 0, jumlahJam = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah08(kode, nama, sks, jumlahJam);
            arrayOfMatakuliah[i].tambahData(sc);
            System.out.println("-----------------------");

        }
        
        for (int i = 0; i < 3; i++) { 
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}

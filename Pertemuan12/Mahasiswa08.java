package Pertemuan12;

public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa08() {
    }

    public Mahasiswa08(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
public class MahasiswaMain08 {
    public static void main(String[] args) {
        Mahasiswa08 mhs1 = new Mahasiswa08();
        mhs1.nama = "Muhammdad Ali farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa08 mhs2 = new Mahasiswa08("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa08 mhsLouis = new Mahasiswa08 ("Louis Judia B. Sinaga", "244107020071", 3.88, "TI 1F");
        mhsLouis.tampilkanInformasi();
    }
}

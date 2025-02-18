public class DosenMain08 {
    public static void main(String[] args) {
        Dosen dsn1 = new Dosen("111", "Bu Vivin", true, 2011, "Algotitma");
        Dosen dsn2 = new Dosen("222", "Pak Hasyim", false, 2014, "CTPS");
        System.out.println("========== Data Dosen ==========");
        dsn1.tampilInformasi();
        System.out.println("Masa kerja Dosen 1: " + dsn1.hitungMasaKerja(2025) + " tahun");
        System.out.println("================================");

        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Basis Data");
        dsn2.tampilInformasi();
        System.out.println("Masa kerja Dosen 2: " + dsn2.hitungMasaKerja(2025) + " tahun");
        System.out.println("================================");

    }
}
public class Dosen08 {
    String kode;
    String nama;
    boolean jeniskelamin;
    int usia;

    public Dosen08(String kode, String nama, boolean jeniskelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.usia = usia;
    }

    public void tampilkanInfo() {
        String jk = jeniskelamin ? "Pria" : "Wanita";
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("Usia: " + usia);
        System.out.print("----------------------------------------------------------");
    }
}

class DataDosen08 {
    public void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        for (Dosen08 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
            System.out.println();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jeniskelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\n------------- JUMLAH DOSEN PER JENIS KELAMIN -------------");
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
        System.out.println("----------------------------------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;
        System.out.println("\n--------- RATA RATA USIA DOSEN PER JENIS KELAMIN ---------");
        
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jeniskelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        double rerataUsiaPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
        double rerataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria: " + rerataUsiaPria);
        System.out.println("Rata-rata Usia Dosen Wanita: " + rerataUsiaWanita);
        System.out.println("----------------------------------------------------------");
    }

    public void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        Dosen08 dosenTertua = arrayOfDosen[0];
       
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
       
        }

        System.out.println("\n-------------------- DOSEN PALING TUA --------------------");
        dosenTertua.tampilkanInfo();
    }

    public void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        Dosen08 dosenTermuda = arrayOfDosen[0];
        
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }=

        System.out.println("\n\n------------------- DOSEN PALING MUDA --------------------");
        dosenTermuda.tampilkanInfo();
    }
}


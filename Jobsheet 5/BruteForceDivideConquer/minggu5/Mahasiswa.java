public class Mahasiswa {
    String nama;
    String NIM;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa(String nama, String NIM, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    static int cariNilaiUTSTertinggi(Mahasiswa[] data, int l, int r) {
        if (l == r) {
            return data[l].nilaiUTS;
        }
        int tengah = (l + r) / 2;
        int maksl = cariNilaiUTSTertinggi(data, l, tengah);
        int maksr = cariNilaiUTSTertinggi(data, tengah + 1, r);
        if (maksl > maksr) {
            return maksl;
        } else {
            return maksr;
        }
    }

    static int cariNilaiUTSTerendah(Mahasiswa[] data, int l, int r) {
        if (l == r) {
            return data[l].nilaiUTS;
        }
        int tengah = (l + r) / 2;
        int minl = cariNilaiUTSTerendah(data, l, tengah);
        int minr = cariNilaiUTSTerendah(data, tengah + 1, r);
        if (minl < minr) {
            return minl;
        } else {
            return minr;
        }
    }

    static double hitungRataRataUAS(Mahasiswa[] data) {
        double total = 0;
        for (Mahasiswa mhs : data) {
            total += mhs.nilaiUAS;
        }
        return total / data.length;
    }
}

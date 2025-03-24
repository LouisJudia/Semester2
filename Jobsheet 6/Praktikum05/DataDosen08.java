public class DataDosen08 {
    Dosen08[] dataDosen = new Dosen08[10]; 
    int idx = 0; 

    // Method untuk menambahkan data dosen
    void tambah(Dosen08 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // Method untuk menampilkan semua data dosen
    void tampil() {
        for (int i = 0; i < idx; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            dataDosen[i].tampil();
        }
    }

    // Method untuk mengurutkan data dosen berdasarkan usia (ASC) menggunakan Bubble Sort
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen08 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    // Method untuk mengurutkan data dosen berdasarkan usia (DESC) menggunakan Selection Sort
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
                       Dosen08 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}
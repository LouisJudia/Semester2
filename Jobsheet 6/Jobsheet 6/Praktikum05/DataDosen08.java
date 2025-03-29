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
    
    // Method Sequential Search untuk mencari berdasarkan nama
    public int pencarianDataSequential08(String nama) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                count++;
            }
        }
        return count;
    }

    // Method Binary Search untuk mencari berdasarkan usia (harus diurutkan ASC terlebih dahulu)
    public int pencarianDataBinary08(int usia) {
        sortingASC(); // Pastikan data terurut ASC
        int left = 0;
        int right = idx - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (dataDosen[mid].usia == usia) {
                return mid;
            }
            
            if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    // Method untuk menampilkan hasil pencarian dengan peringatan duplikat
    public void tampilHasilPencarian08(String nama, int usia, boolean cariByNama) {
        if (cariByNama) {
            int jumlah = pencarianDataSequential08(nama);
            if (jumlah == 0) {
                System.out.println("Data tidak ditemukan");
            } else {
                if (jumlah > 1) {
                    System.out.println("Peringatan: Ditemukan " + jumlah + " data dengan nama " + nama);
                }
                for (int i = 0; i < idx; i++) {
                    if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                        dataDosen[i].tampil();
                    }
                }
            }
        } else {
            int pos = pencarianDataBinary08(usia);
            if (pos == -1) {
                System.out.println("Data tidak ditemukan");
            } else {
                int count = 1;
                for (int i = pos-1; i >= 0 && dataDosen[i].usia == usia; i--) count++;
                for (int i = pos+1; i < idx && dataDosen[i].usia == usia; i++) count++;
                
                if (count > 1) {
                    System.out.println("Peringatan: Ditemukan " + count + " data dengan usia " + usia);
                }
                for (int i = 0; i < idx; i++) {
                    if (dataDosen[i].usia == usia) {
                        dataDosen[i].tampil();
                    }
                }
            }
        }
    }
}       
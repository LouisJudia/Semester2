package TugasJobsheet10;

public class AntiranKrs {
    Mahasiswa[] antrian = new Mahasiswa[10];
    int front = 0;
    int rear = 0;
    int max = 10;
    int jumlahDiproses = 0;

    boolean isEmpty() {
        return front == rear;
    }

    boolean isFull() {
        return rear == max;
    }

    int size() {
        return rear - front;
    }

    void tambahAntrian(Mahasiswa mhs) {
        if (!isFull()) {
            antrian[rear] = mhs;
            rear++;
            System.out.println("Mahasiswa ditambahkan ke antrian.");
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    void prosesAntrian() {
        if (!isEmpty()) {
            for (int i = 0; i < 2; i++) {
                if (!isEmpty()) {
                    Mahasiswa mhs = antrian[front];
                    System.out.println("Memproses: " + mhs.print());
                    front++;
                    jumlahDiproses++;
                }
            }
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i = front; i < rear; i++) {
                System.out.println(antrian[i].print());
            }
        }
    }

    void tampilkanDuaTerdepan() {
        int sisa = size();
        if (sisa >= 2) {
            System.out.println("2 Mahasiswa terdepan:");
            System.out.println(antrian[front].print());
            System.out.println(antrian[front + 1].print());
        } else if (sisa == 1) {
            System.out.println("Mahasiswa terdepan:");
            System.out.println(antrian[front].print());
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    void tampilkanAkhir() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling akhir:");
            System.out.println(antrian[rear - 1].print());
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    void cetakJumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size());
    }

    void cetakJumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah diproses: " + jumlahDiproses);
    }
}
package P1Jobsheet10;
import java.util.Scanner;
public class QueueMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("0. Keluar");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);

        int pilih;
        do {
            menu();
            System.out.print("Pilihan Anda: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    if (Q.isFull()) {
                        System.out.println("Queue sudah penuh. Program berhenti.");
                        pilih = 0;
                        break;
                    }
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    if (Q.isEmpty()) {
                        System.out.println("Queue masih kosong. Program berhenti.");
                        pilih = 0;
                        break;
                    }
                    int dataKeluar = Q.dequeue();
                    System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
import java.util.Arrays;

public class BinarySearch08 {

  public static void main(String[] args) {
    System.out.println("\n---- Program Pencarian Data Menggunakan Algoritma Binary Search ----\n");

    int[] data = {20, 14, 34, -4, 16, 6, 22};
    int nilai = 20;

    System.out.print("Data sebelum diurutkan\t= " + Arrays.toString(data));
    bubbleSort(data);
    System.out.print("\nData setelah diurutkan\t= " + Arrays.toString(data));

    System.out.print("\nNilai yang dicari\t= " + nilai);
    System.out.print("\nHasil\t\t\t= ");

    int hasil = binarySearch(data, 0, data.length, nilai);

    if (hasil != -1) {
      System.out.print("Nilai ditemukan");
    } else {
      System.out.print("Nilai tidak ditemukan");
    }
  }

  static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j - 1] > arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  }

  static int binarySearch(int[] arr, int kiri, int kanan, int targetNilai) {
    if (kiri > kanan) {
      return -1;
    }

    int mid = (kiri + kanan) / 2;

    if (targetNilai == arr[mid]) {
      return mid;
    }

    if (targetNilai < arr[mid]) {
      return binarySearch(arr, kiri, mid - 1, targetNilai);
    }

    return binarySearch(arr, mid + 1, kanan, targetNilai);
  }

}
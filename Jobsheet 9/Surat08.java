public class Surat08 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;
  
    Surat08() {
  
    }
  
    Surat08(String idSurat, String namaMahasiswa, String kelas) {
      this.idSurat = idSurat;
      this.namaMahasiswa = namaMahasiswa;
      this.kelas = kelas;
    }
  
    void isiSurat(char jenisIzin, int durasi) {
      this.jenisIzin = jenisIzin;
      this.durasi = durasi;
    }
  }

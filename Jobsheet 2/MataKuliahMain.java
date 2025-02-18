public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("123", "Algoritma", 2, 4);
        MataKuliah mk2 = new MataKuliah("321", "Basis Data", 4, 6);
        
        System.out.println("======== MATA KULIAH ========");
        mk1.tampilInformasi();
        System.out.println("=============================");;
        mk2.tampilInformasi();
        System.out.println("=============================");
        System.out.println();
        
        System.out.println("======== UBAH SKS =========");
        mk1.ubahSKS(3);
        System.out.println("===========================");

        mk1.tambahJam(2);

        mk2.kurangiJam(2);

        System.out.println();
        System.out.println("======== SUDAH DIUBAH ========");
        mk1.tampilInformasi();
        System.out.println("=============================");
        mk2.tampilInformasi();
        System.out.println("==============================");;
    }
}
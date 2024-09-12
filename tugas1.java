/**
 * tugas1
 */
    import java.util.Scanner;
    public class tugas1 {
    public static void main(String[] args) {

        // Inisialisasi scanner dan variabel
        Scanner input = new Scanner(System.in);
        double tarifPerKwh = 1500.0;  // Tarif listrik per kWh
        int penggunaanListrik;  // Variabel untuk menampung input jumlah penggunaan listrik
        double totalTagihan;
        boolean melebihi500kWh;  // Variabel untuk mengecek apakah penggunaan melebihi 500 kWh

        // Input dari pengguna
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        penggunaanListrik = input.nextInt();

        // Hitung total tagihan listrik
        totalTagihan = penggunaanListrik * tarifPerKwh;

        // Cek apakah penggunaan melebihi 500 kWh
        melebihi500kWh = penggunaanListrik > 500;

        // Output hasil
        System.out.println("Total Tagihan Listrik: Rp " + totalTagihan);
        System.out.println("Apakah penggunaan listrik melebihi 500 kWh? " + melebihi500kWh);
    }
}

    

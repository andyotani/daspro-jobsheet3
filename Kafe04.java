/**
 * Kafe04
 */
import java.util.Scanner;
public class Kafe04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlkopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, HargaTeh = 7000.0, hargaRoti = 2000.0;
        double totalHarga, nominalBayar; 
        float diskon = 10 / 100f;

        System.out.print("Masukkan keanggotan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlkopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlkopi * hargaKopi) + (jmlTeh * HargaTeh) + (jmlRoti + hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("keanggotaan pelanggan" + keanggotaan);
        System.out.println("Item pembelian " + jmlkopi + "kopi," + jmlTeh + "Teh," + jmlRoti + "roti");
        System.out.println("Nominal Bayar Rp " + nominalBayar);

    }


}
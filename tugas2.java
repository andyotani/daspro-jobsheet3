/**
 * tugas2
 */
    import java.util.Scanner;
    public class tugas2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Input
            System.out.print("Masukkan jumlah jam kerja: ");
            double jamKerja = scanner.nextDouble();
            System.out.print("Masukkan upah per jam: ");
            double upahPerJam = scanner.nextDouble();
            double gajiSebelumPajak = jamKerja * upahPerJam;
            double bonus = 0.10 * gajiSebelumPajak;
            double gajiDanBonusSebelumPajak = gajiSebelumPajak + bonus;
            double pajak = 0.05 * gajiDanBonusSebelumPajak;
            double gajiBersih = gajiDanBonusSebelumPajak - pajak;
            // Output
            System.out.println("Gaji sebelum pajak: Rp " + gajiSebelumPajak);
            System.out.println("Bonus: Rp " + bonus);
            System.out.println("Total gaji dan bonus sebelum pajak: Rp " + gajiDanBonusSebelumPajak);
            System.out.println("Pajak: Rp " + pajak);
            System.out.println("Gaji bersih: Rp " + gajiBersih);
            scanner.close();
        }
    }
    

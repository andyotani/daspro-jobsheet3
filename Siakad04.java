/**
 * Siakad04
 */
import java.util.Scanner;
public class Siakad04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaikuis, nilaitugas, nilaiujian, nilaiAkhir;
    
            System.out.print("Masukan Nama :");
            nama = sc.nextLine();
            System.out.print("Masukan NIM :");
            nim = sc.nextLine();
            System.out.print("Masukan Kelas :");
            kelas = sc.nextLine().charAt(0);
            System.out.print("Masukan nomor absen :");
            absen = sc.nextByte();

            System.out.print("Masukan nilai kuis :");
            nilaikuis = sc.nextDouble();
            System.out.print("Masukan nilai tugas :");
            nilaitugas = sc.nextDouble();
            System.out.print("Masukan nilai ujian :");
            nilaiujian = sc.nextDouble();

            nilaiAkhir = (nilaikuis + nilaitugas + nilaiujian) / 3;

            System.out.println("Nama: " + nama + "NIM: " + nim);
            System.out.println("Kelas: " + kelas + "Absen: " + absen);
            System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}

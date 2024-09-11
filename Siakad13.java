import java.util.Scanner;
/**
 * Siakad13
 */
public class Siakad13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiAkhir, nilaiUTS, nilaiUAS;

        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.println("Masukkan nomor absen");
        absen = sc.nextByte();

        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble ();
        System.out.println("Masukkan nilai tugas:");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai UTS:");
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan nilai UAS:");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 20/100 + nilaiTugas * 15/100 + nilaiUTS * 30/100 + nilaiUAS * 35/100);

        System. out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
import java.util.Scanner;
public class Tugass13 {
    public static void main(String[] args) {
        Scanner kz = new Scanner (System.in);

        int jumlahJamKerja;
        
        double upahPerJam;
        
        double pajak = 0.05;
        double bonus = 0.10;

        System.out.println("Masukkan Jumlah Jam Kerja: ");
        jumlahJamKerja = kz.nextInt();
        System.out.println("Masukkan upah per Jam: ");
        upahPerJam =kz.nextDouble();
        
        double gajiSebelumPajak = (jumlahJamKerja * upahPerJam);
        double bonusGaji = (gajiSebelumPajak * bonus);
        double totalGajiSebelumPajak = (gajiSebelumPajak + bonus);
        double pajakGaji = (totalGajiSebelumPajak * pajak);
        double gajiBersih = (totalGajiSebelumPajak - pajak);

        System.out.println("Gaji Sebelum Pajak" + gajiSebelumPajak);
        System.out.println("Bonus Gaji" + bonusGaji);
        System.out.println("Total Gaji Sebelum Pajak" + totalGajiSebelumPajak);
        System.out.println("Pajak Gaji" + pajakGaji);
        System.out.println("Gaji Bersih" + gajiBersih * 30);
    }
}

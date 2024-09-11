import java.util.Scanner;
public class Tugas13 {
    public static void main(String[] args) {
        Scanner kz = new Scanner (System.in);

        boolean Melebihi500;
        int tarif_perKWh, penggunaanListrik;
        double totalHarga;

        tarif_perKWh = 1500;

        System.out.println("Input penggunaan listrik: ");
        penggunaanListrik = kz.nextInt();
        totalHarga = (penggunaanListrik * tarif_perKWh);
        System.out.println(totalHarga);
        Melebihi500 = penggunaanListrik > 500;
        System.out.println(Melebihi500);
    }
}

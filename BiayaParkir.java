import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan (motor/mobil): ");
        String jenisKendaraan = scanner.nextLine();

        System.out.print("Masukkan lama parkir (jam): ");
        int lamaParkir = scanner.nextInt();

        int tarifPerJam;

        if (jenisKendaraan.equalsIgnoreCase("motor")) {
            tarifPerJam = 3000;
        } else if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            tarifPerJam = 5000;
        } else {
            System.out.println("Jenis kendaraan tidak valid");
            return;
        }

        int totalBiaya = tarifPerJam * lamaParkir;
        System.out.println("Total biaya parkir: " + totalBiaya + " rupiah");
    }
}

import java.util.Scanner;
import java.util.HashMap;

public class UKembalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total pembelian: ");
        int totalPembelian = scanner.nextInt();

        System.out.print("Uang dibayar: ");
        int uangDibayar = scanner.nextInt();

        int kembalian = uangDibayar - totalPembelian;

        int[] pecahan = { 50000, 20000, 10000, 5000, 2000, 1000, 500 };
        HashMap<Integer, Integer> jumlahPecahan = new HashMap<>();

        System.out.println("Kembalian:");
        System.out.println(kembalian);

        scanner.close();

        for (int nilai : pecahan) {
            if (kembalian >= nilai) {
                int jumlah = kembalian / nilai;
                jumlahPecahan.put(nilai, jumlah);
                kembalian %= nilai;
            }
        }

        for (HashMap.Entry<Integer, Integer> entry : jumlahPecahan.entrySet()) {
            int nilai = entry.getKey();
            int jumlah = entry.getValue();
            System.out.println(jumlah + " lembar " + nilai + "-an");
        }
    }
}

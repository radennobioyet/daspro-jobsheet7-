import java.util.Scanner;

public class Bioskop20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahPelanggan;
        int jumlahTiket;
        double totalHarga;
        int totalTiket = 0;
        double totalPenjualan = 0;

        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jumlahPelanggan = input.nextInt();
        System.out.println();
        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.println("Pelanggan ke-" + i);
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = input.nextInt();
            
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Tiket tidak boleh negatif.\n");
                i--; 
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga -= totalHarga * 0.15;
                System.out.println("Diskon 15% diterapkan.");
            } else if (jumlahTiket > 4) {
                totalHarga -= totalHarga * 0.10;
                System.out.println("Diskon 10% diterapkan.");
            } else {
                System.out.println("Tidak ada diskon.");
            }

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga pelanggan ini: Rp " + totalHarga + "\n");
        }
        System.out.println("===== Rekap Penjualan Hari Ini =====");
        System.out.println("Total pelanggan     : " + jumlahPelanggan);
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);

        input.close();
    }
}

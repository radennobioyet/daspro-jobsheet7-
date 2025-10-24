# JOBSHEET 7
# Percobaan 2


Pertanyaan
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
```
if (nilai < 0 || nilai > 100) {
System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
continue;
}
```
a. nilai < 0 || nilai > 100 

b. continue 
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE? 
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan? 
4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
5. Commit dan push kode program ke Github 


Jawaban
1. 
a. Mengecek apakah nilai di luar rentang valid (kurang dari 0 atau lebih dari 100). Jika iya, dianggap tidak valid.

b. Melewati sisa kode dalam perulangan saat ini dan langsung lanjut ke iterasi berikutnya (tidak mengeksekusi kode setelahnya di dalam loop).
2. Sintaks i++ dituliskan di akhir perulangan while karena tujuannya adalah menaikkan indeks mahasiswa hanya jika input nilai valid.
3. Jika jumlah mahasiswa yang dimasukkan adalah 19, maka perulangan while akan berjalan sebanyak 19 kali, asalkan semua nilai yang dimasukkan valid (yaitu antara 0 dan 100). 
4. 
```
import java.util.Scanner;

public class SiakadWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, nilai, jml;

        i = 0;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jml = sc.nextInt();
        while (i < jml) {
            System.out.println(" Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                System.out.println("Bagus, pertahankan nilainya!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
            i++;
        }
    }
}
```
5. Commit dan push kode program ke Github 
# JOBSHEET 7
# Percobaan 1


Pertanyaan
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1! 
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut! 
```
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
```
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan tertinggi dan terendah! 
5. 5. Commit dan push kode program ke Github 


Jawaban
1. Perulangan for memiliki tiga komponen utama yang berada di dalam tanda kurung:  
   a. Menentukan nilai awal variabel penghitung (i) yaitu 1.  
   b. Mengecek apakah i masih kurang dari atau sama dengan 10. Jika ya, lanjut. 
   c. Menambah nilai i sebanyak 1 setiap kali satu siklus perulangan selesai. 
2. Tujuannya adalah agar nilai awal tidak mengganggu proses pencarian nilai tertinggi dan terendah dari input pengguna. 
3. Mengecek apakah nilai yang baru dimasukkan lebih besar dari nilai tertinggi yang sudah disimpan dan mengecek apakah nilai yang baru dimasukkan lebih kecil dari nilai terendah yang sudah disimpan.
4. 
```
import java.util.Scanner;

public class SiakadFor20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus=0, tidakLulus=0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >=60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah Mahasiswa lulus : " + lulus);
        System.out.println("Jumlah Mahasiswa tidak lulus : " + tidakLulus);
    }
}
```
5. 5. Commit dan push kode program ke Github 
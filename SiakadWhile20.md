# JOBSHEET 7
# Percobaan 1


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


Jawaban
1. 
a. Mengecek apakah nilai di luar rentang valid (kurang dari 0 atau lebih dari 100). Jika iya, dianggap tidak valid.

b. Melewati sisa kode dalam perulangan saat ini dan langsung lanjut ke iterasi berikutnya (tidak mengeksekusi kode setelahnya di dalam loop).
2. Sintaks i++ dituliskan di akhir perulangan while karena tujuannya adalah menaikkan indeks mahasiswa hanya jika input nilai valid.
3. Jika jumlah mahasiswa yang dimasukkan adalah 19, maka perulangan while akan berjalan sebanyak 19 kali, asalkan semua nilai yang dimasukkan valid (yaitu antara 0 dan 100). 
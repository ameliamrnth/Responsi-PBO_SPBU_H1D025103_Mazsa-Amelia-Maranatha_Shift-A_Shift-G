# Responsi Akhir Praktikum PBO

- Nama: Mazsa Amelia Maranatha
- NIM: H1D025103
- Program Studi: Informatika
- Shift: G
- Tema: SPBU (digit terakhir NIM adalah 3)

# Tentang Program:
Program Java sederhana untuk tema SPBU (saya pakai nama Pertamina). Ada dua fasilitas, yaitu pompa bensin (Pertamax Turbo 98) dan minimarket (Pertamina Shop). Karena keduanya sama-sama fasilitas SPBU, datanya yang sama (id, nama, pendapatan) ditaruh di satu superclass, lalu masing-masing punya class sendiri untuk bagian yang berbeda.

# Daftar File:
- FasilitasSPBU.java : abstract class, superclass dari dua fasilitas
- PompaBensin.java : subclass, implements Operasional dan Transaksi
- Minimarket.java : subclass ke-2
- Operasional.java : interface
- Transaksi.java : interface
- Main.java : class untuk menjalankan dan menguji program

# Cara Compile dan Run:
Lewat terminal, masuk dulu ke folder yang berisi file .java (folder src), lalu:
```
cd src
javac *.java
java Main
```

# Screenshot Output:
![output program](screenshot.jpg)

# Konsep yang Dipakai:
1. State dan behavior: atribut seperti stokLiter dan pendapatan, method void tampilkanInformasi(), method fungsi hitungBiaya() dan getPendapatan()
2. Immutability: NAMA_PERUSAHAAN (public static final) dan idFasilitas (private final)
3. Enkapsulasi dan overloading: semua atribut private dengan getter setter, pakai this, konstruktor lebih dari satu di FasilitasSPBU dan Minimarket
4. Inheritance: PompaBensin dan Minimarket extends FasilitasSPBU, Main dipisah
5. Super chaining: super(...) di konstruktor subclass dan super.tampilkanInformasi()
6. Method overriding: tampilkanInformasi() dengan @Override
7. Abstract class: FasilitasSPBU punya abstract method prosesLayanan()
8. Logika state: if/else di prosesLayanan() membaca dan mengubah stokLiter
9. Polimorfisme interface: Operasional operasi = new PompaBensin(...) di Main
10. Multiple interface: PompaBensin implements Operasional, Transaksi

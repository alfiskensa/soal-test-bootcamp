# Soal test developer Bootcamp batch 3
PT FUSI SOLUSI TRANSFORMASI

1. Jelaskan menurut pendapat anda tentang
  - Spring Framework 
  - ApplicationContect 
  - Dependency Injection 
  - Inversion of Control
  - Spring Boot
  - Spring Container
  - Bean
  - Aturan apa saja yang diterapkan oleh Spring Framework
  - Tujuan penggunaan Spring Framework
  
2. Jelaskan menurut pendapat anda tentang
  - Hibernate
  - Hibernate Dialect
  - HQL (Hibernate Query Language) dan JPQL ( Java Persistence Query Language)
  - JPA (Java Persistance API)
  - ORM
  - Domain Model
  - @Entity
  - @Table
  - @Column
  - @Id
  - @OneToOne (berikan contoh kasusnya **bukan koding**)
  - @OneToMany (berikan contoh kasusnya **bukan koding**)
  - @ManyToOne (berikan contoh kasusnya **bukan koding**)
  - @ManyToMany (berikan contoh kasusnya **bukan koding**)
  - SessionFactory dan Session
 
 3. Buat program bagaimana cara meload aplikasi spring dengan menggunakan **Java Configuration / Annotation** dan Buat sebuah bean dengan tipe data java.lang.Integer yang di beri nilai 20 kemudian buat sebuah kelas baru dengan nama `UmurSaya` dalam package `com.tabeldata.soal.spring` kemudian 
 tampilkan ke console seperti berikut `Saya ber usia (20) tahun` **nilai 20 diambil dari bean yang di deklarasikan spring container** 
 
 4. Buat sebuah program untuk mengkoneksikan ke database **MySQL** dengan menggunakan **Spring Boot** dan **Hibernate (JPA)** dan buatlah tabel berserta datanya seperti berikut:
 
 Tabel **tiket**
 
 | id (primary key) | id_penumpang (fk_penumpang) |  id_travel (fk_travel)   | jadwal             |
 | :--              | :--                         | :--                      | :--                |
 | 1                | 1                           |   1                      | 2017-10-20 10:00   |
 | 2                | 2                           |   3                      | 2017-10-20 10:00   |
 | 3                | 3                           |   2                      | 2017-10-20 10:00   |
 
 Tabel **penumpang**
 
 | id_penumpang | nama        | no_telp         | alamat              |
 |  :---        | :---        | :---            | :---                |
 | 1            | Lukman      | 0812341234213   | Jl.cisaranten       |
 | 2            | Akbar       | 0918234483343   | Jl. Melawai         |
 | 3            | Dewa Ngoman | 0900934483343   | Jl. panglima polim  |
 
 Tabel **travel**
 
 | id_travel    | nama_supir        | no_telp         | alamat              | no_polisi     |
 |  :---        | :---              | :---            | :---                | :---          |
 | 1            | Eko               | 0813284343433   | Jl.cisaranten       | D 2524 ZZC    |
 | 2            | Budi              | 0918234483343   | Jl. Melawai         | B 4343 KDF    |
 | 3            | Adi Putra         | 0900934483343   | Jl. panglima polim  | B 2343 DKJ    |
 
 5. Buatlah tampilan UI (User Interface) Web dari soal No. 4 dengan menggunakan Vaadin Framework, gambarlah desain web dengan vaadin designer
 
 6. Integrasikan soal No. 4 dan No. 5, Spring boot project sebagai back-end dan Vaadin Framework sebagai Front-end (OPSIONAL)
 
 ## Cara Mengerjakan
 
 * Fork / Clone Repository ini
 * Untuk Soal no 1 dan 2 **Kerjakan diketik di Microsoft Word dengan formmat .docx** kirim ke email alfi.ramdhani@fusi24.com dengan subject "Bootcamp Batch 3 - Nama"
 * Untuk Soal no 3, 4, 5 dan 6 kerjakan di repository ini, di push sesuai waktu yang ditentukan (sertakan file backup database)
 * Untuk Soal no 6 opsional, akan tetapi menjadi nilai plus jika dikerjakan
 * nama database dan folder project di berinama sesuai nama anda
 * semua folder project dan file database sertakan di dalam FOLDER NAMA ANDA
 
 
  

+Project PET CLINIC, yaitu program sederhana yang dapat diterapkan dalam pelayanan administrasi Klinik dan Penitipan peliharaan. Program ini tidak terhubung dengan source eksternal seperti database atau text file, sehingga data yang dimasukkan hanya dapat digunakan atau berlaku pada sekali run-time. Spesifikasi yang dimiliki program ini adalah:

~TAMPILAN AWAL/LANDING PAGE
.	Menu Daftar sebagai Pelanggan
.	Menu Login bagi Pemilik dan Pegawai
.	Menu Login bagi Pelanggan yang sudah terdaftar
~TAMPILAN MENU DAFTAR SEBAGAI PELANGGAN
.	Input nama lengkap, alamat, nomor telepon. Setelah pengisian input, akan muncul 		Menu Pilihan aktifitas Pelanggan
~TAMPILAN MENU LOGIN BAGI PEMILIK DAN PEGAWAI
.	Input username dan password. Setelah pengisian input, akan muncul Menu Pilihan      aktifitas Pemilik dan Pegawai

~TAMPILAN MENU LOGIN BAGI PELANGGAN YANG SUDAH TERDAFTAR
.	Menu Pilihan aktifitas Pelanggan
~TAMPILAN MENU PILIHAN AKTIFITAS PELANGGAN
.	Menu Menitipkan
.	Menu Menjual
.	Menu Membeli
.	Menu Daftar Hewan Peliharaan
.	Menu Data Pribadi Anda
.	Pilihan Keluar
~TAMPILAN MENU PILIHAN AKTIFITAS PEMILIK DAN PEGAWAI
.	Menu Melihat Daftar Peliharaan
.	Menu Melihat Daftar Pelanggan
.	Pilihan Logout
~TAMPILAN MENU MENITIPKAN
.	Input jumlah peliharaan yang dititipkan dan jenis hewan
.	Menu pilihan Tanggal Penitipan

~TAMPILAN MENU MENJUAL
.	Input jumlah peliharaan yang dititipkan dan jenis hewan

~TAMPILAN MENU MEMBELI
.	Tampilan Daftar Peliharaan
.	Input kode hewan yang ingin dibeli

~TAMPILAN MENU MELIHAT DAFTAR PELIHARAAN
.	Tampilan Daftar Peliharaan

~TAMPILAN MENU MELIHAT DATA PRIBADI ANDA
.	Tampilan Data Pribadi berisi Nama Lengkap, Kode probadi, Alamat, Nomor Telepon dan 		Daftar Peliharaan pribadi yang terdaftar di pet clinic


+Alur Kerja
Ketika program dimulai, user akan melihat TAMPILAN AWAL/LANDING PAGE yang berisi Menu Daftar sebagai Pelanggan, Menu Login bagi Pemilik dan Pegawai, dan Menu Login bagi Pelanggan yang sudah terdaftar.
Jika anda merasa belum terdaftar sebagai pelanggan pada run-time tersebut, maka anda dapat memilih Menu Daftar sebagai Pelanggan dengan memasukkan angka “a” pada input “Pilihan anda”. Setelah itu anda akan dialihkan ke tampilan Daftar Sebagai Pelanggan, dimana akan tersedia Input nama lengkap, alamat, nomor telepon. 
Setelah pengisian input, akan muncul Menu Pilihan aktifitas Pelanggan. Menu ini menampilkan 6 pilihan, yaitu Menu Menitipkan, Menu Menjual, Menu Membeli, Menu Daftar Hewan Peliharaan, Menu Data Pribadi Anda, dan Pilihan Keluar.
Jika anda ingin menitipkan hewan peliharaan, maka masukkan angka “1” dalam input “Pilih aksi”. Setelah input masuk, maka akan tampil Input “Jumlah Peliharaan yang dititipkan” dan user dapat memasukkan angka berupa berapa jumlah peliharaan yang ingin dititipkan. Setelah itu akan tampil Input “Jenis Hewan” dan user dapat memasukkan jenis peliharaan yang ingin dititipkan. Setelah itu akan tampil Pilihan Tanggal Penitipan, dimana tanggal yang tersedia hanya berkisar dari 1 hari setelah hari ini hingga 7 hari kemudian. Anda dapat memilih dengan memasukkan angka pilihan yang mewakili tanggal yang tersedia (angka 1-7). Setelah itu akan ada pemberitahuan "Tanggal Berhasil Ditentukan. Anda dapat menjemput peliharaan anda maksimal pada …" dimana titik-titik akan terisi otomatis dengan tanggal 7 hari setelah tanggal penitipan.
Jika anda ingin menjual hewan, maka masukkan angka “2” dalam input “Pilihan aksi”. Setelah input masuk, maka akan tampil input”Jumlah peliharaan yang dijual” dan user dapat memasukkan angka berupa berapa jumlah peliharaan yang ingin dijual. Setelah itu akan tampil Input “Jenis Hewan” dan user dapat memasukkan jenis peliharaan yang ingin dijual.
Jika anda ingin membeli hewan, maka masukkan angka “3” dalam input “Pilihan aksi”. Setelah input masuk, maka akan tampil Daftar hewan yang berstatus “Dijual” beserta detail dan kode hewannya, diikuti dengan tampilnya input “Kode Hewan” sehingga user diminta untuk memasukkan kode hewan yang ingin dia beli. Setelah dibeli maka hewan akan hilang dari daftar peliharaan yang tersedia. Jika hewan dijual di Pet Clinic masih kosong, maka akan muncul “Peliharaan dijual saat ini belum tersedia :(”.
Jika anda ingin melihat daftar seluruh hewan di Pet Clinic, maka masukkan angka “4” dalam input “Pilihan aksi”. Setelah input masuk, maka akan tampil Daftar hewan. Jika hewan di Pet Clinic masih kosong, maka akan muncul “Peliharaan Titipan maupun dijual saat ini kosong :(“.
Jika anda ingin melihat data pribadi anda di Pet Clinic, maka masukkan angka “5” dalam input “Pilihan aksi”. Setelah input masuk, maka akan tampil data-data anda termasuk kode, nama, alamat, nomor telpon dan daftar hewan anda.
Jika anda ingin keluar/logout dari akun yang baru anda daftarkan, maka masukkan angka “6” dalam input “Pilihan aksi”. Setelah itu akan kembali ke TAMPILAN AWAL/LANDING PAGE.
Perlu diketahui bahwa setiap anda telah selesai memilih dan melakukan suatu aksi, program akan kembali menampilkan Pilihan aksi secara berulang, kecuali anda memilih Logout.

Selain dari menu daftar sebagai pelanggan, jika anda adalah Pegawai atau Pemilik Pet Clinic, maka masukkan “b” atau “c” untuk masuk ke Menu Login bagi Pemilik dan Pegawai. Pada menu tersebut akan ada input Username dan Password, yang bisa anda akses dengan memasukkan username “pemilik_petclinic” atau “pegawai_petclinic” dan password “pemilik54321” atau “pegawai67891”. Setelah login, maka akan masuk ke Menu Pilihan aktifitas Pemilik dan Pegawai. Menu ini sama-sama berisi Menu Melihat Daftar Peliharaan, Menu Melihat Daftar Pelanggan, dan Logout. Akan ada Input “Pilihan anda” dan user dapat memasukkan angka “1” untuk menampilkan Daftar Peliharaan, memasukkan angka “2” untuk menampilkan Daftar Pelanggan, dan memasukkan angka “3” untuk Logout dan kembali ke TAMPILAN AWAL/LANDING PAGE.

Terakhir, jika anda sudah terdaftar sebagai pelanggan selama run-time tersebut, maka anda bisa memasukkan “d” untuk masuk ke Menu Login Pelanggan, dan akan tampil Input Nama Lengkap dan Kode, yang harus diisi sesuai dengan data anda ketika mendaftar sebelumnya. Setelah masuk, maka Menu Pilihan aktifitas Pelanggan, yang beralur sama persis dengan yang ada pada Menu Daftar sebagai Pelanggan.


+Contoh Input-output
Salah satu contoh input dan output yang akan dijelaskan adalah input Nama Lengkap, Alamat dan Nomor Telepon saat mendaftar sebagai pelanggan. Input-input tersebut bertipe data string dan akan disimpan ke dalam sebuah object bertipe data class “owner” dengan menggunakan method setter pada class “owner”, kemudian dimasukkan ke ArrayList<owner> yang menampung semua pelanggan dalam bentuk ArrayList object class “owner”. Output bisa diakses dalam bentu object class “owner” maupun diambil per atributnya dalam bentuk String dengan getter masing-masing atribut di class “owner”.


+Bagian dari project yang menerapkan konsep object oriented
Bagian dari project yang berupa object oriented adalah hubungan antara class pet dan owner, yang berupa penggunaan method-method terpisah untuk beberapa aktifitas (seperti melihat daftar peliharaan dan menentukan jadwal penitipan pet), Enkapsulasi variable/atribut class, serta hubungan agregasi antar class. Agregasi adalah hubungan yang bisa saling menggunakan di dalam sebuah kelas. Pada program ini, kelas owner dan kelas pet, dilihat dari kardinalitasnya, satu owner bisa memiliki banyak pet dalam bentuk ArrayList objek class pet. Dan satu pet hanya bisa memiliki satu owner. Namun secara class-relation, jika class owner hilang, objek pet tetap bisa dibuat dengan setter yang ada di kelas mereka sendiri. Akan tetapi dalam konteks pet clinic, kurang masuk akal saja jika pet tidak memiliki owner, sebab kode apa yang dapat kita masukkan ke setter kode owner? 


+Ada Beberapa Konsep OO yang tidak saya gunakan karena memang tidak dibutuhkan atau saya kurang paham caranya

+Jika ditanya hal yang ingin di-improve di project selannjutnya. Penggunaan method di Main class lebih diperbanyak,ppenggunaan abstrak class,komposisi maupun asosiasi diperbanyak
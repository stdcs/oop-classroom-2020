# Buatlah Class Berdasarkan Class Diagram Berikut

<p align="center"><img src="assets/classobject.png" alt="Class Diagram" title="Class Diagram"></p>

## Penjelasan Atribut :
- Setiap atribut yang memiliki << set/get >> berarti memiliki method setter dan getter default, bentuk setter getter default adalah sebagai berikut :
   ```java
   class Sample {
     private String attributeSample;

     // Setter default untuk atribut attributeSample
     // Tipe data parameter method = tipe data atribut
     public void setAttributeSample(String attributeSample) {
       /**
       * Proses Lainnya
       */
       this.attributeSample = attributSample;
     }

     // Getter default untuk atribut attributeSample
     // Return type method = tipe data atribut
     public String getAttributeSample() {
       /**
       * Proses Lainnya
       */
       return attributeSample;
     }
   }
   ```
- Atribut yang memiliki << set >>, berarti hanya memiliki method setter default.
- _Method body_ menyesuaikan dengan alur yang dibutuhkan.
- Jika pada bagian _behaviour_ terdapat method `setter`, maka bentuk method `setter` yang digunakan adalah yang terdapat pada bagian _behaviour_

## Penjelasan Behaviour :
- `setId(facultyMap : Map<String, String>, majorMap : Map<String, String>) : void` : Berfungsi untuk mengatur atribut `id` (NIM), dimana `id` dibentuk dari :
    ``` 
    Kode Fakultas + Kode Prodi + 1 + Dua Digit Terakhir registerYear + 1 + 3 Digit Angka Random Dari 001 - 060
    ```
  Kode Fakultas dan Kode Prodi didapat dari `facultyMap` dan `majorMap` yang berupa `HasMap` pada `main` method dimana `key`-nya adalah nama fakultas dan nama prodi, kemudian `value`-nya adalah kode fakultas dan kode prodi.
- `setEmail(facultyMap : Map<String, String>) : void` : Berfungsi untuk mengatur atribut `email`, dimana `email` dibentuk dari :
    ```
    Suku Kata Terakhir Nama + Huruf Pertama Setiap Suku Kata Nama Dari Awal Sampai Sebelum Suku Kata Terakhir + 2 Digit Terakhir registerYear + Kode Fakultas + @student.unhas.ac.id
    ```
    format `email` harus _lower case_ tanpa spasi.
- `getFullName(): String` : Mengembalikan Nama Lengkap dalam betuk _Upper Camel Case_ yang merupakan hasil dari penggabungan `firstName` dan `lastName` yang dipisahkan oleh 1 spasi.
- `description() : void` : Mencetak data Mahasiswa dengan format sebagai berikut : 
  ```
  Nama            : Muhammad Fitrah
  NIM             : H071171035
  Email Mahasiswa : fitrahm17h@student.unhas.ac.id
  Fakultas        : MIPA
  Departemen      : Matematika
  Program Studi   : Ilmu Komputer
  ```

## Kemudian Buatlah _Class Main_ dengan _main Method_ Untuk Melakukan Instansiasi _Class Student_ Dengan Ketentuan Sebagai Berikut :
- Terdapat `Map<String, String> facultyCode` untuk menampung data Nama Fakultas dan Kode Fakultas.
- Terdapat `Map<String, String> majorCode` untuk menampung data Nama Prodi dan Kode Prodi.
- Memanggil method `description()` dari setiap hasil instansiasi class `Student`

Berikut Contoh _main method_ beserta outputnya :
```java
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Map<String, String> facultyMap = new HashMap<>();
    Map<String, String> majorMap = new HashMap<>();
    facultyMap.put("Nama Fakultas Lain", "A");
    facultyMap.put("Nama Fakultas Lain", "B");
    facultyMap.put("Nama Fakultas Lain", "C");
    facultyMap.put("Nama Fakultas Lain", "D");
    facultyMap.put("Nama Fakultas Lain", "E");
    facultyMap.put("Nama Fakultas Lain", "F");
    facultyMap.put("Nama Fakultas Lain", "G");
    facultyMap.put("MIPA", "H");
    majorMap.put("Prodi Lain", "01");
    majorMap.put("Prodi Lain", "02");
    majorMap.put("Prodi Lain", "03");
    majorMap.put("Prodi Lain", "04");
    majorMap.put("Prodi Lain", "05");
    majorMap.put("Prodi Lain", "06");
    majorMap.put("Ilmu Komputer", "07");

    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();
    
    student1.setFirstName("mUHammAd");
    student1.setLastName("fITRAH");
    student1.setRegisterYear(2017);
    student1.setFaculty("MIPA");
    student1.setDepartment("Matematika");
    student1.setMajor("Ilmu Komputer");
    student1.setId(facultyMap, majorMap);
    student1.setEmail(facultyMap);
    
    student2.setFirstName("KENNEDY");
    student2.setLastName("");
    student2.setRegisterYear(2017);
    student2.setFaculty("MIPA");
    student2.setDepartment("Matematika");
    student2.setMajor("Ilmu Komputer");
    student2.setId(facultyMap, majorMap);
    student2.setEmail(facultyMap);
    
    student3.setFirstName("Khawaritzmi");
    student3.setLastName("abdallah ahmad");
    student3.setRegisterYear(2017);
    student3.setFaculty("MIPA");
    student3.setDepartment("Matematika");
    student3.setMajor("Ilmu Komputer");
    student3.setId(facultyMap, majorMap);
    student3.setEmail(facultyMap);

    student1.description();
    student2.description();
    student3.description();

  }
}
```
Output :
  ```
  Nama            : Muhammad Fitrah
  NIM             : H071171035
  Email Mahasiswa : fitrahm17h@student.unhas.ac.id
  Fakultas        : MIPA
  Departemen      : Matematika
  Program Studi   : Ilmu Komputer

  Nama            : Kennedy
  NIM             : H071171021
  Email Mahasiswa : kennedy17h@student.unhas.ac.id
  Fakultas        : MIPA
  Departemen      : Matematika
  Program Studi   : Ilmu Komputer

  Nama            : Khawaritzmi Abdallah Ahmad
  NIM             : H071171002
  Email Mahasiswa : ahmadka17h@student.unhas.ac.id
  Fakultas        : MIPA
  Departemen      : Matematika
  Program Studi   : Ilmu Komputer
  ```

- Jika gambar _class diagram_ ditas kurang jelas, silahkan unduh [Class Diagram.pdf](assets/classobject.pdf).
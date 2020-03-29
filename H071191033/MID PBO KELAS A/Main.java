import java.util.*;
import java.time.LocalDate; 

public class Main {
  List<pet> semua_pet = new ArrayList<pet>();
  List<owner> pemilik = new ArrayList<owner>();
  String[] login = new String[]{"pemilik_petclinic","pegawai_petclinic"};
  String[] pw = new String[]{"alfian123","pegawai67891"};
  List<String> listlogin = Arrays.asList(login);
	List<String> listpass = Arrays.asList(pw);

	public static void main(String[] args) {
    Main obj = new Main();
    Scanner myObj = new Scanner(System.in);
    Random rand = new Random();
    int loop_utama = 1;
    while(loop_utama==1){
      System.out.println("\n======= PET CLINIC =======");
		  System.out.println("\nSelamat datang di Pet Clinic. Silahkan pilih aksi berikut. ");
      System.out.println("(a) Daftar sebagai Pelanggan\n(b) Login Pemilik\n(c) Login Pegawai\n(d) Login Pelanggan\n");
      System.out.println("**Masukkan Pilihan selain a, b, c dan d untuk mengakhiri program. \nPilihan anda : ");
		  String pillogin = myObj.nextLine();

      if(pillogin.equalsIgnoreCase("a")){
        System.out.println("\nSilahkan masukkan data Owner pada form berikut!");
	      System.out.println("Nama Lengkap: ");
		    String namalengkap = myObj.nextLine();
		    System.out.println("Alamat: ");
		    String alamat = myObj.nextLine();
		    System.out.println("Nomor Telepon/HP: ");
		    String notelp = myObj.nextLine();
		    int rando = rand.nextInt(1000);

  		  owner s = new owner();
	  	  s.setNamaOwner(namalengkap);
		    s.setKodeOwner(namalengkap.charAt(0)+Integer.toString(rando));
		    s.setAlamat(alamat);
		    s.setNotelp(notelp);
        obj.pemilik.add(s);
        obj.OpsiPelanggan(obj.semua_pet, s);

      }else if(pillogin.equalsIgnoreCase("b")||pillogin.equalsIgnoreCase("c")){
      
        System.out.println("Username : ");
		    String uname = myObj.nextLine();
        System.out.println("Password : ");
		    String pass = myObj.nextLine();
      
        if(obj.listlogin.contains(uname) && obj.listpass.contains(pass)){
          int loop = 1;
          while(loop==1){
            System.out.println("\nSelamat Datang. Silahkan pilih aksi anda: ");
            System.out.println("1). Melihat Daftar Peliharaan\n2). Melihat Daftar Pelanggan\n3). Logout");
            System.out.println("Pilihan anda : ");
		        String da = myObj.nextLine();
            int daf = Integer.parseInt(da);
            if(daf==1){
              if(obj.semua_pet.isEmpty()==true){
                System.out.println("Data Hewan Kosong.");            
              }else{
                LihatDataHewan(obj.semua_pet);
              }
            }else if(daf==2){
              if(obj.semua_pet.isEmpty()==true){
                System.out.println("Data Hewan Kosong.");            
              }else{
                LihatDataPelanggan(obj.pemilik);
              }
            }else if(daf==3){
               loop=2;
            }else{
              System.out.println("Pilihan salah. Silahkan Coba lagi.");
            }
          }
        }else{
          System.out.println("Data login salah. Silahkan Coba lagi.");
        }
      }else if(pillogin.equalsIgnoreCase("d")){
        System.out.println("Nama Lengkap : ");
		    String naml = myObj.nextLine();
        System.out.println("Kode Owner : ");
		    String kodo = myObj.nextLine();
        for(int i =0;i<obj.pemilik.size();i++){
          if(obj.pemilik.get(i).getNamaOwner().equalsIgnoreCase(naml)&&obj.pemilik.get(i).getKodeOwner().equalsIgnoreCase(kodo)){
            obj.OpsiPelanggan(obj.semua_pet, obj.pemilik.get(i));
          }else{
            System.out.println("Data login salah. Silahkan coba lagi.");
          }
        }
      }else{
        System.out.println("Terima kasih. Datang kembali :) ");
        loop_utama=2;
      }
    } 
  }

      public static List<LocalDate> TanggalPenitipan(LocalDate startDate,LocalDate endDate) {
        List<LocalDate> seminggu = new ArrayList<LocalDate>();
        for(int i = 0; i<7;i++){
          LocalDate tgl = startDate.plusDays(i+1);
          seminggu.add(tgl);
        }
        return seminggu;
      }

      public static void JadwalTitipKembali(pet hewan){
          Scanner myObj = new Scanner(System.in);
          LocalDate date = LocalDate.now(); 
          System.out.println("===== PILIH TANGGAL PENITIPAN =====");
          List<LocalDate> pilihantgl = TanggalPenitipan(date, date.plusDays(7));
          for(int i = 0; i<pilihantgl.size();i++){
              System.out.println((i+1)+". "+pilihantgl.get(i));
          }
          int looptgl = 1;
          while(looptgl==1){
            System.out.println("Masukkan pilihan Tanggal : ");
            String tg = myObj.nextLine();
            int pick = Integer.parseInt(tg);
            if(pick>7 || pick<1){
              System.out.println("Pilihan salah. Masukkan ulang.");
            }else{
              LocalDate tglTerpilih = pilihantgl.get(pick-1);
              hewan.setTglTitip(tglTerpilih,tglTerpilih.plusDays(7));
              System.out.println("Tanggal Berhasil Ditentukan. Anda dapat menjemput peliharaan anda maksimal pada "+tglTerpilih.plusDays(7));
              looptgl=2;
          }
          }
      }
            
      public static void LihatDataHewanDijual(List<pet> semua_pet){
          System.out.println("\n===== DAFTAR SEMUA HEWAN PELIHARAAN DIJUAL=====");
          System.out.println(String.format(" %30s  %30s  %30s ", "KODE HEWAN", "JENIS HEWAN", "STATUS"));
            for(int i=0;i<semua_pet.size();i++){
                if(semua_pet.get(i).getStatus().equalsIgnoreCase("Dijual")){
                    System.out.println(String.format(" %30s  %30s  %30s ", semua_pet.get(i).getKode() , semua_pet.get(i).getJenisPet(), semua_pet.get(i).getStatus()));
                }
            }
	    }

      public static void LihatDataHewan(List<pet> semua_pet){
          System.out.println("\n===== DAFTAR SEMUA HEWAN PELIHARAAN =====");
          System.out.println(String.format(" %30s  %30s  %30s ", "KODE HEWAN", "JENIS HEWAN", "STATUS"));
            for(int i=0;i<semua_pet.size();i++){
                  System.out.println(String.format(" %30s  %30s  %30s  %30s ", semua_pet.get(i).getKode() , semua_pet.get(i).getJenisPet(), semua_pet.get(i).getStatus(), semua_pet.get(i).getEndTitip()));
                }
            }
	    
      public static void LihatDataPelanggan(List<owner> semua_owner){
          System.out.println("\n===== DAFTAR SEMUA PELANGGAN =====");
          System.out.println(String.format(" %30s  %30s  %30s  %30s  %30s ", "NAMA OWNER", "KODE OWNER", "ALAMAT OWNER", "NOMOR TELEPON", "DAFTAR HEWAN"));
            for(int i=0;i<semua_owner.size();i++){
              List<String> jp = new ArrayList<String>();
                for(int j=0;j<semua_owner.get(i).getPets().size();j++){
                  jp.add(semua_owner.get(i).getPets().get(j).getJenisPet());
                }
                System.out.println(String.format(" %30s  %30s  %30s  %30s  %30s ", semua_owner.get(i).getNamaOwner() , semua_owner.get(i).getKodeOwner(), semua_owner.get(i).getAlamat(), semua_owner.get(i).getNotelp(), jp));
            }
	    }

      public static void OpsiPelanggan(List<pet> semua_pet, owner s){
        Main obj = new Main();
        Scanner myObj = new Scanner(System.in);
        List<pet> hewan = new ArrayList<pet>();
        Random r = new Random();
        int j = 1;
        while(j==1){
          System.out.println("Silahkan memilih salah satu aksi berikut. ");
		      System.out.println("1). Menitipkan\n2). Menjual\n3). Membeli\n4). Melihat Daftar semua Pet\n5). Melihat Data Pribadi Anda\n6). Log out");
		      System.out.println("Pilih aksi: ");
		      String pill = myObj.nextLine();
          int act = Integer.parseInt(pill);

          switch(act){
            case 1:
              System.out.println("Jumlah Peliharaan yang dititipkan: ");
              String jt = myObj.nextLine();
              int jlhtitip = Integer.parseInt(jt);
    	        System.out.println("Silahkan masukkan data peliharaan.");
		          for(int i=0;i<jlhtitip;i++){
                  int rando = r.nextInt(870);
			            System.out.println("Jenis Hewan: ");
		              String jenispet = myObj.nextLine();
          		        
		              pet aj = new pet();
		              aj.setKode(s.getKodeOwner()+"_"+rando);
		              aj.setStatus("Dititipkan");
		              aj.setJenisPet(jenispet);
		              aj.setKode_Owner(s.getKodeOwner());
		              hewan.add(aj);
		              semua_pet.add(aj);
                  s.setOwnerDariPet(hewan);
                  JadwalTitipKembali(aj);
                }break;
		        case 2:
              System.out.println("Jumlah Peliharaan yang dijual: ");
              String jj = myObj.nextLine();
              int jlhjual = Integer.parseInt(jj);
	  	        System.out.println("Silahkan masukkan data peliharaan.");
		          for(int i=0;i<jlhjual;i++){
                  int rando2 = r.nextInt(870);
		              System.out.println("Jenis Hewan: ");
		              String jenispet = myObj.nextLine();
		        
		              pet aj = new pet();
		              aj.setKode(s.getKodeOwner()+"_"+rando2);
		              aj.setStatus("Dijual");
		              aj.setJenisPet(jenispet);
		              aj.setKode_Owner(s.getKodeOwner());
		              hewan.add(aj);
		              semua_pet.add(aj);
                  s.setOwnerDariPet(hewan);
		          }break;
		        case 3:
              if(semua_pet.isEmpty()==true){
                System.out.println("Peliharaan dijual saat ini belum tersedia :(");
              } else if(semua_pet.isEmpty()==false){
                LihatDataHewanDijual(semua_pet);
                System.out.println("Kode Hewan: ");
		            String hewanbeli = myObj.nextLine();
	  	          for(int i=0;i<semua_pet.size();i++){
                    if(semua_pet.get(i).getKode().equalsIgnoreCase(hewanbeli)){
                      semua_pet.remove(i);
                      System.out.println("Hewan Berhasil Dibeli!");
                    }
                }
              }
		          break;
		        case 4:
              if(semua_pet.isEmpty()==true){
                System.out.println("Peliharaan Titipan maupun dijual saat ini kosong :(");
              } else if(semua_pet.isEmpty()==false){
                LihatDataHewan(semua_pet);break;
              }
		        case 5:
              System.out.println("DATA PRIBADI ANDA");
              System.out.println("Nama Lengkap\t\t:"+s.getNamaOwner());
              System.out.println("Kode\t\t\t\t:"+s.getKodeOwner());
              System.out.println("Alamat \t\t\t\t:"+s.getAlamat());
              System.out.println("Nomor Telepon\t\t:"+s.getNotelp());
              System.out.println("Daftar Peliharaan\t:");
              if(s.getPets().isEmpty()){
                System.out.println("Tidak ada data hewan peliharaan.");
              }else{
                System.out.println(String.format(" %30s  %30s  %30s ","KODE HEWAN","JENIS HEWAN","STATUS"));
                for(int i=0;i<s.getPets().size();i++){
                    System.out.println(String.format(" %30s  %30s  %30s ", s.getPets().get(i).getKode() , s.getPets().get(i).getJenisPet(), s.getPets().get(i).getStatus()));
                }
              }
              break;
            case 6:
              j=0;
              break;
            default:
              System.out.println("Pilihan salah. Silahkan coba lagi.");
              break;
          }
        } 
      }
}

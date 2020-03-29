import java.util.*;

public class owner {
    private String nama;
    private String kode;
    private String alamat;
    private String notelp;
    private List<pet> pets;
    
    public void setNamaOwner(String nama){
        this.nama = nama;
    } 
    public String getNamaOwner() {
        return this.nama;
    }
    public void setKodeOwner(String ko){
        this.kode = ko;
    } 
    public String getKodeOwner() {
        return this.kode;
    }
    public void setAlamat(String al){
        this.alamat = al;
    } 
    public String getAlamat() {
        return this.alamat;
    }
    public void setNotelp(String no){
        this.notelp = no;
    } 
    public String getNotelp() {
        return this.notelp;
    }
    public List<pet> getPets() {
        return this.pets;
    }
    public void setOwnerDariPet(List<pet> daftar_pet) {
        this.pets = daftar_pet;
    }
}
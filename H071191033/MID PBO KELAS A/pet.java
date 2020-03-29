import java.time.LocalDate; 

public class pet {
  private String status;
  private String JenisPet;
  private String kodePet;
  private String kode_owner;
  private LocalDate start_date;
  private LocalDate end_date;
  
  public void setKode (String kode) {
      this.kodePet = kode;
  }
  public String getKode () {
      return this.kodePet;
  }
  public void setStatus (String stat) {
      this.status = stat;
  }
  public String getStatus () {
      return this.status;
  }
  public void setJenisPet(String jenis){
      this.JenisPet = jenis;
  }
  public String getJenisPet(){
      return this.JenisPet;
  }
  public void setKode_Owner(String code){
      this.kode_owner = code;
  }
  public String getKode_Owner(){
      return this.kode_owner;
  }
  public void setTglTitip(LocalDate startdate, LocalDate enddate){
        this.start_date = startdate;
        this.end_date = enddate;
  } 
  public LocalDate getStartTitip() {
        return this.start_date;
  }
    public LocalDate getEndTitip() {
        return this.end_date;
  }
}
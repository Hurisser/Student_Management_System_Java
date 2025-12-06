package Otomasyon;

public abstract class Kullanici {
	int Id;
	String password;
	String ad;
	String soyad;
	String email;
	String telNo;
	
	
	Kullanici (){
		Id = 0;
		password = "";
		ad = "Yeni kullanıcı";
		soyad = "";
		email = "";
		telNo = "";
	}	
	
	Kullanici ( String password, String ad, String soyad, String email, String telNo){
		this.password = password;
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
		this.telNo = telNo;
	}
	public String getAd() {
		 return ad;
	 }
	public String getSoyad() {
		  return soyad;
	  }
	public void setId(int Id) {
		this.Id = Id;
	}
	public int getId() {
		return Id;
	}
	public String getEmail() {
		return email;
	}
	

	
}

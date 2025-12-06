package Otomasyon;

public class Akademisyen extends Kullanici implements AkademisyenIslemleri {
	String ders;
	
	Akademisyen(){
		super();
	}
	Akademisyen(String password, String ad, String soyad, String email, String telNo, String ders){
		super(password,ad,soyad,email,telNo);
		this.ders = ders;
	}
	
	public String getad()
	{
		return ad;
	}
	public String getsoyad()
	{
		return soyad;
	}
	public int getid()
	{
		return Id;
	}
	public String getemail()
	{
		return email;
	}
	public String getders()
	{
		return ders;
	}
	
	
	
	
	public void ogrenciListesiGor() {};
	public void notGirme() {};
	public void profilGoruntuleme() {};

}

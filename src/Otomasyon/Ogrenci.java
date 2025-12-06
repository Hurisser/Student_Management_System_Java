package Otomasyon;

public class Ogrenci extends Kullanici{
	String bolum;
	String sinif;
	Dersler dersler = new Dersler(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
	
	
	
	Ogrenci(){
		super();
	}
	
	Ogrenci(String password, String ad, String soyad, String email, String telNo){
		super(password,ad,soyad,email,telNo);
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Ogrenci ogrenci = (Ogrenci) obj;
	    return this.Id == ogrenci.Id; // Öğrenci numarasına göre karşılaştırma
	}
	
	public String toString() {
        return "Ogrenci{" + "id='" + Id + '\'' +", ad='" + ad + '\'' + ", soyad='" + soyad + '\'' +
                ", email='" + email + '\'' +
                ", sifre='" + password + '\'' + '}';
    }
	public String toString1() {
		return Id +  ad +  soyad ;
	}
}



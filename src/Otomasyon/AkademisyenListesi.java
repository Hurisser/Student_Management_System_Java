package Otomasyon;
import java.util.HashMap;

public class AkademisyenListesi {
	
	
	  protected static HashMap<Integer, Akademisyen> akademisyenListesi = new HashMap<>();

	    public static Akademisyen getAkademisyenListesi(int Id) {
	        return akademisyenListesi.get(Id);
	    }

	    public AkademisyenListesi() {
	    	akademisyenListesi.put(1001, new Akademisyen("9", "Pelin", "Görgel", "pelin.gorgel@iuc.edu.tr", "+90 212 404 0300 ", "Nesneye Yönelik Programlama"));
	    	akademisyenListesi.put(1002, new Akademisyen("10", "Sibel", "Senan", "ssenan@iuc.edu.tr", "+90 212 473 7070", "Differancial Equations"));
	    	akademisyenListesi.put(1003, new Akademisyen("11", "Özgür Can", "Turna", "ozgurcan.turna@iuc.edu.tr", "+90 212 473 7070 ", "Veri Yapıları"));
	    	akademisyenListesi.put(1004, new Akademisyen("12", "Fatih", "Keleş", "fkeles@iuc.edu.tr", "+90 212 473 7070", "Devreler ve Sistemler"));
	    	akademisyenListesi.put(1005, new Akademisyen("13", "Mustafa", "Dağtekin", "dagtekin@iuc.edu.tr", "+90 212 404 0300", "Olasılık ve İstatistik"));
	    	akademisyenListesi.put(1006, new Akademisyen("14", "Muhammet Erdem", "İsenkul", "eisenkul@iuc.edu.tr", "+90 212 473 7070 ", "Lojik Devre Tasarımı"));
	    
	    for(int i = 1; i < akademisyenListesi.size() + 1; i++)
	     {
	    	akademisyenListesi.get(1000 +i).Id = 1000 + i;
	     }
	    
	    
	    }
}

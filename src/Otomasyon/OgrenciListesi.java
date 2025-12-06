package Otomasyon;

import java.util.HashMap;

public class OgrenciListesi{
	
	
	
	    public static HashMap<Integer, Ogrenci> ogrenciListesi = new HashMap<>();
	     public OgrenciListesi() {
	    		 ogrenciListesi.put(1, new Ogrenci("2004", "Esma", "Hacıhasanoğlu", "esmah.2004@gmail.com", "05538538069"));
	    	     ogrenciListesi.put(2, new Ogrenci("5", "Kağan", "Kocadağ", "kagankocadag@gmail.com", "05367248063"));
	    	     ogrenciListesi.put(3, new Ogrenci("6", "Yiğit", "Çalışkan", "yigithancaliskan@gmail.com", "05447753565"));
	    	     ogrenciListesi.put(4, new Ogrenci("7", "Huriser", "Ergün", "hurisserergun@gmail.com", "05350672216"));
	    	     ogrenciListesi.put(5, new Ogrenci("8", "Ömer", "İşcanlı", "omerfaruk.iscanlisbs@gmail.com", "05458258864"));
	    	     ogrenciListesi.put(6, new Ogrenci("1967", "Emir", "Taç", "emirtac.2004@gmail.com", "05397104356"));
	    	     ogrenciListesi.put(7, new Ogrenci("10", "Yasin", "Şen", "yasinsen.2004@gmail.com", "05071048142"));
	    	     ogrenciListesi.put(8, new Ogrenci("11", "Emine", "Ersöz", "emineersöz@gmail.com", "05456648591"));
	    	     
	    	     
	    	     for(int i = 1; i < ogrenciListesi.size() + 1; i++)
	    	     {
	    	    	ogrenciListesi.get(i).Id = i;
	    	     }
	     }

	    public static Ogrenci getOgrenciListesi(int Id) {
	        return ogrenciListesi.get(Id);
	    }
	    
	    //public static getID ()
	    
	   
	     
}



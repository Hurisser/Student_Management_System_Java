package Otomasyon;

import java.util.HashMap;

public class DersNotları {

	  public static HashMap<Integer, Dersler> notlar = new HashMap<>();
	   DersNotları(){
	     notlar.put(1, new Dersler(0.0, 64.0, 82.0, 45.0, 0.0, 50.0));
	     notlar.put(2, new Dersler(0.0, 67.0, 0.0, 60.0, 0.0, 40.0));
	     notlar.put(3, new Dersler(0.0, 45.0, 0.0, 60.0, 0.0, 50.0));
	     notlar.put(4, new Dersler(0.0, 85.0, 0.0, 60.0, 0.0, 0.0));
	     notlar.put(5, new Dersler(0.0, 50.0, 0.0, 78.0, 0.0, 50.0));
	     notlar.put(6, new Dersler(0.0, 59.0, 56.0, 45.0, 0.0, 55.0));
	     notlar.put(7, new Dersler(0.0, 64.0, 23.0, 45.0, 0.0, 10.0));
	     notlar.put(8, new Dersler(0.0, 38.0, 0.0, 45.0, 0.0, 20.0));
	     
	     for(int i = 1; i < notlar.size() + 1 ; i++)
	     {
	    	OgrenciListesi.ogrenciListesi.get(i).dersler = notlar.get(i);//öğrencinin derrsler değişkenini günceller
	     }
	   }
	    
}

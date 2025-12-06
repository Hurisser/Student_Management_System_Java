package Otomasyon;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;


public class OgrenciListesiGoruntuleme extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Akademisyen akademisyen) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OgrenciListesiGoruntuleme frame = new OgrenciListesiGoruntuleme(akademisyen);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OgrenciListesiGoruntuleme(Akademisyen akademisyen) {
		setTitle("Öğrenci Listesi Görüntüleme");
		try {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 623, 476);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("ID");
			lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel.setBounds(130, 60, 90, 25);
			contentPane.add(lblNewLabel);
			
			JLabel lblIsim = new JLabel("İSİM");
			lblIsim.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblIsim.setBounds(200, 60, 90, 25);
			contentPane.add(lblIsim);
			
			JLabel lblSoyisim = new JLabel("SOYİSİM");
			lblSoyisim.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblSoyisim.setBounds(300, 60, 90, 25);
			contentPane.add(lblSoyisim);
			
			JLabel lblNewLabel_1 = new JLabel("İSTANBUL ÜNİVERSİTESİ CERRAHPAŞA ÖĞRENCİ OTOMASYON SİSTEMİ");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
			lblNewLabel_1.setBounds(10, 11, 606, 41);
			contentPane.add(lblNewLabel_1);
			
			
			int x = 100; // İlk JLabel'in başlangıç noktası
	        for (Ogrenci ogrenci : OgrenciListesi.ogrenciListesi.values()) {
	            JLabel Idler = new JLabel(Integer.toString(ogrenci.getId()));
	            Idler.setBounds(130, x, 300, 25);
	            contentPane.add(Idler);
	            x += 30; // Bir sonraki JLabel için aralık
	        }

			 int y = 100;// İlk JLabel'in başlangıç noktası
	        for (Ogrenci ogrenci : OgrenciListesi.ogrenciListesi.values()) {
	            JLabel Idler = new JLabel(ogrenci.getAd());
	            Idler.setBounds(200, y, 300, 25);
	            contentPane.add(Idler);
	            y += 30; // Bir sonraki JLabel için aralık
	        }

			int z = 100; // İlk JLabel'in başlangıç noktası
	        for (Ogrenci ogrenci : OgrenciListesi.ogrenciListesi.values()) {
	            JLabel Idler = new JLabel(ogrenci.getSoyad());
	            Idler.setBounds(300, z, 300, 25);
	            contentPane.add(Idler);
	            z += 30; // Bir sonraki JLabel için aralık
	        }
	        int q = 100; // İlk JLabel'in başlangıç noktası
	        switch (akademisyen.getid()){

	        case 1001:
	            for (Ogrenci ogrenci : OgrenciListesi.ogrenciListesi.values()) {
	                JLabel Idler = new JLabel(""+ ogrenci.dersler.getnyp());
	                Idler.setBounds(500, q, 300, 25);
	                contentPane.add(Idler);
	                q += 30; // Bir sonraki JLabel için aralık
	            }
	            break;
	        case 1002:
	            for (Ogrenci ogrenci : OgrenciListesi.ogrenciListesi.values()) {
	                JLabel Idler = new JLabel(""+ ogrenci.dersler.getdiff());
	                Idler.setBounds(500, q, 300, 25);
	                contentPane.add(Idler);
	                q += 30; // Bir sonraki JLabel için aralık
	            }
	            break;
	        case 1003:
	            for (Ogrenci ogrenci : OgrenciListesi.ogrenciListesi.values()) {
	                JLabel Idler = new JLabel(""+ ogrenci.dersler.getvy());
	                Idler.setBounds(500, q, 300, 25);
	                contentPane.add(Idler);
	                q += 30; // Bir sonraki JLabel için aralık
	            }
	            break;
	        case 1004:
	            for (Ogrenci ogrenci : OgrenciListesi.ogrenciListesi.values()) {
	                JLabel Idler = new JLabel(""+ ogrenci.dersler.getdvs());
	                Idler.setBounds(500, q, 300, 25);
	                contentPane.add(Idler);
	                q += 30; // Bir sonraki JLabel için aralık
	            }
	            break;
	        case 1005:
	            for (Ogrenci ogrenci : OgrenciListesi.ogrenciListesi.values()) {
	                JLabel Idler = new JLabel(""+ ogrenci.dersler.getolasilik());
	                Idler.setBounds(500, q, 300, 25);
	                contentPane.add(Idler);
	                q += 30; // Bir sonraki JLabel için aralık
	            }
	            break;
	        case 1006:
	            for (Ogrenci ogrenci : OgrenciListesi.ogrenciListesi.values()) {
	                JLabel Idler = new JLabel(""+ ogrenci.dersler.getldt());
	                Idler.setBounds(500, q, 300, 25);
	                contentPane.add(Idler);
	                q += 30; // Bir sonraki JLabel için aralık
	            }
	            break;
	         }
	        JButton btnNewButton_1 = new JButton("GERİ");
	        btnNewButton_1.setLocation(497, 386);
	        btnNewButton_1.setSize(102, 30);
			btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
			
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AkademisyenGiris a_giris = new AkademisyenGiris(akademisyen);  // Giriş penceresini tekrar oluşturuyoruz
					a_giris.setVisible(true);  // Giriş penceresini görünür yapıyoruz
	                dispose();  
				}
			});
		contentPane.add(btnNewButton_1);
		
		JLabel lblNot = new JLabel("NOT");
		lblNot.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		lblNot.setBounds(500, 60, 90, 25);
		contentPane.add(lblNot);
		
		

		}
		
		catch (NumberFormatException e) {
			}
	}
}	        





	       
				



package Otomasyon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class OgrenciGiris extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Ogrenci ogrenci) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OgrenciGiris frame = new OgrenciGiris(ogrenci);
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
	public OgrenciGiris(Ogrenci ogrenci) {
		setTitle("ÖĞRENCİ ANA SAYFA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("DERS KAYIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DersSecimi derssecimi = new DersSecimi(ogrenci);
				derssecimi.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnNewButton.setBounds(35, 187, 300, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNotTakibi = new JButton("NOT BİLGİLERİ");
		btnNotTakibi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NotGörüntüleme frame = new NotGörüntüleme(ogrenci);                // ÜÇ SATIRLIK KOD
				frame.setVisible(true);
				dispose();
			}
		});
		btnNotTakibi.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnNotTakibi.setBounds(35, 239, 300, 41);
		contentPane.add(btnNotTakibi);
		
		JButton btnDevamszlkBilgileri = new JButton("DEVAMSIZLIK BİLGİLERİ");
		btnDevamszlkBilgileri.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnDevamszlkBilgileri.setBounds(35, 291, 300, 41);
		contentPane.add(btnDevamszlkBilgileri);
		
		JButton btnDersProgram = new JButton("DERS PROGRAMI");
		btnDersProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDersProgram.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnDersProgram.setBounds(35, 343, 300, 41);
		contentPane.add(btnDersProgram);
		
		JButton btnStajBilgileri = new JButton("STAJ BİLGİLERİ");
		btnStajBilgileri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStajBilgileri.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnStajBilgileri.setBounds(35, 395, 300, 41);
		contentPane.add(btnStajBilgileri);
		
		JButton btnKulpEtkinlikleri = new JButton("KULÜP ETKİNLİKLERİ");
		btnKulpEtkinlikleri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKulpEtkinlikleri.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnKulpEtkinlikleri.setBounds(35, 447, 300, 41);
		contentPane.add(btnKulpEtkinlikleri);
		
		JLabel lblNewLabel = new JLabel("İSTANBUL ÜNİVERSİTESİ CERRAHPAŞA ÖĞRENCİ OTOMASYON SİSTEMİ");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(75, 24, 606, 41);
		contentPane.add(lblNewLabel);
		
		JLabel ogr_ad = new JLabel("AD SOYAD: " + ogrenci.getAd() + " " + ogrenci.getSoyad());
		ogr_ad.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
		ogr_ad.setBounds(431,233, 314, 55); // JLabel'in konum ve boyutunu ayarla
	    getContentPane().setLayout(null); // Frame'in layout'unu null yap
	    getContentPane().add(ogr_ad);
	    
	    JLabel ogr_id = new JLabel("ÖĞRENCİ NUMARASI: " + ogrenci.getId());
	    ogr_id.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
	    ogr_id.setBounds(431,201, 314, 55); 
	    getContentPane().setLayout(null); 
	    getContentPane().add(ogr_id);
	    
	    JLabel ogr_email = new JLabel("ÖĞRENCİ MAİL: " + ogrenci.getEmail());
	    ogr_email.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
	    ogr_email.setBounds(431,267, 314, 55); 
	    getContentPane().setLayout(null); 
	    getContentPane().add(ogr_email);
	    
	    JButton btnNewButton_1 = new JButton("OTURUMU KAPAT");
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {

				Giris girisFrame = new Giris();  // Giriş penceresini tekrar oluşturuyoruz
                girisFrame.setVisible(true);  // Giriş penceresini görünür yapıyoruz
                dispose();  
	    	}
	    });
	    btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
	    btnNewButton_1.setBounds(502, 447, 179, 42);
	    contentPane.add(btnNewButton_1);
	    
	    
		
	}
}

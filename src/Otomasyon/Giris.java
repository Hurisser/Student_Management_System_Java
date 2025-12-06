package Otomasyon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Giris extends JFrame {
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textid;
	private JPasswordField textşifre;
	
	public void kayitOlma() {
		KayitOl KayitOl = new KayitOl();
		KayitOl.setVisible(true);
		dispose();
	};
	
	public void logIn(JTextField textid, JTextField textşifre) {
		try {
				
				int textid2 = Integer.parseInt(textid.getText());
				
				if (OgrenciListesi.ogrenciListesi.containsKey(textid2)) {
			
						    Ogrenci ogrenci = OgrenciListesi.getOgrenciListesi(textid2);
						    
						    if (ogrenci.password.equals(textşifre.getText())) {
						        // Giriş başarılı
						        JOptionPane.showMessageDialog(this, "Giriş başarılı!");
						        OgrenciGiris ogrencigiris = new OgrenciGiris(ogrenci);
								ogrencigiris.setVisible(true);
								dispose();
								
						    } else {
						        JOptionPane.showMessageDialog(this, "Şifre yanlış!");
						    }
				} 
	
				else if( AkademisyenListesi.akademisyenListesi.containsKey(textid2)) {
				
						   Akademisyen akademisyen = AkademisyenListesi.getAkademisyenListesi(textid2);
						    
						    if (akademisyen.password.equals(textşifre.getText())) {
						        // Giriş başarılı
						        JOptionPane.showMessageDialog(this, "Giriş başarılı!");
						        AkademisyenGiris akademisyengiris = new AkademisyenGiris(akademisyen);
								akademisyengiris.setVisible(true);
								dispose();  
						    } 
						    else {
						        JOptionPane.showMessageDialog(this, "Şifre yanlış!");
						    }
			} 
				else {
			    JOptionPane.showMessageDialog(this, "Kullanıcı bulunamadı!");
			}
				
		}
		
		catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(this, "Lütfen geçerli bir ID girin!");
	    }

};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new OgrenciListesi();     //OgrenciListesi ogrenciler = 
		new AkademisyenListesi();   //AkademisyenListesi akademisyenler = 
		new DersNotları();          //DersNotları ogrencinotları = 
					
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Giris frame = new Giris();
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
	public Giris() {
		setTitle("GİRİŞ EKRANI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(172, 137, 128, 39);
		contentPane.add(lblNewLabel);
		
		textid = new JTextField();
		textid.setBounds(273, 137, 170, 39);
		contentPane.add(textid);
		textid.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("GİRİŞ");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {                 //LOGIN ACTİON LİSTENER: GİRİŞ
			public void actionPerformed(ActionEvent e) {
				logIn(textid, textşifre);
				
			}
		});
		btnNewButton.setBounds(315, 288, 128, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("KAYIT OLMAK İÇİN TIKLAYINIZ");
		btnNewButton_1.addActionListener(new ActionListener() {              //LOGIN ACT_LİST : KAYIT OL
			public void actionPerformed(ActionEvent e) {
				kayitOlma();        //bu sadece kayıt olma ekranına götüren buton
			}
		});
		
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnNewButton_1.setBounds(96, 391, 215, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblifre = new JLabel("ŞİFRE:");
		lblifre.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblifre.setBounds(172, 207, 128, 39);
		contentPane.add(lblifre);
		
		textşifre = new JPasswordField();
		textşifre.setBounds(273, 207, 170, 39);
		contentPane.add(textşifre);
		
		JLabel lblNewLabel_1 = new JLabel("İSTANBUL ÜNİVERSİTESİ CERRAHPAŞA ÖĞRENCİ OTOMASYON SİSTEMİ");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(10, 42, 606, 41);
		contentPane.add(lblNewLabel_1);
	}
}


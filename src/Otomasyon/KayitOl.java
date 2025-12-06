package Otomasyon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KayitOl extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ad1;
	private JTextField soyad1;
	private JTextField email1;
	private JTextField telNo1;
	private JTextField password1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KayitOl frame = new KayitOl();
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
	public KayitOl() {
		setTitle("KAYIT OL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("İSİM:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(100, 90, 94, 31);
		contentPane.add(lblNewLabel);
		
		ad1 = new JTextField();
		ad1.setBounds(261, 94, 237, 26);
		contentPane.add(ad1);
		ad1.setColumns(10);
		
		JLabel lblSoyisim = new JLabel("SOYİSİM:");
		lblSoyisim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoyisim.setBounds(100, 132, 94, 31);
		contentPane.add(lblSoyisim);
		
		JLabel lblEmail = new JLabel("EMAİL:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(100, 174, 94, 31);
		contentPane.add(lblEmail);
		
		JLabel lblTelNo = new JLabel("TEL NO:");
		lblTelNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelNo.setBounds(100, 216, 94, 31);
		contentPane.add(lblTelNo);
		
		JLabel lblifreBelirleyin = new JLabel("ŞİFRE BELİRLEYİN:");
		lblifreBelirleyin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblifreBelirleyin.setBounds(100, 258, 143, 31);
		contentPane.add(lblifreBelirleyin);
		
		soyad1 = new JTextField();
		soyad1.setColumns(10);
		soyad1.setBounds(261, 131, 237, 26);
		contentPane.add(soyad1);
		
		email1 = new JTextField();
		email1.setColumns(10);
		email1.setBounds(261, 174, 237, 26);
		contentPane.add(email1);
		
		telNo1 = new JTextField();
		telNo1.setColumns(10);
		telNo1.setBounds(261, 220, 237, 26);
		contentPane.add(telNo1);
		
		password1 = new JTextField();
		password1.setColumns(10);
		password1.setBounds(261, 262, 237, 26);
		contentPane.add(password1);
		
		JButton btnNewButton = new JButton("KAYIT OL");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				 String ad = ad1.getText();
                 String soyad = soyad1.getText();
                 String email = email1.getText();
                 String telNo = telNo1.getText();
                 String password = password1.getText();
                 
                 Ogrenci ogrenci = new Ogrenci(password, ad, soyad, email, telNo);
                 
                 int newId = OgrenciListesi.ogrenciListesi.size() + 1;
                 ogrenci.setId(newId);

                 OgrenciListesi.ogrenciListesi.put(newId, ogrenci);
                 
                 if (ad1.getText().isEmpty() || soyad1.getText().isEmpty() || email1.getText().isEmpty() || telNo1.getText().isEmpty() || password1.getText().isEmpty()) {
                     JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurunuz!", "Hata", JOptionPane.ERROR_MESSAGE);
                 } else {
                	 JOptionPane.showMessageDialog(null, "Öğrenci kaydedildi!\nGiriş ekranına yönlendiriliyorsunuz."+"\nÖğrenci Id:"+newId);
                	 Giris girisFrame = new Giris();  // Giriş penceresini tekrar oluşturuyoruz
                     girisFrame.setVisible(true);  // Giriş penceresini görünür yapıyoruz
                     dispose();  
     		        }
                 
                 
				
				
				
			}
		});
		btnNewButton.setBounds(355, 349, 143, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("İSTANBUL ÜNİVERSİTESİ CERRAHPAŞA ÖĞRENCİ OTOMASYON SİSTEMİ");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(24, 22, 606, 41);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("GERİ");
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Giris girisFrame = new Giris();  // Giriş penceresini tekrar oluşturuyoruz
                girisFrame.setVisible(true);  // Giriş penceresini görünür yapıyoruz
                dispose();  
			}
		});
		btnNewButton_1.setBounds(100, 389, 108, 31);
		contentPane.add(btnNewButton_1);
	}
}

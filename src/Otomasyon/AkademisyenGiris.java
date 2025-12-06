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

public class AkademisyenGiris extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Akademisyen akademisyen) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AkademisyenGiris frame = new AkademisyenGiris(akademisyen);
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
	public AkademisyenGiris(Akademisyen akademisyen) {
		setTitle("AKADEMİSYEN ANA SAYFA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnrenciListesiGrntleme = new JButton("ÖĞRENCİ LİSTESİ GÖRÜNTÜLEME");
		btnrenciListesiGrntleme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OgrenciListesiGoruntuleme ogrListGor = new OgrenciListesiGoruntuleme(akademisyen);  // Giriş penceresini tekrar oluşturuyoruz
                ogrListGor.setVisible(true);  // Giriş penceresini görünür yapıyoruz
                dispose();
			}
		});
		btnrenciListesiGrntleme.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnrenciListesiGrntleme.setBounds(29, 187, 369, 41);
		contentPane.add(btnrenciListesiGrntleme);
		
		JButton btnrenciNotuSorgulama = new JButton("ÖĞRENCİ NOT GİRME");
		btnrenciNotuSorgulama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NotGirme notgir = new NotGirme(akademisyen);  // Giriş penceresini tekrar oluşturuyoruz
				notgir.setVisible(true);  // Giriş penceresini görünür yapıyoruz
                dispose();
			}
			
		});
		
		btnrenciNotuSorgulama.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnrenciNotuSorgulama.setBounds(29, 242, 369, 41);
		contentPane.add(btnrenciNotuSorgulama);
		
		JButton btnDersOnay = new JButton("DERS ONAY");
		btnDersOnay.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnDersOnay.setBounds(29, 294, 369, 41);
		contentPane.add(btnDersOnay);
		
		JLabel akd_id = new JLabel("ID: " + akademisyen.getid());
		akd_id.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
		akd_id.setBounds(437, 216, 314, 55);
		contentPane.add(akd_id);
		
		JLabel akd_ad_soyad = new JLabel("AD SOYAD: " + akademisyen.getad() + " " +akademisyen.getsoyad());
		akd_ad_soyad.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
		akd_ad_soyad.setBounds(437, 181, 314, 55);
		contentPane.add(akd_ad_soyad);
		
		JLabel akd_email = new JLabel("MAİL: " + akademisyen.getemail());
		akd_email.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
		akd_email.setBounds(437, 288, 314, 55);
		contentPane.add(akd_email);
		
		JLabel ders = new JLabel("DERS: " + akademisyen.getders());
		ders.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
		ders.setBounds(437, 252, 314, 55);
		contentPane.add(ders);
		
		JLabel lblNewLabel = new JLabel("İSTANBUL ÜNİVERSİTESİ CERRAHPAŞA ÖĞRENCİ OTOMASYON SİSTEMİ");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(59, 25, 606, 41);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("OTURUMU KAPAT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Giris girisFrame = new Giris();  // Giriş penceresini tekrar oluşturuyoruz
                girisFrame.setVisible(true);  // Giriş penceresini görünür yapıyoruz
                dispose();  
			}
		});
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnNewButton_1.setBounds(530, 423, 179, 42);
		contentPane.add(btnNewButton_1);
		
		
		
	}
}

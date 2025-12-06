package Otomasyon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotGirme extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Akademisyen akademisyen) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotGirme frame = new NotGirme(akademisyen);
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
	public NotGirme(Akademisyen akademisyen) {
		setTitle("NOT GİRME EKRANI");
		try {
			
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 647, 506);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("İSTANBUL ÜNİVERSİTESİ CERRAHPAŞA ÖĞRENCİ OTOMASYON SİSTEMİ");
			lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1.setBounds(17, 11, 606, 41);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel = new JLabel("ÖĞRENCİ NUMARASI GİRİNİZ");
			lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 12));
			lblNewLabel.setBounds(96, 116, 174, 28);
			contentPane.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(280, 115, 206, 31);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("NOT GİRİNİZ");
			lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 12));
			lblNewLabel_2.setBounds(96, 175, 174, 28);
			contentPane.add(lblNewLabel_2);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(280, 174, 206, 31);
			contentPane.add(textField_1);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setBounds(169, 300, 91, 80);
			contentPane.add(lblNewLabel_3);
			JLabel lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setBounds(300, 300, 150, 80);
			contentPane.add(lblNewLabel_4);
			JLabel lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_5.setBounds(100, 300, 121, 80);
			contentPane.add(lblNewLabel_5);
			JLabel lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setBounds(500, 300, 121, 80);
			contentPane.add(lblNewLabel_6);
			
			
			JButton btnNewButton = new JButton("KAYDET");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						if (textField.getText().isEmpty() || textField_1.getText().isEmpty()) {
					            JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun!");
					            return;
					        }
						 
						
						
						int  id = Integer.parseInt(textField.getText());
						int not =  Integer.parseInt(textField_1.getText());
	
						lblNewLabel_3.setText(""+ OgrenciListesi.ogrenciListesi.get(id).getAd());
						

						lblNewLabel_4.setText(""+ OgrenciListesi.ogrenciListesi.get(id).getSoyad());
						
						lblNewLabel_5.setText(""+ OgrenciListesi.ogrenciListesi.get(id).getId());
						
						lblNewLabel_6.setText(""+ not);
						
						contentPane.revalidate(); // Paneli yeniden çiz
				        contentPane.repaint();
				        
				        
				        switch (akademisyen.getid()){

				        case 1001:
				        	OgrenciListesi.ogrenciListesi.get(id).dersler.setnyp(not);
				            break;
				        case 1002:
				        	OgrenciListesi.ogrenciListesi.get(id).dersler.setdiff(not);

				            break;
				        case 1003:
				        	OgrenciListesi.ogrenciListesi.get(id).dersler.setvy(not);

				            break;
				        case 1004:
				        	OgrenciListesi.ogrenciListesi.get(id).dersler.setdvs(not);

				            break;
				        case 1005:
				        	OgrenciListesi.ogrenciListesi.get(id).dersler.setolasilik(not);

				            break;
				        case 1006:
				        	OgrenciListesi.ogrenciListesi.get(id).dersler.setldt(not);

				            break;
				         }
				        
				        
				        
						}
						catch (NumberFormatException ex) {
					        JOptionPane.showMessageDialog(null, "Lütfen geçerli bir sayı girin!");
					    }
					}
				});
				btnNewButton.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 11));
				btnNewButton.setBounds(480, 216, 114, 28);
				contentPane.add(btnNewButton);
				
				JLabel lblNewLabel_7 = new JLabel("ID");
				lblNewLabel_7.setFont(new Font("Sitka Text", Font.BOLD, 13));
				lblNewLabel_7.setBounds(96, 267, 80, 22);
				contentPane.add(lblNewLabel_7);
				
				JLabel lblNewLabel_7_1 = new JLabel("SOYİSİM");
				lblNewLabel_7_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
				lblNewLabel_7_1.setBounds(297, 267, 80, 22);
				contentPane.add(lblNewLabel_7_1);
				
				JLabel lblNewLabel_7_2 = new JLabel("İSİM");
				lblNewLabel_7_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
				lblNewLabel_7_2.setBounds(163, 267, 80, 22);
				contentPane.add(lblNewLabel_7_2);
				
				JLabel lblNewLabel_7_3 = new JLabel("NOT");
				lblNewLabel_7_3.setFont(new Font("Sitka Text", Font.BOLD, 13));
				lblNewLabel_7_3.setBounds(500, 267, 80, 22);
				contentPane.add(lblNewLabel_7_3);
				
				JButton btnNewButton_1 = new JButton("GERİ");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AkademisyenGiris a_giris = new AkademisyenGiris(akademisyen);  // Giriş penceresini tekrar oluşturuyoruz
						a_giris.setVisible(true);  // Giriş penceresini görünür yapıyoruz
		                dispose();  
					}
				});
				btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
				btnNewButton_1.setBounds(492, 403, 102, 30);
				contentPane.add(btnNewButton_1);
	
	}
	catch (NumberFormatException e) {
	}
	}

}

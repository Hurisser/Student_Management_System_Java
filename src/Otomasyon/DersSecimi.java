package Otomasyon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DersSecimi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Ogrenci ogrenci) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DersSecimi frame = new DersSecimi(ogrenci);
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
	public DersSecimi(Ogrenci ogrenci) {
		setTitle("DERS SEÇİMİ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_14 = new JCheckBox("BIMU2058 DEVRELER VE SİSTEMLER (Zorunlu)");
		chckbxNewCheckBox_14.setBounds(170, 158, 337, 44);
		contentPane.add(chckbxNewCheckBox_14);
		
		JCheckBox chckbxNewCheckBox_15 = new JCheckBox("BIMU2059 DIFFERENTIAL EQUATIONS (Zorunlu)");
		chckbxNewCheckBox_15.setBounds(170, 205, 337, 44);
		contentPane.add(chckbxNewCheckBox_15);
		
		JCheckBox chckbxNewCheckBox_16 = new JCheckBox("BIMU2005 LOJİK DEVRE TASARIMI (Zorunlu)");
		chckbxNewCheckBox_16.setBounds(170, 252, 337, 44);
		contentPane.add(chckbxNewCheckBox_16);
		
		JCheckBox chckbxNewCheckBox_17 = new JCheckBox("BIMU2007 NESNEYE YÖNELİK PROGRAMLAMA (Zorunlu)");
		chckbxNewCheckBox_17.setBounds(170, 299, 417, 44);
		contentPane.add(chckbxNewCheckBox_17);
		
		JCheckBox chckbxNewCheckBox_18 = new JCheckBox("BIMU2004 OLASILIK TEORİSİ VE İSTATİSTİK (Zorunlu)");
		chckbxNewCheckBox_18.setBounds(170, 346, 417, 44);
		contentPane.add(chckbxNewCheckBox_18);
		
		JCheckBox chckbxNewCheckBox_19 = new JCheckBox("BIMU2057 VERİ YAPILARI (Zorunlu)");
		chckbxNewCheckBox_19.setBounds(170, 393, 342, 44);
		contentPane.add(chckbxNewCheckBox_19);
		
		JLabel lblNewLabel = new JLabel("İSTANBUL ÜNİVERSİTESİ CERRAHPAŞA ÖĞRENCİ OTOMASYON SİSTEMİ");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(67, 11, 606, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("GERİ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 OgrenciGiris ogrencigiris = new OgrenciGiris(ogrenci);
					ogrencigiris.setVisible(true);
					dispose();
			}
		});
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 15));
		btnNewButton.setBounds(67, 478, 114, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("2. SINIF GÜZ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(170, 110, 337, 41);
		contentPane.add(lblNewLabel_1);
		
		JButton btnKaydet = new JButton("KAYDET");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!chckbxNewCheckBox_14.isSelected() ||
	                    !chckbxNewCheckBox_15.isSelected() ||
	                    !chckbxNewCheckBox_16.isSelected() ||
	                    !chckbxNewCheckBox_17.isSelected() ||
	                    !chckbxNewCheckBox_18.isSelected() ||
	                    !chckbxNewCheckBox_19.isSelected()) {
	                    
	                    
	                    JOptionPane.showMessageDialog(contentPane,
	                            "Tüm dersleri seçmelisiniz","Uyarı",JOptionPane.WARNING_MESSAGE);
	                } else {
	                    JOptionPane.showMessageDialog(contentPane,
	                            "Ders seçiminiz başarıyla tamamlandı!","Bilgi",JOptionPane.INFORMATION_MESSAGE);
	                }
	            }

		});
		btnKaydet.setFont(new Font("Sitka Text", Font.BOLD, 15));
		btnKaydet.setBounds(559, 445, 114, 33);
		contentPane.add(btnKaydet);
		
		
	}
}

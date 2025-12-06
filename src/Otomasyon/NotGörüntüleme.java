package Otomasyon;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotGörüntüleme extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Ogrenci ogrenci) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotGörüntüleme frame = new NotGörüntüleme(ogrenci);
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
	public NotGörüntüleme(Ogrenci ogrenci) {
		try {
			
			setTitle("NOT GÖRÜNTÜLEME");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 658, 529);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			lblNewLabel = new JLabel("DERSLER");
			lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel.setBounds(57, 48, 376, 30);
			contentPane.add(lblNewLabel);
			
			lblNewLabel_1 = new JLabel("NOTLAR");
			lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_1.setBounds(460, 48, 117, 30);
			contentPane.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("BIMU2058 DEVRELER VE SİSTEMLER");
			lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_2.setBounds(57, 92, 376, 30);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("BIMU2059 DIFFERENTIAL EQUATIONS");
			lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_3.setBounds(57, 133, 376, 30);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("BIMU2005 LOJİK DEVRE TASARIMI");
			lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_4.setBounds(57, 174, 376, 30);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("BIMU2007 NESNEYE YÖNELİK PROGRAMLAMA");
			lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_5.setBounds(57, 215, 376, 30);
			contentPane.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("BIMU2004 OLASILIK TEORİSİ VE İSTATİSTİK\t");
			lblNewLabel_6.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_6.setBounds(57, 256, 376, 30);
			contentPane.add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("BIMU2057 VERİ YAPILARI");
			lblNewLabel_7.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_7.setBounds(57, 299, 376, 30);
			contentPane.add(lblNewLabel_7);
			
			JLabel dvs = new JLabel(" " + ogrenci.dersler.getdvs());
			dvs.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			dvs.setBounds(460, 89, 117, 30);
			contentPane.add(dvs);
			
			JLabel diff = new JLabel(" " + ogrenci.dersler.getdiff());
			diff.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			diff.setBounds(460, 133, 117, 30);
			contentPane.add(diff);
			
			JLabel ldt = new JLabel(" " + ogrenci.dersler.getldt());
			ldt.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			ldt.setBounds(460, 174, 117, 30);
			contentPane.add(ldt);
			
			JLabel nyp = new JLabel(" " + ogrenci.dersler.getnyp());
			nyp.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			nyp.setBounds(460, 215, 117, 30);
			contentPane.add(nyp);
			
			JLabel olasilik = new JLabel(" " + ogrenci.dersler.getolasilik());
			olasilik.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			olasilik.setLocation(460, 254);
			olasilik.setSize(117, 30);
			contentPane.add(olasilik);
			
			JLabel vy = new JLabel(" " + ogrenci.dersler.getvy());
			vy.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			vy.setBounds(460, 299, 117, 30);
			contentPane.add(vy);
			
			btnNewButton = new JButton("GERİ");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					OgrenciGiris ogrencigiris = new OgrenciGiris(ogrenci);
					ogrencigiris.setVisible(true);
					dispose();
				}
			});
			btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 15));
			btnNewButton.setBounds(470, 410, 107, 38);
			contentPane.add(btnNewButton);
		}
		catch(Exception e){
			
		}
		
		
		 
	}
}

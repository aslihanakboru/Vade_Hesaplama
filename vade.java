package java_odev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vade {

	private JFrame frmVadeFarkiHesabi;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vade window = new vade();
					window.frmVadeFarkiHesabi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vade() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVadeFarkiHesabi = new JFrame();
		frmVadeFarkiHesabi.setTitle("Vade Farki Hesabi");
		frmVadeFarkiHesabi.getContentPane().setBackground(new Color(240, 255, 240));
		frmVadeFarkiHesabi.setBounds(100, 100, 524, 458);
		frmVadeFarkiHesabi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVadeFarkiHesabi.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Ana Para :");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl1.setBounds(37, 53, 115, 33);
		frmVadeFarkiHesabi.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("Vade :");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl2.setBounds(37, 111, 115, 33);
		frmVadeFarkiHesabi.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("Oran :");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl3.setBounds(37, 171, 115, 33);
		frmVadeFarkiHesabi.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("Odenecek Tutar :");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl4.setBounds(26, 273, 174, 33);
		frmVadeFarkiHesabi.getContentPane().add(lbl4);
		
		textField = new JTextField();
		textField.setBounds(221, 50, 227, 33);
		frmVadeFarkiHesabi.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(221, 165, 227, 33);
		frmVadeFarkiHesabi.getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox.setBounds(221, 111, 227, 26);
		frmVadeFarkiHesabi.getContentPane().add(comboBox);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double anapara = Double.parseDouble(textField.getText());
				String vade1=String.valueOf(comboBox.getSelectedItem());
				int vade = Integer.parseInt(vade1);
				double oran=Double.parseDouble(textField_1.getText());
				
				double sonuc = Math.round(anapara*(1+oran*vade/12));
				textField_2.setText(String.valueOf(sonuc));
			}
		});
		btnHesapla.setBounds(259, 214, 154, 33);
		frmVadeFarkiHesabi.getContentPane().add(btnHesapla);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(221, 267, 227, 33);
		frmVadeFarkiHesabi.getContentPane().add(textField_2);
	}
}

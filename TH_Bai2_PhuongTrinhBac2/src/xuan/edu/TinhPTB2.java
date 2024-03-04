package xuan.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TinhPTB2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKQ;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	/**
	 * Create the frame.
	 */
	public TinhPTB2() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtKQ = new JTextField();
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(159, 173, 204, 37);
		contentPane.add(txtKQ);
		
		JLabel lblKtQua = new JLabel("Kết Quả");
		lblKtQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQua.setBounds(81, 175, 68, 37);
		contentPane.add(lblKtQua);
		
		JButton btnGiai = new JButton("GIẢI");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyKQ();
			}
		});
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGiai.setBounds(222, 115, 94, 37);
		contentPane.add(btnGiai);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setColumns(10);
		txtA.setBounds(126, 44, 52, 37);
		contentPane.add(txtA);
		
		JLabel lblX = new JLabel("x^2 + ");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX.setBounds(188, 44, 52, 37);
		contentPane.add(lblX);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(238, 44, 52, 37);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(340, 44, 52, 37);
		contentPane.add(txtC);
		
		JLabel lblX_2 = new JLabel("x + ");
		lblX_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX_2.setBounds(300, 44, 42, 37);
		contentPane.add(lblX_2);
	}
	
	void XuLyKQ() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		String str_soC = txtC.getText();

		double soA = Double.parseDouble(str_soA); 
		double soB = Double.parseDouble(str_soB); 
		double soC = Double.parseDouble(str_soC); 
		double delta = Math.pow(soB, 2) - 4*soA*soC;
		
		double x, x1, x2;
		
		if(soA == 0) {
			if (soB == 0) {
				if(soC == 0) {
					txtKQ.setText("Vô số nghiệm");
				}
				else {
					txtKQ.setText("Vô nghiệm");
				}
			} 
			else {
				x = -soC/soB;
				txtKQ.setText("x = " + String.valueOf(x));
			}
		}
		else {
			if(delta < 0) {
				txtKQ.setText("Vô nghiệm");
			}
			else if(delta == 0) {
				x = -soB/(2*soA);
				txtKQ.setText("x = " + String.valueOf(x));
			}
			else {
				// Tính căn delta
				double canDelta = Math.sqrt(delta);
				x1 = (-soB + canDelta)/(2*soA);
				x2 = (-soB - canDelta)/(2*soA);
				txtKQ.setText("x1 = " + String.valueOf(x1) + "    " + "x2 = " + String.valueOf(x2));
			}
		}
	}

}

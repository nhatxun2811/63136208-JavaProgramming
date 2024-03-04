import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JButton btnTru;
	private JButton btnNhan;
	private JButton btnChia;
	private JLabel lblNhpB;
	private JTextField txtB;
	private JLabel lblKtQua;
	private JTextField txtKQ;
	
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương Trình Tính Toán Đơn Giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(70, 59, 68, 37);
		contentPane.add(lblNewLabel);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(148, 57, 276, 37);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(70, 219, 86, 37);
		contentPane.add(btnCong);
		
		btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(199, 219, 86, 37);
		contentPane.add(btnTru);
		
		btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(324, 219, 86, 37);
		contentPane.add(btnNhan);
		
		btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(452, 219, 86, 37);
		contentPane.add(btnChia);
		
		lblNhpB = new JLabel("Nhập b");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(70, 121, 68, 37);
		contentPane.add(lblNhpB);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(148, 119, 276, 37);
		contentPane.add(txtB);
		
		lblKtQua = new JLabel("Kết Quả");
		lblKtQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQua.setBounds(70, 289, 68, 37);
		contentPane.add(lblKtQua);
		
		txtKQ = new JTextField();
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(148, 287, 276, 37);
		contentPane.add(txtKQ);
	}
	
	void HamXuLyCong() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		
		double soA = Double.parseDouble(str_soA); 
		double soB = Double.parseDouble(str_soB); 
		
		double tong = soA+soB;
		txtKQ.setText(String.valueOf(tong));
	}

	void HamXuLyTru() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		
		double soA = Double.parseDouble(str_soA); 
		double soB = Double.parseDouble(str_soB); 
		
		double hieu = soA-soB;
		txtKQ.setText(String.valueOf(hieu));
	}
	
	void HamXuLyNhan() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		
		double soA = Double.parseDouble(str_soA); 
		double soB = Double.parseDouble(str_soB); 
		
		double tich = soA*soB;
		txtKQ.setText(String.valueOf(tich));
	}
	
	void HamXuLyChia() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		
		double soA = Double.parseDouble(str_soA); 
		double soB = Double.parseDouble(str_soB); 
		
		double thuong = soA/soB;
		txtKQ.setText(String.valueOf(thuong));
	}
}

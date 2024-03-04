package xuanntn.edu;

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

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTDN;
	private JTextField txtMK;
	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(23, 35, 134, 36);
		contentPane.add(lblNewLabel);
		
		txtTDN = new JTextField();
		txtTDN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTDN.setBounds(177, 35, 273, 36);
		contentPane.add(txtTDN);
		txtTDN.setColumns(10);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(23, 98, 134, 36);
		contentPane.add(lblMtKhu);
		
		txtMK = new JTextField();
		txtMK.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMK.setColumns(10);
		txtMK.setBounds(177, 98, 273, 36);
		contentPane.add(txtMK);
		
		JButton btnLogin = new JButton("ĐĂNG NHẬP");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(177, 185, 152, 36);
		contentPane.add(btnLogin);
	}
	
	void XuLyDangNhap() {
		//Lấy về tên đăng nhập và MK
		String str_Ten = txtTDN.getText();
		String str_MK = txtMK.getText();
		
		if(str_Ten.equals("63CNTT") && str_MK.equals("123")) {
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			//Ẩn form đăng nhập
			this.setVisible(false);
		}
		else {
			//Xóa dữ liệu nhập
			txtTDN.setText("");
			txtMK.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại!");
		}
	}
}

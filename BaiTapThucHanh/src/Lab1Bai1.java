import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		// Sử dụng Scanner để đọc dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);

		// Nhập họ và tên sinh viên
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();

		// Nhập điểm trung bình
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();

		// Xuất thông tin ra màn hình với định dạng
		System.out.printf("%s %.2f điểm%n", hoTen, diemTB);

		// Đóng Scanner để tránh rò rỉ bộ nhớ
		scanner.close();
	}

}

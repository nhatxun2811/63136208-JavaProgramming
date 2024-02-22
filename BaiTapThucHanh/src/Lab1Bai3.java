import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// Sử dụng Scanner để đọc dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);

		// Nhập 1 cạnh của khối lập phương
		System.out.print("Nhập cạnh của khối lập phương: ");
		double edge = scanner.nextDouble();

		// Tính thể tích của khối lập phương

		double Volume = Math.pow(edge, 3);

		// Xuất thông tin ra màn hình
		System.out.printf("Thể tích: %.2f%n", Volume);

		// Đóng Scanner để tránh rò rỉ bộ nhớ
		scanner.close();

	}

}

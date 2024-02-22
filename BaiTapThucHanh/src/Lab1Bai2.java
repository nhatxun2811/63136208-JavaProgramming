import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		// Sử dụng Scanner để đọc dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);

		// Nhập chiều dài và chiều rộng của hình chữ nhật
		System.out.print("Nhập chiều dài của hình chữ nhật: ");
		double length = scanner.nextDouble();

		System.out.print("Nhập chiều rộng của hình chữ nhật: ");
		double width = scanner.nextDouble();

		// Tính chu vi, diện tích và cạnh nhỏ nhất
		double Perimeter = (length + width) * 2;
		double Area = length * width;
		double minEdge = Math.min(length, width);

		// Xuất thông tin ra màn hình
		System.out.printf("Chu vi: %.2f%n", Perimeter);
		System.out.printf("Diện tích: %.2f%n", Area);
		System.out.printf("Cạnh nhỏ nhất: %.2f%n", minEdge);

		// Đóng Scanner để tránh rò rỉ bộ nhớ
		scanner.close();
	}
}

import java.util.Scanner;

public class Lab2Bai1 {

	public static void main(String[] args) {
		// Sử dụng Scanner để đọc dữ liệu từ bàn phím
				Scanner scanner = new Scanner(System.in);

				double a, b, x;
				
					// Nhập các hệ số của phương trình bậc 2 (a, b, c)
					System.out.print("Nhập hệ số a: ");
					a = scanner.nextDouble();

					System.out.print("Nhập hệ số b: ");
					b = scanner.nextDouble();
					// Kiểm tra delta để đảm bảo không tính căn delta của số âm
					if (a == 0) {
						if(b == 0) {
							System.out.println("Vô số nghiệm");
						}
						else {
							System.out.println("Vô nghiệm");
						}
					} 
					else {
						System.out.printf("x = %.2f%n", x = -b/a);
					}
				// Đóng Scanner để tránh rò rỉ bộ nhớ
				scanner.close();

	}

}

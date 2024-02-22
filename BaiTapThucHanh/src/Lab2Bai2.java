import java.util.Scanner;

public class Lab2Bai2 {

	public static void main(String[] args) {
		// Sử dụng Scanner để đọc dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);

		double a, b, c, x, x1, x2;
		// Tính delta
		double delta;

			// Nhập các hệ số của phương trình bậc 2 (a, b, c)
			System.out.print("Nhập hệ số a: ");
			a = scanner.nextDouble();

			System.out.print("Nhập hệ số b: ");
			b = scanner.nextDouble();

			System.out.print("Nhập hệ số c: ");
			c = scanner.nextDouble();

			delta = Math.pow(b, 2) - 4 * a * c;
			// Kiểm tra delta để đảm bảo không tính căn delta của số âm
			if(a == 0) {
				if (b == 0) {
					if(c == 0) {
						System.out.println("Vô số nghiệm");
					}
					else {
						System.out.println("Vô nghiệm");
					}
				} 
				else {
					System.out.printf("x = %.2f%n", x = -c/b);
				}
			}
			else {
				if(delta < 0) {
					System.out.println("Vô nghiệm");
				}
				else if(delta == 0) {
					System.out.printf("x = %.2f%n", x = -b/(2*a));
				}
				else {
					// Tính căn delta
					double canDelta = Math.sqrt(delta);

					System.out.printf("x1 = %.2f%n", x1 = (-b + canDelta)/(2*a));
					System.out.printf("x2 = %.2f%n", x2 = (-b - canDelta)/(2*a));
				}
			}

		// Đóng Scanner để tránh rò rỉ bộ nhớ
		scanner.close();
	}

}

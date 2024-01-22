import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
		// Sử dụng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
    	
        double a, b, c;
        // Tính delta
        double delta;

        do {
	        // Nhập các hệ số của phương trình bậc 2 (a, b, c)
	        System.out.print("Nhập hệ số a: ");
	        a = scanner.nextDouble();
	
	        System.out.print("Nhập hệ số b: ");
	        b = scanner.nextDouble();
	
	        System.out.print("Nhập hệ số c: ");
	        c = scanner.nextDouble();
	        
	        delta = Math.pow(b, 2) - 4 * a * c;
	        // Kiểm tra delta để đảm bảo không tính căn delta của số âm
	        if (delta > 0) {
	            // Tính căn delta
	            double canDelta = Math.sqrt(delta);
	
	            // Xuất căn delta ra màn hình
	            System.out.printf("Căn delta là: %.2f%n", canDelta);
	        } else {
	            System.out.println("Delta là số âm hoặc bằng không, không thể tính căn delta trong tập số thực.");
	        }
        }while(delta <= 0);

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
        
	}

}

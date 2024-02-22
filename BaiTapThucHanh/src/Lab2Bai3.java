import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        // Khai báo biến
        int soDien;
        double tien;

        // Nhập số điện sử dụng từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        soDien = scanner.nextInt();

        // Tính tiền điện
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        // Hiển thị tổng tiền
        System.out.println("Tiền điện phải trả: " + tien);
        
		// Đóng Scanner để tránh rò rỉ bộ nhớ
		scanner.close();
    }
}

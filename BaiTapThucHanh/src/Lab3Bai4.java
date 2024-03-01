import java.util.Scanner;

public class Lab3Bai4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng họ tên và điểm
        String[] hoTen = new String[n];
        double[] diem = new double[n];
        String[] hocLuc = new String[n];

        // Nhập thông tin họ tên và điểm của sinh viên
        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // Loại bỏ ký tự xuống dòng thừa
            System.out.print("Nhập họ tên của sinh viên thứ " + (i + 1) + ": ");
            hoTen[i] = scanner.nextLine();
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            diem[i] = scanner.nextDouble();

            // Xác định học lực
            if (diem[i] < 5) {
                hocLuc[i] = "Yếu";
            } else if (diem[i] < 6.5) {
                hocLuc[i] = "Trung bình";
            } else if (diem[i] < 7.5) {
                hocLuc[i] = "Khá";
            } else if (diem[i] < 9) {
                hocLuc[i] = "Giỏi";
            } else {
                hocLuc[i] = "Xuất sắc";
            }
        }

        // Xuất thông tin của sinh viên
        System.out.println("\nDanh sách sinh viên:");
        System.out.println("Họ tên\t\t\tĐiểm\t\tHọc lực");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-24s%-16.2f%-20s%n", hoTen[i], diem[i], hocLuc[i]);
        }

        // Sắp xếp danh sách sinh viên theo điểm
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    // Hoán đổi thông tin của sinh viên i và j
                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;
                    String tempHocLuc = hocLuc[i];
                    hocLuc[i] = hocLuc[j];
                    hocLuc[j] = tempHocLuc;
                }
            }
        }

        // Xuất danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm:");
        System.out.println("Họ tên\t\t\tĐiểm\t\tHọc lực");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-24s%-16.2f%-20s%n", hoTen[i], diem[i], hocLuc[i]);
        }

        scanner.close();

	}

}

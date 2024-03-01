import java.util.Scanner;

public class Lab2Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);
        scanner.close();
    }

    public static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
    }

    public static void giaiPTB1() {
        double a, b, x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Vô số nghiệm");
            } else {
                System.out.println("Vô nghiệm");
            }
        } else {
            System.out.printf("x = %.2f%n", x = -b / a);
        }

        // Không đóng Scanner ở đây
    }

    public static void giaiPTB2() {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, x1, x2;
        double delta;

        System.out.print("Nhập hệ số a: ");
        a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        c = scanner.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Vô số nghiệm");
                } else {
                    System.out.println("Vô nghiệm");
                }
            } else {
                System.out.printf("x = %.2f%n", x1 = -c / b);
            }
        } else {
            if (delta < 0) {
                System.out.println("Vô nghiệm");
            } else if (delta == 0) {
                System.out.printf("x = %.2f%n", x1 = -b / (2 * a));
            } else {
                double canDelta = Math.sqrt(delta);

                System.out.printf("x1 = %.2f%n", x1 = (-b + canDelta) / (2 * a));
                System.out.printf("x2 = %.2f%n", x2 = (-b - canDelta) / (2 * a));
            }
        }

        // Không đóng Scanner ở đây
    }

    public static void tinhTienDien() {
        int soDien;
        double tien;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        soDien = scanner.nextInt();

        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("Tiền điện phải trả: " + tien);

        // Không đóng Scanner ở đây
    }

}

import java.util.Scanner;

public class Lab3Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        // Kiểm tra xem số có phải là số nguyên tố hay không
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }

        scanner.close();
	}

}

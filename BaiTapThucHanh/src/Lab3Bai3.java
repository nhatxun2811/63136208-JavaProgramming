
import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập mảng số nguyên từ bàn phím
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        // Sắp xếp và xuất mảng
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Xuất phần tử nhỏ nhất
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);

        // Tính trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + average);

        scanner.close();
	}
}


import java.util.Scanner;

public class exercise5 {
    // Tính Tổng Các Phần Tử của Mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng");
        for (int j : arr) {
            System.out.println(j + ",");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Tổng các phần tử của mảng là " +  sum);
    }
}

import java.util.Scanner;

// tim ptu trung lap
public class exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Mảng ");
        for (int j : arr) {
            System.out.println(j + ",");
        }

        System.out.println("Phần tử trùng lặp trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
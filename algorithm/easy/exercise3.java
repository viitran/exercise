import java.util.Scanner;

//tim so nguyen to 
public class exercise3 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

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
            System.out.print(j + ",");
        }

        System.out.println("Số nguyên tố trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
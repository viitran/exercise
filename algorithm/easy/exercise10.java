import java.util.Scanner;

public class exercise10 {
    public static int calculateSumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số nguyên dương bất kỳ");
        int num = Integer.parseInt(sc.nextLine());
        int sumOfDigits = calculateSumOfDigits(num);
        System.out.println("Tổng các chữ số của " + num + " là: " + sumOfDigits);
    }

}
import java.util.Scanner;
// tinh giai thua
public class exercise7 {
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập 1 số nguyên dương bất kỳ");
        int numb = Integer.parseInt(sc.nextLine());

        int factorial = calculateFactorial(numb);

        System.out.println("Giai thừa của " + numb + " là: " + factorial);
    }

}
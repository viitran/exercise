import java.util.Scanner;
public class exercise9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương thứ nhất");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số nguyên dương thứ hai");
        int num2 = Integer.parseInt(sc.nextLine());
        int ucln = calculateUCLN(num1, num2);
        
        System.out.println("Ước số chung lớn nhất của " + num1 + " và " + num2 + " là: " + ucln);
    }
    public static int calculateUCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateUCLN(b, a % b);
        }
    }
}
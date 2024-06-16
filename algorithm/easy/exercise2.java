
import java.util.Scanner;

public class exercise2 {
    // đảo ngược chuỗi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Chuỗi sau khi đảo ngược: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

import java.util.Scanner;
//check chuoi palindrome
class exercise8 {
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kỳ");
        String str = sc.nextLine();
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println("Chuỗi " + str + " là palindrome");
        } else {
            System.out.println("Chuỗi " + str + " không phải là palindrome");
        }
    }

}
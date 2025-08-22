import java.util.Scanner;
public class lesson10z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        if (isPalindrome(inputString)) {
            System.out.println("Строка \"" + inputString + "\" является палиндромом.");
        } else {
            System.out.println("Строка \"" + inputString + "\" не является палиндромом.");
        }
        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

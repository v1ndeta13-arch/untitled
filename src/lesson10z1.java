import java.util.Scanner;
public class lesson10z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        int length = inputString.length();
        System.out.println("Количество символов в строке: " + length);
        scanner.close();
    }
}

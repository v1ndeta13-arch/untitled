import java.util.Scanner;
public class lesson6z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Введите 5 чисел:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("Сумма введенных чисел: " + sum);

        scanner.close();
    }
}


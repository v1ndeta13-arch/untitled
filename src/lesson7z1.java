import java.util.Scanner;
public class lesson7z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int numStudents = scanner.nextInt();

        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Введите оценку для студента " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        double average = calculateAverage(grades);
        System.out.println("Средний балл: " + average);

        scanner.close();
    }

    public static double calculateAverage(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}

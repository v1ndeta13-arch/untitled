import java.util.Scanner;
public class lesson7z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества оценок
        System.out.print("Введите количество оценок: ");
        int numGrades = scanner.nextInt();

        // Проверка на корректность ввода
        if (numGrades <= 0) {
            System.out.println("Количество оценок должно быть положительным числом.");
            return;
        }

        // Создание массива для хранения оценок
        double[] grades = new double[numGrades];

        // Ввод оценок
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Введите оценку " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();

            // Валидация введенной оценки (0-5)
            if (grades[i] < 0 || grades[i] > 5) {
                System.out.println("Ошибка: Оценка должна быть в диапазоне от 0 до 5.");
                return; // Завершаем программу, если оценка некорректна.
            }
        }

        // Вычисление среднего балла
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double averageGrade = sum / numGrades;

        // Вывод среднего балла
        System.out.println("Средний балл: " + averageGrade);

        // Определение отличника
        if (averageGrade >= 4.5) {
            System.out.println("Ученик - отличник!");
        } else {
            System.out.println("Ученик не отличник.");
        }

        scanner.close();
    }
}

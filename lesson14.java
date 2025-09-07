public class lesson14 {
    public static double calculateAverage(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null или пустым.");
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) {
        double[] myNumbers = {1.5, 2.5, 3.0, 4.5, 5.0};
        double average = calculateAverage(myNumbers);
        System.out.println("Среднее значение массива: " + average);
        double[] emptyArray = {};
        try {
            calculateAverage(emptyArray);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


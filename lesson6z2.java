public class lesson6z2 {
    public static void main(String[] args) {
        int[] array = {7, 4, 9, 1, 8, 6};

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }
}

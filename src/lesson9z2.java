public class lesson9z2 {
    /**
     * Проверяет, является ли заданное число простым.
     * Простое число — это натуральное число больше 1,
     * которое делится без остатка только на 1 и на само себя [2, 4].
     *
     * @param number Число для проверки.
     * @return true, если число простое, иначе false.
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        int num3 = 2;
        System.out.println(num1 + " простое? " + isPrime(num1));
        System.out.println(num2 + " простое? " + isPrime(num2));
        System.out.println(num3 + " простое? " + isPrime(num3));
    }
}

